package br.org.auxiliar.grana.core.administrative;


public class PersonCommon {

	private String nome;
	private String numeroEndereco;
	private String endereco;
//	private CEP cep;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

//	public CEP getCep() {
//		return cep;
//	}

	public String getTelefone() {
		return telefone;
	}

	public PersonCommon() {
		// TODO Auto-generated constructor stub
	}

	public PersonCommon(String nome, String endereco, String numeroEndereco, String CEP, String telefone) {
			// TODO Auto-generated constructor stub
			this.nome = nome;
			this.endereco = endereco;
			this.numeroEndereco = numeroEndereco;
	//		cep = new CEP(cep);
			this.telefone = telefone;
		}
// TODO Fazer um registro automatico para classe CEP dos dados referente a rua;
}
