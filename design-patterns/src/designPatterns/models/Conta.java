package designPatterns.models;

import java.util.Calendar;

import designPatterns.interfaces.EstadoDeUmaConta;
import designPatterns.tiposDeEstado.Positivo;

public class Conta {
	private String titular;
	private double saldo;
	private Calendar dataDeAbertura;
	private EstadoDeUmaConta estadoDeUmaConta;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbertura = Calendar.getInstance();
		this.estadoDeUmaConta = new Positivo();
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Calendar getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setEstadoDeUmaConta(EstadoDeUmaConta estadoDeUmaConta) {
		this.estadoDeUmaConta = estadoDeUmaConta;
	}

	public void deposita(double valor) {
		this.estadoDeUmaConta.deposito(this, valor);
	}
	
	public void saca(double valor) {
		this.estadoDeUmaConta.saque(this, valor);
	}

}
