package br.org.auxiliar.grana.core.administrative;

public class Person extends PersonCommon {

	private int RG;
	private int CPF;
	private int idade;
	private boolean civil;
	// private boolean married;
	private final int civilAge = 21;
	private String birthday;

	public int getCivilAge() {
		return civilAge;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isCivil() {
		return civil;
	}

	public void setCivil(boolean civil) {
		this.civil = civil;
	}
}