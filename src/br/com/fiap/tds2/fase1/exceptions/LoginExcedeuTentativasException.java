package br.com.fiap.tds2.fase1.exceptions;

@SuppressWarnings("serial")
public class LoginExcedeuTentativasException extends Exception {

	public LoginExcedeuTentativasException() {
	}

	public LoginExcedeuTentativasException(String message) {
		super(message);
	}

	public LoginExcedeuTentativasException(Throwable cause) {
		super(cause);
	}

	public LoginExcedeuTentativasException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginExcedeuTentativasException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
