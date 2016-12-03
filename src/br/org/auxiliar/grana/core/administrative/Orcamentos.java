package br.org.auxiliar.grana.core.administrative;

import java.math.BigDecimal;

import br.org.auxiliar.grana.core.financial.FinancialTools;

/**
 * 
 * @author fabio
 */
public class Orcamentos {

	private Orcamento orcamento;
	private FinancialTools ft;

	public boolean isMetaSuperada(String valor) {
		// return o.getMeta().intValue() >
		return true;
	}

	public Orcamentos(String value) {
		orcamento = new Orcamento(new BigDecimal(value));
	}

	public String getValorInvestimento() {
		return "";
	}

	public String getValorComprometido(String value) {
		o.setValor(new BigDecimal(value));
		ft = new FinancialTools(o.getValor().toString(), o.getMeta().toString());
		return ft.getCash();
	}

	public String getPercentual() {
		return "";
	}
}
