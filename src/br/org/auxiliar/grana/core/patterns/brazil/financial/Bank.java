package br.org.auxiliar.grana.core.patterns.brazil.financial;

public class Bank {

	private final int digitsBank = 1;
	private int number;
	private String name;

	public int getQtDigitosAgenciasBancaria() {
		return digitsBank;
	}
	
	public Bank( final int number, final String name) {
		this.number = number;
		this.name = name;
	}
	public Bank() {
	}
}
