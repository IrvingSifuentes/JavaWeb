package com.irving.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CITY")
public class City {

	@Id
	@GeneratedValue
	@Column(name="Id")	
	private Integer id ;
	@Column(name="Id_State")	
	private Integer id_state ;
	@Column(name="Name")	
	private String name ;
	@Column(name="LastModified")	
	private String lastmodified;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_state() {
		return id_state;
	}
	public void setId_state(Integer id_state) {
		this.id_state = id_state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(String lastmodified) {
		this.lastmodified = lastmodified;
	}
	
	
	
	
}
