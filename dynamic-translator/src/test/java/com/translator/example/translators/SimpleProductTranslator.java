package com.translator.example.translators;

import com.translator.annotation.Translator;
import com.translator.example.model.brm.BRMProduct;
import com.translator.example.model.sga.SGAProduct;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;

@Translator(from=BRMProduct.class, to=SGAProduct.class, environment="SIMULADOR", description="Tradutor de campos simples de produto")
public class SimpleProductTranslator extends DynamicTranslator{

	@Override
	public void doProcess(ContextTranslation contextTranslation) {
		BRMProduct brmProduct = (BRMProduct) contextTranslation.getOriginalObject();
		SGAProduct sgaProduct = (SGAProduct) contextTranslation.getTranslatedObject();
		
		sgaProduct.setBusinness_plan(brmProduct.getBusinness_plan());
		sgaProduct.setCreated_t(brmProduct.getCreated_t());
		sgaProduct.setCurrency(brmProduct.getCurrency());
		sgaProduct.setDescr(brmProduct.getDescr());
		sgaProduct.setEnd_t(brmProduct.getEnd_t());
		sgaProduct.setEvent_type(brmProduct.getEvent_type());
		sgaProduct.setFlag_prorata(brmProduct.getFlag_prorata());
	}



}
