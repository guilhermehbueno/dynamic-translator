package com.translator.process;

public class ContextTranslation {
	
	private final Object originalObject;
	private final Object translatedObject;
	
	public ContextTranslation(Object originalObject, Object translatedObject) {
		super();
		this.originalObject = originalObject;
		this.translatedObject = translatedObject;
	}

	public Object getOriginalObject() {
		return originalObject;
	}

	public Object getTranslatedObject() {
		return translatedObject;
	}
}
