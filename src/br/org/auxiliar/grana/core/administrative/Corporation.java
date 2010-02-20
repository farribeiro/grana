package br.org.auxiliar.grana.core.administrative;

public class Corporation extends Person {

	public Corporation() {
		// TODO Auto-generated constructor stub
	}

	private String CorporationName;
	private final int DigitosCNPJ = 14;
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public int getDigitosCNPJ() {
		return DigitosCNPJ;
	}

	public String getCorporationName() {
		return CorporationName;
	}

	public void setCorporationName(String corporationName) {
		CorporationName = corporationName;
	}
}