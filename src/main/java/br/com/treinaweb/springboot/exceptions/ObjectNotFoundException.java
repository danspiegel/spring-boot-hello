package br.com.treinaweb.springboot.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1428321092620832326L;
	
	public ObjectNotFoundException(String mensagem) {
		super(mensagem);
	}
	
	public ObjectNotFoundException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}

}
