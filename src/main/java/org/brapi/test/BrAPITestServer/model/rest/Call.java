package org.brapi.test.BrAPITestServer.model.rest;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Call {
	private String call;
	private List<String> dataTypes;
	private List<String> methods;
	
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public List<String> getDataTypes() {
		return dataTypes;
	}
	public void setDataTypes(List<String> dataTypes) {
		this.dataTypes = dataTypes;
	}
	public List<String> getMethods() {
		return methods;
	}
	public void setMethods(List<String> methods) {
		this.methods = methods;
	}
	
	
}