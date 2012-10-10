package com.translator.process.impl;

import java.util.HashSet;
import java.util.Set;

import com.translator.process.DynamicTranslator;
import com.translator.process.DynamicTranslatorLoader;

/**
 * Classe básica que retornará todos os translators instanciados manualmente
 * @author tr_gbueno
 *
 */
public class SimpleDynamicTranslatorLoader implements DynamicTranslatorLoader{
	
	private static final Set<DynamicTranslator> translators = new HashSet<DynamicTranslator>();
	
	static{
		//TODO: INICIA TRANSLATORS MANUALMENTE
	}
	
	public static boolean addDynamicTranslator(DynamicTranslator translator){
		return translators.add(translator);
	}

	public Set<DynamicTranslator> loadAllTranslators() {
		return translators;
	}
}
