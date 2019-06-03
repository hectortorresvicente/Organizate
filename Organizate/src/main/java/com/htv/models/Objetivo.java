package com.htv.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Objetivo")
public class Objetivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ido;
	@Column(name = "NombreObjetivo")
	private String NombreObjetivo;
	@Column(name = "idc")
	private ArrayList<Categoria> idc;
	
	

	
	public Objetivo(int ido, String nombreObjetivo, ArrayList<Categoria> idc) {
		super();
		this.ido = ido;
		NombreObjetivo = nombreObjetivo;
		this.idc = idc;
	}

	public int getIdo() {
		return ido;
	}

	public void setIdo(int ido) {
		this.ido = ido;
	}

	public String getNombreObjetivo() {
		return NombreObjetivo;
	}

	public void setNombreObjetivo(String nombreObjetivo) {
		NombreObjetivo = nombreObjetivo;
	}



	public ArrayList<Categoria> getIdCategoria() {
		return idc;
	}



	public ArrayList<Categoria> setIdCategoria() {
		return idc;
	}
	
	

}
