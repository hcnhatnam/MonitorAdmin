/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.config;


import com.monitor.admin.DBEntities.ImagesImpl;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author namhcn
 */
public class MainAppConfig {

	public static final MainAppConfig INSTANCE = new MainAppConfig();
	public static final String UPLOAD_TEMP_FOLDER_FROMSTATIC = "";
	public static final String RESOURCE_LOCATION = "/public/";
	public static final String SAMPLE_PAGE = "samples";

	public ImagesImpl model;
	
	public void init(ApplicationContext appContext) {
		model = appContext.getBean(ImagesImpl.class);
	}

}
