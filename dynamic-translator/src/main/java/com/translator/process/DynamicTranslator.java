package com.translator.process;

import org.apache.log4j.Logger;

import com.translator.annotation.Translator;
import com.translator.exception.TranslationException;

public abstract class DynamicTranslator {
	

	Logger logger = Logger.getLogger(DynamicTranslator.class);
	
	public final ContextTranslation process(ContextTranslation contextTranslation) throws TranslationException {
		Translator translator = this.getClass().getAnnotation(Translator.class);
		logger.debug("* Iniciando tradução de: "+this.getClass().getSimpleName());
		logger.debug("\tfrom: "+translator.from()+" \n\tto: "+ translator.to() +" \n\tdescription: "+translator.description());
		doProcess(contextTranslation);
		logger.debug("\n");
		return contextTranslation;
	}

	public abstract void doProcess(ContextTranslation contextTranslation) throws TranslationException ;
	
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
	
	public boolean isEnvironment(String environmentName){
		Translator translator = this.getClass().getAnnotation(Translator.class);
		return translator.environment().equalsIgnoreCase(environmentName);
	}
	
	private boolean isTranslator(){
		return this.getClass().isAnnotationPresent(Translator.class);
	}

	@Override
	public boolean equals(Object obj) {
		if( obj == null){
			return false;
		}
		return this.getClass().getName().equals(obj.getClass().getName());
		
	}
	@Override
	public int hashCode(){
		return this.getClass().getName().hashCode();
		
	}
}
