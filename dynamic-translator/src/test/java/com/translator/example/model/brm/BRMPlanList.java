package com.translator.example.model.brm;

import java.util.List;


public class BRMPlanList{

	private String poid;
	private String created_t;
	private String mod_t;
	private String name;
	private String descr;
	private String status;
	private List<BRMPlan> plans;
	
	
	public String getPoid() {
		return poid;
	}
	public void setPoid(String poid) {
		this.poid = poid;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<BRMPlan> getPlans() {
		return plans;
	}
	public void setPlans(List<BRMPlan> plans) {
		this.plans = plans;
	}
}
