/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author namhcn
 */
@Controller
public class ControllerAnonys {

	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String genBlank(HttpServletRequest req) {
		return "page/sample/blank";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String genLogin(HttpServletRequest req) {
		return "page/sample/login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String genRegister(HttpServletRequest req) {
		return "page/sample/register";
	}

	@RequestMapping(value = "/error404", method = RequestMethod.GET)
	public String genError404(HttpServletRequest req) {
		return "page/sample/error404";
	}

	@RequestMapping(value = "/error500", method = RequestMethod.GET)
	public String genError500(HttpServletRequest req) {
		return "page/sample/error500";
	}

}
