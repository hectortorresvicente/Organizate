package com.htv.models;

import java.util.ArrayList;

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
	@Column(name = "idobjetivoRelacionCategoria")
	
	
	private ArrayList<Objetivo> idobjetivoRelacionCategoria;
	public Categoria(int idc, String nombreCategoria, ArrayList<Objetivo> idobjetivoRelacionCategoria) {
		super();
		this.idc = idc;
		this.nombreCategoria = nombreCategoria;
		this.idobjetivoRelacionCategoria = idobjetivoRelacionCategoria;
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
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public ArrayList<Objetivo> getIdobjetivoRelacionCategoria() {
		return idobjetivoRelacionCategoria;
	}
	public void setIdobjetivoRelacionCategoria(ArrayList<Objetivo> idobjetivoRelacionCategoria) {
		this.idobjetivoRelacionCategoria = idobjetivoRelacionCategoria;
	}
	
	
	
	
	


	
	

}
