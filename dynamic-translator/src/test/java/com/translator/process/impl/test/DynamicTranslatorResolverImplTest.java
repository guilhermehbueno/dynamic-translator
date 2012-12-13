package com.translator.process.impl.test;

import java.util.Set;

import com.translator.example.model.brm.BRMProduct;
import com.translator.example.model.sga.SGAProduct;
import com.translator.example.translators.ComplexProductTranslator;
import com.translator.example.translators.SimplePlanTranslator;
import com.translator.example.translators.SimpleProductTranslator;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;
import com.translator.process.DynamicTranslatorResolver;
import com.translator.process.impl.DynamicTranslatorResolverImpl;
import com.translator.process.impl.SimpleDynamicTranslatorLoader;

import junit.framework.TestCase;

public class DynamicTranslatorResolverImplTest extends TestCase {
	
	private static DynamicTranslatorResolver resolver = new DynamicTranslatorResolverImpl();

	public void testResolve() {
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimplePlanTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimpleProductTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new ComplexProductTranslator());
		
		BRMProduct brmProduct = new BRMProduct();
		SGAProduct sgaProduct = new SGAProduct();
		
		ContextTranslation translation = ContextTranslation.from(brmProduct).to(sgaProduct).build();
		Set<DynamicTranslator> translators =  resolver.resolve(translation);
		assertTrue(translators.size()==2);
	}

}
