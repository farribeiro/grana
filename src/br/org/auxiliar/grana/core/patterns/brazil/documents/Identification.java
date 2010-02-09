package br.org.auxiliar.grana.core.patterns.brazil.documents;

/**
 * 
 * @author fabio
 */
public class Identification {

	private final int digits_RG = 1;
	private final int digits_CPFAndCNPJ = 2;
	private final int adult_age = 21;
	private final int Length_RG=9; // CONTA-SE O ZERO
	private final int Length_CPF=11; // CONTA-SE O ZERO

	public int getAdultAge() {
		return adult_age;
	}

	public int getVerificationDigitsCPF() {
		return digits_CPFAndCNPJ;
	}
	
	public int getQtDigitsCNPJ() {
		return digits_CPFAndCNPJ;
	}
	
	public int getVerificationDigitsRG() {
		return digits_RG;
	}

	public int getLength_RG() {
		return Length_RG;
	}

	public int getLength_CPF() {
		return Length_CPF;
	}
}
