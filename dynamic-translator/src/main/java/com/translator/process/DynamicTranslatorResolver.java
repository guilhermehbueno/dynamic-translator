package com.translator.process;

import java.util.Set;

public interface DynamicTranslatorResolver {
	
	Set<DynamicTranslator> resolve(ContextTranslation contextTranslation);

}
