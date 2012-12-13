package com.translator.exception;

/**
 * Exceção lançada quando há qualquer problema de tradução na camada de integração
 * @author jnaves
 *
 */
public class TranslationException extends Exception {
	private static final long serialVersionUID = 201209261404L;
	
	public TranslationException() {
		super();
	}
	
	public TranslationException(Throwable t) {
		super(t);
	}
	
	public TranslationException(String msg) {
		super(msg);
	}
	
}

