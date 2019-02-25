/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.controller;

/**
 *
 * @author namhcn
 */
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerApp {

	@GetMapping("/")
//	@ResponseBody
	public String helloWorld() {
		return "page/dashboard";
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String genDashboard(HttpServletRequest req) {
		return "page/dashboard";
	}

	@RequestMapping(value = "/uibtn", method = RequestMethod.GET)
	public String genUIBtn(HttpServletRequest req) {
		return "page/ui/btn";
	}

	@RequestMapping(value = "/uigraph", method = RequestMethod.GET)
	public String genUIGraph(HttpServletRequest req) {
		return "page/ui/graph";
	}

	@RequestMapping(value = "/uiicon", method = RequestMethod.GET)
	public String genIcon(HttpServletRequest req) {
		return "page/ui/icon";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String genForm(HttpServletRequest req) {
		return "page/form";
	}

	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String genChart(HttpServletRequest req) {
		return "page/chart";
	}

	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String geTable(HttpServletRequest req) {
		return "page/table";
	}
}
