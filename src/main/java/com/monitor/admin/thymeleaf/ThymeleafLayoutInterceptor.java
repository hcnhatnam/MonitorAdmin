/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.thymeleaf;

/**
 *
 * @author namhcn
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.monitor.admin.config.MainAppConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author namhcn
 */
public class ThymeleafLayoutInterceptor extends HandlerInterceptorAdapter {

	private static final String DEFAULT_LAYOUT = "layouts/template";
	private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

	private String defaultLayout = DEFAULT_LAYOUT;
	private final String viewAttributeName = DEFAULT_VIEW_ATTRIBUTE_NAME;

	public void setDefaultLayout(String defaultLayout) {
		this.defaultLayout = defaultLayout;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if (modelAndView == null || !modelAndView.hasView()) {
			return;
		}

		String originalViewName = modelAndView.getViewName();

		if (originalViewName.contains(MainAppConfig.SAMPLE_PAGE)) {
			return;
		}

		if (originalViewName.startsWith("redirect:") || originalViewName.startsWith("forward:")) {
			return;
		}
		if (handler instanceof HandlerMethod) {
			//String layoutName = getLayoutName(handler);
			modelAndView.setViewName(this.defaultLayout);
			modelAndView.addObject("view", originalViewName);
		}
	}

}
