package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Item {
	private TypeMoviments type;
	private String Descricao;
	private BigDecimal valor;

	protected String getDescricao() {
		return Descricao;
	}

	protected void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

}