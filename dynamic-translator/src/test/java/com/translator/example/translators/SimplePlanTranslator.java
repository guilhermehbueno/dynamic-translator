package com.translator.example.translators;

import com.translator.annotation.Translator;
import com.translator.example.model.brm.BRMPlan;
import com.translator.example.model.sga.SGAPlan;
import com.translator.process.ContextTranslation;
import com.translator.process.DynamicTranslator;

@Translator(from=BRMPlan.class, to=SGAPlan.class, environment="SIMULADOR", description="Tradutor de campos simples de produto")
public class SimplePlanTranslator extends DynamicTranslator{

	@Override
	public void doProcess(ContextTranslation contextTranslation) {
		BRMPlan brmPlan = (BRMPlan) contextTranslation.getOriginalObject();
		SGAPlan sgaPlan = (SGAPlan) contextTranslation.getTranslatedObject();
	}
}
