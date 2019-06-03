package com.htv.models;

import java.sql.Time;
import java.util.ArrayList;

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
	@Column(name = "NombreAccion")
	private String NombreAccion;
	@Column(name ="DuracionAccion")
	private Time DuracionAccion;
	@Column(name ="Delegar")
	private String Delegar;
	@Column(name ="FechaCreacion")
	private Time FechaCreacion;
	@Column(name ="PrioridadAccion")
	private Prioridad  PrioridadAccion;
	@Column(name ="EstadoAccion")
	private Estado  EstadoAccion;
	@Column(name ="ObjetivoRelacionAccion")
	private Objetivo  ObjetivoRelacionAccion;
	@Column(name = "ido")
	private ArrayList<Categoria> ido;
	
	public Accion(int ida, String nombreAccion, Time duracionAccion, String delegar, Time fechaCreacion,
			Prioridad prioridadAccion, Estado estadoAccion, Objetivo objetivoRelacionAccion, ArrayList<Categoria> ido) {
		super();
		this.ida = ida;
		NombreAccion = nombreAccion;
		DuracionAccion = duracionAccion;
		Delegar = delegar;
		FechaCreacion = fechaCreacion;
		PrioridadAccion = prioridadAccion;
		EstadoAccion = estadoAccion;
		ObjetivoRelacionAccion = objetivoRelacionAccion;
		this.ido = ido;
	}

	public int getIda() {
		return ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}

	public String getNombreAccion() {
		return NombreAccion;
	}

	public void setNombreAccion(String nombreAccion) {
		NombreAccion = nombreAccion;
	}

	public Time getDuracionAccion() {
		return DuracionAccion;
	}

	public void setDuracionAccion(Time duracionAccion) {
		DuracionAccion = duracionAccion;
	}

	public String getDelegar() {
		return Delegar;
	}

	public void setDelegar(String delegar) {
		Delegar = delegar;
	}

	public Time getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(Time fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public Prioridad getPrioridadAccion() {
		return PrioridadAccion;
	}

	public void setPrioridadAccion(Prioridad prioridadAccion) {
		PrioridadAccion = prioridadAccion;
	}

	public Estado getEstadoAccion() {
		return EstadoAccion;
	}

	public void setEstadoAccion(Estado estadoAccion) {
		EstadoAccion = estadoAccion;
	}

	public Objetivo getObjetivoRelacionAccion() {
		return ObjetivoRelacionAccion;
	}

	public void setObjetivoRelacionAccion(Objetivo objetivoRelacionAccion) {
		ObjetivoRelacionAccion = objetivoRelacionAccion;
	}

	public ArrayList<Categoria> getIdo() {
		return ido;
	}

	public void setIdo(ArrayList<Categoria> ido) {
		this.ido = ido;
	}
	
	
	
}

