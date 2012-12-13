package com.translator.example.translators;

import com.translator.annotation.Translator;
import com.translator.example.model.brm.BRMProduct;
import com.translator.example.model.sga.SGAProduct;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;

@Translator(from=BRMProduct.class, to=SGAProduct.class, environment="BRM", description="Tradutor de campos complexos de produto no ambiente do BRM")
public class ComplexProductTranslatorProductionEnvironment extends DynamicTranslator{

	@Override
	public void doProcess(ContextTranslation contextTranslation) {
		BRMProduct brmProduct = (BRMProduct) contextTranslation.getOriginalObject();
		SGAProduct sgaProduct = (SGAProduct) contextTranslation.getTranslatedObject();
		
		sgaProduct.setId_1_externo_produto(brmProduct.getId_1_externo_produto());
		sgaProduct.setId_2_externo_produto(brmProduct.getId_2_externo_produto());
		sgaProduct.setIg_fld_item_account(brmProduct.getIg_fld_item_account());
	}
}
