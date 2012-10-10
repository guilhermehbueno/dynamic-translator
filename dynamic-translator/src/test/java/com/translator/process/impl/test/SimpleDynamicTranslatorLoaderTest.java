package com.translator.process.impl.test;

import com.translator.example.translators.SimpleProductTranslator;
import com.translator.process.impl.SimpleDynamicTranslatorLoader;

import junit.framework.TestCase;

public class SimpleDynamicTranslatorLoaderTest extends TestCase {
	
	private static SimpleDynamicTranslatorLoader loader = new SimpleDynamicTranslatorLoader();

	public void testAddDynamicTranslator() {
		assertTrue(loader.addDynamicTranslator(new SimpleProductTranslator()));
	}

	public void testLoadAllTranslators() {
		assertTrue(loader.loadAllTranslators()!=null);
		assertTrue(loader.loadAllTranslators().size() > 0);
	}

}
