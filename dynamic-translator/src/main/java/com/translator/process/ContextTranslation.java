package com.translator.process;

public class ContextTranslation {
	
	private final Object originalObject;
	private final Object translatedObject;
	
	private ContextTranslation(Object originalObject, Object translatedObject) {
		super();
		
		if(originalObject == null){
			throw new IllegalArgumentException("O translatedObject não pode ser nulo.");
		}
		
		if(translatedObject == null){
			throw new IllegalArgumentException("O translatedObject não pode ser nulo.");
		}
		
		this.originalObject = originalObject;
		this.translatedObject = translatedObject;
	}
	
	public Object getOriginalObject() {
		return originalObject;
	}

	public Object getTranslatedObject() {
		return translatedObject;
	}
	
	public static ContextTranslationBuilder from(Object original){
		return new ContextTranslationBuilder(original);
	}
	
	public static class ContextTranslationBuilder{
		private Object original;
		private Object translated;
		
		private ContextTranslationBuilder(Object original) {
			super();
			
			if(original == null){
				throw new IllegalArgumentException("O originalObject não pode ser nulo.");
			}
			
			this.original = original;
		}

		public ContextTranslationBuilder to(Object translated){
			if(translated == null){
				throw new IllegalArgumentException("O translatedObject não pode ser nulo.");
			}
			
			
			this.translated = translated;
			return this;
		}
		
		public ContextTranslation build(){
			return new ContextTranslation(this.original, this.translated);
		}
	}

	@Override
	public String toString() {
		return "ContextTranslation [originalObject=" + originalObject
				+ ", translatedObject=" + translatedObject + "]";
	}
}
