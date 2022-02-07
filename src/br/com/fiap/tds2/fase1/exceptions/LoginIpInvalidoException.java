package br.com.fiap.tds2.fase1.exceptions;

@SuppressWarnings("serial")
public class LoginIpInvalidoException extends Exception {

	public LoginIpInvalidoException() {
	}

	public LoginIpInvalidoException(String message) {
		super(message);
	}

	public LoginIpInvalidoException(Throwable cause) {
		super(cause);
	}

	public LoginIpInvalidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginIpInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
