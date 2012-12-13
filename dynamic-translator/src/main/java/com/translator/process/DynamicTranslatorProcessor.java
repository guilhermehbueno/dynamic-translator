package com.translator.process;

import com.translator.exception.TranslationException;

public interface DynamicTranslatorProcessor {
	
	void processTranslate(ContextTranslation contextTranslation) throws TranslationException;

}
