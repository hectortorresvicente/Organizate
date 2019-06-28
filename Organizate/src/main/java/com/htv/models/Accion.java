package com.htv.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accion")
public class Accion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ida;
	@Column(name = "idu_A")
	private Usuarios idu_A;
	@Column(name = "nombreAccion")
	private String nombreAccion;
	@Column(name ="duracionAccion")
	private Time duracionAccion;
	@Column(name ="delegar")
	private String delegar;
	@Column(name ="fechaCreacion")
	private Time fechaCreacion;
	@Column(name ="idprioridadAccion")
	private Prioridad idprioridadAccion;
	@Column(name ="idestadoAccion")
	private Estado idestadoAccion;
	@Column(name ="idobjetivoRelacionAccion")
	private ArrayList<Objetivo> idobjetivoRelacionAccion;
	@Column(name ="descripcion")
	private String descripcion;
	@Column(name ="idaccionRelacionAccionHIjo")
	private ArrayList<Accion> idaccionRelacionAccionHIjo;
	@Column(name ="idaccionRelacionAccionPadre")
	private ArrayList<Accion> idaccionRelacionAccionPadre;
	
	
	public Accion(int ida, Usuarios idu_A, String nombreAccion, Time duracionAccion, String delegar, Time fechaCreacion,
			Prioridad idprioridadAccion, Estado idestadoAccion, ArrayList<Objetivo> idobjetivoRelacionAccion,
			String descripcion, ArrayList<Accion> idaccionRelacionAccionHIjo,
			ArrayList<Accion> idaccionRelacionAccionPadre) {
		super();
		this.ida = ida;
		this.idu_A = idu_A;
		this.nombreAccion = nombreAccion;
		this.duracionAccion = duracionAccion;
		this.delegar = delegar;
		this.fechaCreacion = fechaCreacion;
		this.idprioridadAccion = idprioridadAccion;
		this.idestadoAccion = idestadoAccion;
		this.idobjetivoRelacionAccion = idobjetivoRelacionAccion;
		this.descripcion = descripcion;
		this.idaccionRelacionAccionHIjo = idaccionRelacionAccionHIjo;
		this.idaccionRelacionAccionPadre = idaccionRelacionAccionPadre;
		
		
	}
	public int getIda() {
		return ida;
	}
	public void setIda(int ida) {
		this.ida = ida;
	}
	public Usuarios getIdu_A() {
		return idu_A;
	}
	public void setIdu_A(Usuarios idu_A) {
		this.idu_A = idu_A;
	}
	public String getNombreAccion() {
		return nombreAccion;
	}
	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}
	public Time getDuracionAccion() {
		return duracionAccion;
	}
	public void setDuracionAccion(Time duracionAccion) {
		this.duracionAccion = duracionAccion;
	}
	public String getDelegar() {
		return delegar;
	}
	public void setDelegar(String delegar) {
		this.delegar = delegar;
	}
	public Time getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Time fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Prioridad getIdprioridadAccion() {
		return idprioridadAccion;
	}
	public void setIdprioridadAccion(Prioridad idprioridadAccion) {
		this.idprioridadAccion = idprioridadAccion;
	}
	public Estado getIdestadoAccion() {
		return idestadoAccion;
	}
	public void setIdestadoAccion(Estado idestadoAccion) {
		this.idestadoAccion = idestadoAccion;
	}
	public ArrayList<Objetivo> getIdobjetivoRelacionAccion() {
		return idobjetivoRelacionAccion;
	}
	public void setIdobjetivoRelacionAccion(ArrayList<Objetivo> idobjetivoRelacionAccion) {
		this.idobjetivoRelacionAccion = idobjetivoRelacionAccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Accion> getIdaccionRelacionAccionHIjo() {
		return idaccionRelacionAccionHIjo;
	}
	public void setIdaccionRelacionAccionHIjo(ArrayList<Accion> idaccionRelacionAccionHIjo) {
		this.idaccionRelacionAccionHIjo = idaccionRelacionAccionHIjo;
	}
	public ArrayList<Accion> getIdaccionRelacionAccionPadre() {
		return idaccionRelacionAccionPadre;
	}
	public void setIdaccionRelacionAccionPadre(ArrayList<Accion> idaccionRelacionAccionPadre) {
		this.idaccionRelacionAccionPadre = idaccionRelacionAccionPadre;
	}
	
	
	
	
	
	
	
}

