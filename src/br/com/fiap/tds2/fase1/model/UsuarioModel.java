package br.com.fiap.tds2.fase1.model;

public class UsuarioModel {

	private String login;
	
	private String senha;
	
	private String nome;
	
	public UsuarioModel() {
		super();
	}
	
	public UsuarioModel(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public UsuarioModel(String login, String senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "UsuarioModel [login=" + login + ", senha=" + senha + ", nome=" + nome + "]";
	}
	
	
	
}
