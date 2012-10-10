package com.translator.process;

import java.util.Set;

public interface DynamicTranslatorLoader {
	
	Set<DynamicTranslator> loadAllTranslators();

}
