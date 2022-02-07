package br.com.fiap.tds2.fase1.exceptions;

@SuppressWarnings("serial")
public class LoginExpiradoException extends Exception {

	public LoginExpiradoException() {
	}

	public LoginExpiradoException(String message) {
		super(message);
	}

	public LoginExpiradoException(Throwable cause) {
		super(cause);
	}

	public LoginExpiradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginExpiradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
