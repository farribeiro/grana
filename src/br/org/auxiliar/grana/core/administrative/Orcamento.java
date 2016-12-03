package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Orcamento {

	private final BigDecimal Meta = new BigDecimal(30);
	private BigDecimal value;

	public BigDecimal getValor() {
		return value;
	}

	public BigDecimal getMeta() {
		return Meta;
	}

  public Orcamento(BigDecimal value) {
    this.value = value;
  }

}
