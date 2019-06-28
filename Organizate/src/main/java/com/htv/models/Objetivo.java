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
	@Column(name = "nombreObjetivo")
	private String nombreObjetivo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "idcategoria")
	private ArrayList<Categoria> idcategoria;
	
	
	public Objetivo(int ido, String nombreObjetivo, String descripcion, ArrayList<Categoria> idcategoria) {
		super();
		this.ido = ido;
		this.nombreObjetivo = nombreObjetivo;
		this.descripcion = descripcion;
		this.idcategoria = idcategoria;
		
	}
	
	public int getIdo() {
		return ido;
	}
	public void setIdo(int ido) {
		this.ido = ido;
	}
	public String getNombreObjetivo() {
		return nombreObjetivo;
	}
	public void setNombreObjetivo(String nombreObjetivo) {
		this.nombreObjetivo = nombreObjetivo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Categoria> getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(ArrayList<Categoria> idcategoria) {
		this.idcategoria = idcategoria;
	}
	
	
	

	
	

}
