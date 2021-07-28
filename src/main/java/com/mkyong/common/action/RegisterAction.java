package com.mkyong.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.form.RegisterForm;

public class RegisterAction extends Action {

	public ActionForward execute(ActionMapping am, ActionForm af, HttpServletRequest req, HttpServletResponse res) {
		System.out.println("execute()");
		// 1. collect the data.
		RegisterForm rf = (RegisterForm) af;
		req.setAttribute("Name",  rf.getName());
		req.setAttribute("Mobile", rf.getMobile());
		req.setAttribute("Address", rf.getAddress());
		req.setAttribute("PINCod", rf.getPin());
		ActionForward forward = am.findForward("home");
		return forward;
	}
}
