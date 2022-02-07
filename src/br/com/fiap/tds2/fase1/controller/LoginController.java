package br.com.fiap.tds2.fase1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.fiap.tds2.fase1.exceptions.LoginAtivoException;
import br.com.fiap.tds2.fase1.exceptions.LoginExcedeuTentativasException;
import br.com.fiap.tds2.fase1.exceptions.LoginExpiradoException;
import br.com.fiap.tds2.fase1.exceptions.LoginInvalidoException;
import br.com.fiap.tds2.fase1.exceptions.LoginIpInvalidoException;
import br.com.fiap.tds2.fase1.model.UsuarioModel;
import br.com.fiap.tds2.fase1.business.LoginFacade;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	
	
	private static final Logger LOGGER = LogManager.getLogger(LoginController.class.getName());
	
	private final LoginFacade loginFacade = new LoginFacade();


	public LoginController() {
        super();
    }

    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try { 
			
			UsuarioModel usuarioModel = new UsuarioModel();
			usuarioModel.setLogin(request.getParameter("login"));
			usuarioModel.setSenha(request.getParameter("senha"));
			
			loginFacade.loginWeb(usuarioModel);
			
			RequestDispatcher despachar = request.getRequestDispatcher("home.jsp");
			despachar.forward(request, response);
			
		} catch ( LoginAtivoException | LoginExcedeuTentativasException | LoginExpiradoException| LoginInvalidoException | LoginIpInvalidoException  e) {
			LOGGER.error(e.getMessage());
			response.sendRedirect("erro.jsp?msg=" + e.getMessage());
	    } catch (Exception e) {
	    	LOGGER.error("Ocorreu um erro muito crítico, desconhecido pela aplicação");
			response.sendRedirect("erro.jsp?msg=Erro crítico");
		}
	}

    
    private void validarLogin(UsuarioModel usuarioModel) throws LoginInvalidoException {
		if ( ! usuarioModel.getLogin().equals("ok@mail.com") || !usuarioModel.getSenha().equals("123") ) {
			throw new LoginInvalidoException("Usuário ou senha incorreta");
		}
		
	}
	
	private void validarUsuarioAtivo(UsuarioModel usuarioModel) throws LoginAtivoException {
		if ( usuarioModel.getLogin().equals("login.ativo@mail.com") ) {
			throw new LoginAtivoException("Usuário logado em outro equipamento");
		}
	}
	
	private void validarTentativasdeLogin(UsuarioModel usuarioModel) throws LoginExcedeuTentativasException {
		if ( usuarioModel.getLogin().equals("tentativas@mail.com") ) {
			throw new LoginExcedeuTentativasException("Tentativas excedidas");
		}
		
	}

	private void validarUsuarioExpirado(UsuarioModel usuarioModel) throws LoginExpiradoException {
		if ( usuarioModel.getLogin().equals("expirado@mail.com") ) {
			throw new LoginExpiradoException("Login expirado");
		}		
	}

	private void validarIp(UsuarioModel usuarioModel) throws LoginIpInvalidoException {
		if ( usuarioModel.getLogin().equals("ip@mail.com") ) {
			throw new LoginIpInvalidoException("Ip suspeito");
		}
		
	}

	
}
