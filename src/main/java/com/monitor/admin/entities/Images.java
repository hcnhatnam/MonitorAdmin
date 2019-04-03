/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author namhcn
 */
//
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "images")
public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String value;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date timedetail;

	private String meta1;

	private String meta2;

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	private String token;
	
	@DateTimeFormat(pattern = "dd-MMM-YYYY")
	public Date getTimedetail() {
		return timedetail;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTimedetail(Date timedetail) {
		this.timedetail = timedetail;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setMeta1(String meta1) {
		this.meta1 = meta1;
	}

	public void setMeta2(String meta2) {
		this.meta2 = meta2;
	}

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public String getMeta1() {
		return meta1;
	}

	public String getMeta2() {
		return meta2;
	}

}
