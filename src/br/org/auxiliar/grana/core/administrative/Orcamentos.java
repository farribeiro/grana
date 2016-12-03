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
		ft = new FinancialTools(orcamento.getValor().toString(), orcamento
				.getMeta().toString());
		return ft.getCash();
	}

	public String getPercentual() {
		return "";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		orcamento = null;
		ft = null;
	}
}
