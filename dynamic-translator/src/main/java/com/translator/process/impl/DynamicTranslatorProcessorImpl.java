package com.translator.process.impl;

import java.util.Set;

import org.apache.log4j.Logger;

import com.translator.exception.TranslationException;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;
import com.translator.process.DynamicTranslatorProcessor;
import com.translator.process.DynamicTranslatorResolver;

public class DynamicTranslatorProcessorImpl implements DynamicTranslatorProcessor{
	
	private static final Logger log = Logger.getLogger(DynamicTranslatorProcessorImpl.class);
	private DynamicTranslatorResolver translatorResolver = new DynamicTranslatorResolverImpl();

	public void processTranslate(ContextTranslation contextTranslation) throws TranslationException {
		Set<DynamicTranslator> translators = translatorResolver.resolve(contextTranslation);
		if(translators== null || translators.size()<=0){
			throw new IllegalStateException("É necessário ao menos um tradutor por entidade, segue instruções: \n"+ formatMensagem(contextTranslation));
		}
		
		for (DynamicTranslator dynamicTranslator : translators) {
			dynamicTranslator.process(contextTranslation);
		}
	}
	
	private String formatMensagem(ContextTranslation contextTranslation){
		String from = contextTranslation.getOriginalObject().getClass().getSimpleName();
		String to = contextTranslation.getTranslatedObject().getClass().getSimpleName();
		StringBuilder sb  = new StringBuilder();
		sb.append("Será necessário a criação de um tradutor com a seguinte característica: \n");
		sb.append("\t@Translator(from="+from+".class, to="+to+".class, environment=\"SGA ou BRM\", description=\"Tradução de "+from+" para "+to+"\")\n");
		sb.append("Lembrando que esta classe deve extender DynamicTranslator e implementar as regras de tradução no método doProcess(ContextTranslation contextTranslation)");
		return sb.toString();
	}
}
