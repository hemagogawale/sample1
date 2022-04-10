package com.autowiring.autodetect;

public class Policy {
	
	private String policyPlan;
	private String policyAmount;
	public String getPolicyPlan() {
		return policyPlan;
	}
	public void setPolicyPlan(String policyPlan) {
		this.policyPlan = policyPlan;
	}
	public String getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(String policyAmount) {
		this.policyAmount = policyAmount;
	}
	public Policy(String policyPlan, String policyAmount) {
		super();
		this.policyPlan = policyPlan;
		this.policyAmount = policyAmount;
	}
	
	

}
