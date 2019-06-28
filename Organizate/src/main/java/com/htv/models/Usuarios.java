package com.htv.models;



import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Usuarios")
public class Usuarios {



		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idu;
		@Column(name = "correo")
		private String correo;
		@Column(name = "nombreUsuario")
		private String nombreUsuario;
		@Column(name = "contraseña")
		private String contraseña;
		@Column(name = "ido")
		private ArrayList<Objetivo> ido;
		
		public Usuarios(int idu, String correo, String contraseña, ArrayList<Objetivo> ido, String nombreUsuario) {
			super();
			this.idu = idu;
			this.correo = correo;
			this.nombreUsuario = nombreUsuario;
			this.contraseña = contraseña;
			this.ido = ido;
		}

		public int getIdu() {
			return idu;
		}

		public void setIdu(int idu) {
			this.idu = idu;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getNombreUsuario() {
			return nombreUsuario;
		}

		public void setNombreUsuario(String nombre) {
			this.nombreUsuario = nombre;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public ArrayList<Objetivo> getIdo() {
			return ido;
		}

		public void setIdo(ArrayList<Objetivo> ido) {
			this.ido = ido;
		}
		
		
	}

	
	

