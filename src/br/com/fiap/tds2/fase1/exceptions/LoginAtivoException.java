package br.com.fiap.tds2.fase1.exceptions;

@SuppressWarnings("serial")
public class LoginAtivoException extends Exception {

	public LoginAtivoException() {
	}

	public LoginAtivoException(String message) {
		super(message);
	}

	public LoginAtivoException(Throwable cause) {
		super(cause);
	}

	public LoginAtivoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginAtivoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
