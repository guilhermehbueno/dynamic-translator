package com.translator.example.model.sga;

import java.util.List;

/**
 * Representa um plano do portfólio de produtos
 * 
 * @author Wagner Renzi
 * 
 */
public class SGAPlan{

	private String plan_obj;
	private String created_t;
	private String mod_t;
	private String name;
	private String descr;
	private String ig_fld_tariff_code;
	private String familia;
	private String marca;
	private String tipo_pessoa;
	private String idade_minima;
	private String termo_uso;
	private String termo_promocional;
	private String pre_venda;
	private String motivo_cancelamento;
	private String configuracao_completa;
	private String cancelamento_velox;
	private String operadora;
	private String mercado;
	private String categoria;
	private String subcategoria;
	private SGACanaisVenda canais_venda;
	private String cidade;
	private String estado;
	private SGAPaymentMethod metodo_pagamento;
	private String regiao_anatel;
	private List<SGADeal> deals;
	
	public String getPlan_obj() {
		return plan_obj;
	}
	public void setPlan_obj(String plan_obj) {
		this.plan_obj = plan_obj;
	}
	public String getCreated_t() {
		return created_t;
	}
	public void setCreated_t(String created_t) {
		this.created_t = created_t;
	}
	public String getMod_t() {
		return mod_t;
	}
	public void setMod_t(String mod_t) {
		this.mod_t = mod_t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getIg_fld_tariff_code() {
		return ig_fld_tariff_code;
	}
	public void setIg_fld_tariff_code(String ig_fld_tariff_code) {
		this.ig_fld_tariff_code = ig_fld_tariff_code;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo_pessoa() {
		return tipo_pessoa;
	}
	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}
	public String getIdade_minima() {
		return idade_minima;
	}
	public void setIdade_minima(String idade_minima) {
		this.idade_minima = idade_minima;
	}
	public String getTermo_uso() {
		return termo_uso;
	}
	public void setTermo_uso(String termo_uso) {
		this.termo_uso = termo_uso;
	}
	public String getTermo_promocional() {
		return termo_promocional;
	}
	public void setTermo_promocional(String termo_promocional) {
		this.termo_promocional = termo_promocional;
	}
	public String getPre_venda() {
		return pre_venda;
	}
	public void setPre_venda(String pre_venda) {
		this.pre_venda = pre_venda;
	}
	public String getMotivo_cancelamento() {
		return motivo_cancelamento;
	}
	public void setMotivo_cancelamento(String motivo_cancelamento) {
		this.motivo_cancelamento = motivo_cancelamento;
	}
	public String getConfiguracao_completa() {
		return configuracao_completa;
	}
	public void setConfiguracao_completa(String configuracao_completa) {
		this.configuracao_completa = configuracao_completa;
	}
	public String getCancelamento_velox() {
		return cancelamento_velox;
	}
	public void setCancelamento_velox(String cancelamento_velox) {
		this.cancelamento_velox = cancelamento_velox;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getMercado() {
		return mercado;
	}
	public void setMercado(String mercado) {
		this.mercado = mercado;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public SGACanaisVenda getCanais_venda() {
		return canais_venda;
	}
	public void setCanais_venda(SGACanaisVenda canais_venda) {
		this.canais_venda = canais_venda;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public SGAPaymentMethod getMetodo_pagamento() {
		return metodo_pagamento;
	}
	public void setMetodo_pagamento(SGAPaymentMethod metodo_pagamento) {
		this.metodo_pagamento = metodo_pagamento;
	}
	public String getRegiao_anatel() {
		return regiao_anatel;
	}
	public void setRegiao_anatel(String regiao_anatel) {
		this.regiao_anatel = regiao_anatel;
	}
	public List<SGADeal> getDeals() {
		return deals;
	}
	public void setDeals(List<SGADeal> deals) {
		this.deals = deals;
	}
}
