/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.DBEntities;

import com.monitor.admin.entities.Images;
import com.monitor.admin.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author namhcn
 */
@Service
public class ImagesImpl {

	@Autowired
	private ImageRepository imageRepository;

	public Iterable<Images> getTableImage() {
		return imageRepository.findAll();
	}
}
