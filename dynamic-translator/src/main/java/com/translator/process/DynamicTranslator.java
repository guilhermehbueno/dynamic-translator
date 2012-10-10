package com.translator.process;

import com.translator.annotation.Translator;

public abstract class DynamicTranslator {
	
	public final void process(ContextTranslation contextTranslation){
		Translator translator = this.getClass().getAnnotation(Translator.class);
		System.out.println("Iniciando translation from: "+translator.from()+" to: "+ translator.to() +" description: "+translator.description());
		doProcess(contextTranslation);
		System.out.println("Finalizando translation from: "+translator.from()+" to: "+ translator.to() +" description: "+translator.description());
	}

	public abstract void doProcess(ContextTranslation contextTranslation);
	
	public boolean isTranslatorOf(Object originalObject){
		if(!isTranslator()){
			return false;
		}
		
		Translator translator = this.getClass().getAnnotation(Translator.class);
		return translator.from().getName().equals(originalObject.getClass().getName());
	}
	
	public boolean isTranslatorTo(Object translatedObject){
		if(!isTranslator()){
			return false;
		}
		
		Translator translator = this.getClass().getAnnotation(Translator.class);
		return translator.to().getName().equals(translatedObject.getClass().getName());
	}
	
	
	private boolean isTranslator(){
		return this.getClass().isAnnotationPresent(Translator.class);
	}
}
