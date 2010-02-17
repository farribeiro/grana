package br.org.auxiliar.grana.core.administrative;

public class Person extends PersonCommon {

	private String rg;
	private String firstName;
	private String familyName;
	private String cpf;
	private boolean civil;
	private final int civilAge = 21;
	private String birthday;
	
	public int getCivilAge() {
		return civilAge;
	}
	
	public Person(final String RG, final String CPF, final String birthday,
			final String firstName, final String familyName) {
		this.rg = RG;
		this.cpf = CPF;
		this.birthday = birthday;
		this.firstName = firstName;
		this.familyName = familyName;
	}
	
	public Person(final String birthday) {
		this.birthday = birthday;
	}
	
	public String getBirthday() {
		return birthday;
	}
}