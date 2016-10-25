package modelo;

import java.util.Date;

import control.Ejercicios1;

public class Intento extends Ejercicios1 {
	private int numeroIntento;
	private Date fechaHora;

	

	public Intento(int numeroIntento, Date fechaHora) {
		super();
		this.numeroIntento = numeroIntento;
		this.fechaHora = fechaHora;
	}

	public int getNumeroIntento() {
		return numeroIntento;
	}

	public void setNumeroIntento(int numeroIntento) {
		this.numeroIntento = numeroIntento;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaIntento(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
}
