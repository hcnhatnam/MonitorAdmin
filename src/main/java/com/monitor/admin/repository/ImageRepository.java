/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.repository;
import com.monitor.admin.entities.Images;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author namhcn
 */
public interface ImageRepository extends CrudRepository<Images,Integer>{
	
}
