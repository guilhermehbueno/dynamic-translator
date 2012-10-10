package com.translator.example.model.brm;


/**
 * Representa um plano do portfólio de produtos
 * 
 * @author Wagner Renzi
 * 
 */
public class BRMDeal{

	private String deal_obj;
	private String created_t;
	private String mod_t;
	private String deal_name;
	private String descr;
	private String status;
	private BRMProduct product;
	private BRMDiscount discounts;
	
	public String getDeal_obj() {
		return deal_obj;
	}
	public void setDeal_obj(String deal_obj) {
		this.deal_obj = deal_obj;
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
	public String getDeal_name() {
		return deal_name;
	}
	public void setDeal_name(String deal_name) {
		this.deal_name = deal_name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BRMProduct getProduct() {
		return product;
	}
	public void setProduct(BRMProduct product) {
		this.product = product;
	}
	public BRMDiscount getDiscounts() {
		return discounts;
	}
	public void setDiscounts(BRMDiscount discounts) {
		this.discounts = discounts;
	}
}
