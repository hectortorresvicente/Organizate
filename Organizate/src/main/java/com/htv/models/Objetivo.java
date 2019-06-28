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
	@Column(name = "idu_O")
	private Usuarios idu_O;
	@Column(name = "nombreObjetivo")
	private String nombreObjetivo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "idcategoriaRelacionObjetivo")
	private ArrayList<Categoria> idcategoriaRelacionObjetivo;
	@Column(name = "idaccionRelacionObjetivo")
	private ArrayList<Accion> idaccionRelacionObjetivo;
	public int getIdo() {
		return ido;
	}
	public void setIdo(int ido) {
		this.ido = ido;
	}
	public Usuarios getIdu_O() {
		return idu_O;
	}
	public void setIdu_O(Usuarios idu_O) {
		this.idu_O = idu_O;
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
	public ArrayList<Categoria> getIdcategoriaRelacionObjetivo() {
		return idcategoriaRelacionObjetivo;
	}
	public void setIdcategoriaRelacionObjetivo(ArrayList<Categoria> idcategoriaRelacionObjetivo) {
		this.idcategoriaRelacionObjetivo = idcategoriaRelacionObjetivo;
	}
	public ArrayList<Accion> getIdaccionRelacionObjetivo() {
		return idaccionRelacionObjetivo;
	}
	public void setIdaccionRelacionObjetivo(ArrayList<Accion> idaccionRelacionObjetivo) {
		this.idaccionRelacionObjetivo = idaccionRelacionObjetivo;
	}
	
	
	
	
	

}
