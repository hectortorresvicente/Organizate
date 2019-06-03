package com.htv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ide;
	@Column(name = "NombreEstado")
	private String NombreEstado;
	
	public Estado(int ide, String nombreEstado) {
		super();
		this.ide = ide;
		NombreEstado = nombreEstado;
	}

	public int getIde() {
		return ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}

	public String getNombreEstado() {
		return NombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		NombreEstado = nombreEstado;
	}
	
	

}
