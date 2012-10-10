package com.translator.process.impl;

import java.util.Set;

import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;
import com.translator.process.DynamicTranslatorProcessor;
import com.translator.process.DynamicTranslatorResolver;

public class DynamicTranslatorProcessorImpl implements DynamicTranslatorProcessor{
	
	private DynamicTranslatorResolver translatorResolver = new DynamicTranslatorResolverImpl();

	public void processTranslate(ContextTranslation contextTranslation) {
		Set<DynamicTranslator> translators = translatorResolver.resolve(contextTranslation);
		for (DynamicTranslator dynamicTranslator : translators) {
			dynamicTranslator.process(contextTranslation);
		}
	}

}
