package br.org.auxiliar.grana.core.patterns.brazil.financial;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Moviment {

	private String description;
	private BigDecimal value;

	public String getDescription() {
		return description;
	}

	public void setDescription(String Descricao) {
		this.description = Descricao;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal valor) {
		this.value = valor;
	}

	private FormaPagamento formaPagamento;

}
