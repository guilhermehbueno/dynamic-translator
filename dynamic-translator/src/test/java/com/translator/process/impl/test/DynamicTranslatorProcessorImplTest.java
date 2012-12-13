package com.translator.process.impl.test;

import com.translator.example.model.brm.BRMProduct;
import com.translator.example.model.sga.SGAProduct;
import com.translator.example.translators.ComplexProductTranslator;
import com.translator.example.translators.ComplexProductTranslatorProductionEnvironment;
import com.translator.example.translators.SimplePlanTranslator;
import com.translator.example.translators.SimpleProductTranslator;
import com.translator.exception.TranslationException;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslatorProcessor;
import com.translator.process.impl.DynamicTranslatorProcessorImpl;
import com.translator.process.impl.SimpleDynamicTranslatorLoader;

import junit.framework.TestCase;

public class DynamicTranslatorProcessorImplTest extends TestCase {
	
	private static DynamicTranslatorProcessor processor = new DynamicTranslatorProcessorImpl();

	public void testProcessTranslate() throws TranslationException {
		/*Os tradutores poderão ser carregados de diferentes formas*/
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimplePlanTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new SimpleProductTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new ComplexProductTranslator());
		SimpleDynamicTranslatorLoader.addDynamicTranslator(new ComplexProductTranslatorProductionEnvironment());
		
		/*Objeto retornado pelo serviço do BRM*/
		BRMProduct brmProduct = new BRMProduct();
		
		/*Objeto que representa o nosso modelo*/
		SGAProduct sgaProduct = new SGAProduct();
		
		brmProduct.setBusinness_plan("MMMM");
		brmProduct.setId_1_externo_produto("KKKKKKK");
		
		/*ContextTranslation irá agregar o objeto original recebido + o que iremos traduzir*/
		ContextTranslation translation = ContextTranslation.from(brmProduct).to(sgaProduct).build();
		
		/*Percorre todos os tradutores correspondentes e faz a tradução*/
		processor.processTranslate(translation);
		
		assertEquals(brmProduct.getBusinness_plan(), sgaProduct.getBusinness_plan());
		assertEquals(brmProduct.getId_1_externo_produto(), sgaProduct.getId_1_externo_produto());
	}

}
