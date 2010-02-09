package br.org.auxiliar.grana.core.patterns.brazil.financial;

public class Bank {

	private final int digits_bank = 1;
	private int number;
	private String name;

	public int getQtDigitosAgenciasBancaria() {
		return digits_bank;
	}

	public Bank() {
	}

	public String getName() {
		return name;
	}

	public void setName(String val) {
		this.name = val;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int val) {
		this.number = val;
	}
}
