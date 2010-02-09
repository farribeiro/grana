package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Orcamento {

	private final BigDecimal Meta = new BigDecimal(30);
	private BigDecimal valor;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getMeta() {
		return Meta;
	}
}
