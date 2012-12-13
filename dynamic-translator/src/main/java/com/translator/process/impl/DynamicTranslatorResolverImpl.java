package com.translator.process.impl;

import java.util.HashSet;
import java.util.Set;

import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;
import com.translator.process.DynamicTranslatorLoader;
import com.translator.process.DynamicTranslatorResolver;

public class DynamicTranslatorResolverImpl implements DynamicTranslatorResolver{
	

	private DynamicTranslatorLoader loader = new SimpleDynamicTranslatorLoader();
	private static final String ENVIRONMENT = "SIMULADOR";

	public Set<DynamicTranslator> resolve(ContextTranslation contextTranslation) {
		Set<DynamicTranslator> translators = loader.loadAllTranslators();
		Set<DynamicTranslator> result = filterTranslatorsFrom(contextTranslation.getOriginalObject(), translators);
		result = filterTranslatorsTo(contextTranslation.getTranslatedObject(), result);
		result = filterTranslatorsByEnvironment(ENVIRONMENT, result);
		return result;
	}
	
	private Set<DynamicTranslator> filterTranslatorsFrom(Object object, Set<DynamicTranslator> translators){
		Set<DynamicTranslator> result = new HashSet<DynamicTranslator>();
		for (DynamicTranslator dynamicTranslator : translators) {
			if(dynamicTranslator.isTranslatorOf(object)){
				result.add(dynamicTranslator);
			}
		}
		return result;
	}
	
	private Set<DynamicTranslator> filterTranslatorsTo(Object object, Set<DynamicTranslator> translators){
		Set<DynamicTranslator> result = new HashSet<DynamicTranslator>();
		for (DynamicTranslator dynamicTranslator : translators) {
			if(dynamicTranslator.isTranslatorTo(object)){
				result.add(dynamicTranslator);
			}
		}
		return result;
	}
	
	
	private Set<DynamicTranslator> filterTranslatorsByEnvironment(String environment, Set<DynamicTranslator> translators){
		Set<DynamicTranslator> result = new HashSet<DynamicTranslator>();
		for (DynamicTranslator dynamicTranslator : translators) {
			if(dynamicTranslator.isEnvironment(environment)){
				result.add(dynamicTranslator);
			}
		}
		return result;
	}
}
