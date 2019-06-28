package com.htv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idc;
	@Column(name = "nombreCategoria")
	private String nombreCategoria;
	
	


	public Categoria(int idc, String nombreCategoria) {
		super();
		this.idc = idc;
		this.nombreCategoria = nombreCategoria;
	}


	public int getIdc() {
		return idc;
	}


	public void setIdc(int idc) {
		this.idc = idc;
	}


	public String getNombreCategoria() {
		return nombreCategoria;
	}


	public void setNombreCategoria(String categoria) {
		this.nombreCategoria = categoria;
	}
	
	

}
