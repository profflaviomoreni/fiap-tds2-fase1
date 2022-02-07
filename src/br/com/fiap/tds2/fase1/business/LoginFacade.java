package br.com.fiap.tds2.fase1.business;

import br.com.fiap.tds2.fase1.exceptions.LoginAtivoException;
import br.com.fiap.tds2.fase1.exceptions.LoginExcedeuTentativasException;
import br.com.fiap.tds2.fase1.exceptions.LoginExpiradoException;
import br.com.fiap.tds2.fase1.exceptions.LoginInvalidoException;
import br.com.fiap.tds2.fase1.exceptions.LoginIpInvalidoException;
import br.com.fiap.tds2.fase1.model.UsuarioModel;

public class LoginFacade {

	private LoginBusiness loginBusiness = new LoginBusiness();
	
	public void loginWeb(UsuarioModel usuarioModel) throws 
			LoginAtivoException, 
			LoginExcedeuTentativasException, 
			LoginExpiradoException, 
			LoginIpInvalidoException, 
			LoginInvalidoException {
		
		loginBusiness.validarUsuarioAtivo(usuarioModel);
		loginBusiness.validarTentativasdeLogin(usuarioModel);
		loginBusiness.validarUsuarioExpirado(usuarioModel);
		loginBusiness.validarIp(usuarioModel);
		loginBusiness.validarLogin(usuarioModel);
		
	}
	
	public void loginMobile(UsuarioModel usuarioModel) throws 
			LoginAtivoException, 
			LoginExcedeuTentativasException, 
			LoginExpiradoException, 
			LoginInvalidoException {

		loginBusiness.validarUsuarioAtivo(usuarioModel);
		loginBusiness.validarTentativasdeLogin(usuarioModel);
		loginBusiness.validarUsuarioExpirado(usuarioModel);
		loginBusiness.validarLogin(usuarioModel);
		
	}
	
}
