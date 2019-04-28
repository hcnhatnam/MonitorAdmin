/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.repository;
import com.monitor.admin.entities.Images;
import com.monitor.admin.entities.Statistical;
import java.util.Collection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author namhcn
 */
public interface ImageRepository extends CrudRepository<Images,String>{
    	@Query(nativeQuery = true, value="select CONVERT(count(*),char) as numReq, DATE_FORMAT(timedetail,\"%Y-%m-%d\") as timeReq FROM images GROUP BY timeReq")
	public List<Object[]> getStatistical();
        
}
