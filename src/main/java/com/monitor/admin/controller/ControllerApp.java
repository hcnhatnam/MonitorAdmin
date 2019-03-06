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
import com.monitor.admin.DBEntities.ImagesImpl;
import com.monitor.admin.config.MainAppConfig;
import com.monitor.admin.entities.Images;
import com.monitor.admin.repository.ImageRepository;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerApp {
	
	@GetMapping("/")
//	@ResponseBody
	public String helloWorld() {
		return "page/dashboard";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String genIndex(HttpServletRequest req) {
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
	public String geTable(Model model, HttpServletRequest req) {
		List<Images> target = new ArrayList<>();
		Iterable<Images> i = MainAppConfig.INSTANCE.model.getTableImage();
		i.forEach(t -> t.setValue("data:image/png;base64," + t.getValue()));
		i.forEach(target::add);
		model.addAttribute("listImages", target);
		return "page/table";
	}
}
