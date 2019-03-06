/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.config;


import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author namhcn
 */
@Configuration
public class mainConfig {

	@Autowired
	private ApplicationContext appContext;

	@PostConstruct
	public void initApp() {
		MainAppConfig.INSTANCE.init(appContext);
	}
}
