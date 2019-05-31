package com.htv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prioridad")
public class Prioridad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idp;
	@Column(name = "NobrePrioridad")
	private String NobrePrioridad;
	
	public Prioridad(int idp, String nobrePrioridad) {
		super();
		this.idp = idp;
		NobrePrioridad = nobrePrioridad;
	}

	public int getIdp() {
		return idp;
	}

	public void setIdp(int idp) {
		this.idp = idp;
	}

	public String getNobrePrioridad() {
		return NobrePrioridad;
	}

	public void setNobrePrioridad(String nobrePrioridad) {
		NobrePrioridad = nobrePrioridad;
	}
	
	

}
