package br.org.auxiliar.grana.core.administrative;

import br.org.auxiliar.grana.core.patterns.brazil.CEP;

public class PersonCommon {

	private String nome;
	private int NumeroEndereco;
	private CEP CEP;
	private int Telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroEndereco() {
		return NumeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		NumeroEndereco = numeroEndereco;
	}

	public CEP getCEP() {
		return CEP;
	}

	public void setCEP(CEP cep) {
		CEP = cep;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	public void getRecord() {

	}

	public void setRecord() {

	}

}
