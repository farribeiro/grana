package br.org.auxiliar.grana.core.patterns.brazil.financial;

import br.org.auxiliar.grana.core.patterns.brazil.TipoCombustivel;

/**
 * 
 * @author fabio
 */
public class Fuel {

	private TipoCombustivel tipo;
	private double Preco;

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double Preco) {
		this.Preco = Preco;
	}

}
