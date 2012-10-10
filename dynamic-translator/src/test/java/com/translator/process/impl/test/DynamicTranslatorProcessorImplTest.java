package com.translator.process.impl.test;

import com.translator.example.model.brm.BRMProduct;
import com.translator.example.model.sga.SGAProduct;
import com.translator.example.translators.ComplexProductTranslator;
import com.translator.example.translators.SimplePlanTranslator;
import com.translator.example.translators.SimpleProductTranslator;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslatorProcessor;
import com.translator.process.impl.DynamicTranslatorProcessorImpl;
import com.translator.process.impl.SimpleDynamicTranslatorLoader;

import junit.framework.TestCase;

public class DynamicTranslatorProcessorImplTest extends TestCase {
	
	private static DynamicTranslatorProcessor processor = new DynamicTranslatorProcessorImpl();

	public void testProcessTranslate() {
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimplePlanTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimpleProductTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new ComplexProductTranslator());
		
		BRMProduct brmProduct = new BRMProduct();
		SGAProduct sgaProduct = new SGAProduct();
		
		brmProduct.setBusinness_plan("MMMM");
		brmProduct.setId_1_externo_produto("KKKKKKK");
		
		ContextTranslation translation = new  ContextTranslation(brmProduct, sgaProduct);
		
		processor.processTranslate(translation);
		
		SGAProduct translatedProduct = (SGAProduct) translation.getTranslatedObject();
		assertEquals(brmProduct.getBusinness_plan(), translatedProduct.getBusinness_plan());
		assertEquals(brmProduct.getId_1_externo_produto(), translatedProduct.getId_1_externo_produto());
	}

}
