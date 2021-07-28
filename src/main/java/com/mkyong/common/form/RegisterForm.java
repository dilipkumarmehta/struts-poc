package com.mkyong.common.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class RegisterForm extends ActionForm {
	private String name;
	private String mobile;
	private String address;
	private String pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void reset(ActionMapping am, HttpServletRequest req) {
		System.out.println("reset()");
		this.name = null;
		this.mobile = null;
		this.address = null;
		this.pin = null;
	}
}
