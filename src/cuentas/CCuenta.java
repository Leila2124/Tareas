package cuentas;

public class CCuenta {

	protected String nombre;
	protected String cuenta;
	protected double saldo;
	protected double tipoInterés;

	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		this.nombre = nom;
		this.cuenta = cue;
		this.saldo = sal;
		this.tipoInterés = tipo;
	}

	public String getNom() {
		return nombre;

	}

	public String getCue() {
		return cuenta;
	}

	public double getSal() {
		return saldo;
	}

	public double getTipo() {
		return tipoInterés;
	}

	public void setNom(String nom) {
		this.nombre = nom;
	}

	public void setCue(String cue) {
		this.cuenta = cue;
	}

	public double estado() {
		return saldo;
	}

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

}
