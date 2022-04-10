package com.autowiring.autodetect;

public class Categories {

	private String name;
	private Policy policy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public Categories(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	
	public void show() {
		System.out.println("Categories name>>>"+name);
		System.out.println("PlanName is>>>"+policy.getPolicyPlan());
		System.out.println("PlanAmount is>>>"+policy.getPolicyAmount());
	}
	
}
