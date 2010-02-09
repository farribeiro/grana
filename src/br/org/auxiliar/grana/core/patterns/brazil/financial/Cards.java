package br.org.auxiliar.grana.core.patterns.brazil.financial;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Cards {

	private Card card = new Card();

	public Cards(String credit_limit) {
		card.setCredit_Limit(new BigDecimal(credit_limit));
	}

	public String getLimit4ParcelaSemJuros() {
		return card.getCredit_Limit().divide(card.getParcelasSemJuros())
				.toString();
	}

	public String getLimit4Parcela(String parcela) {
		return card.getCredit_Limit().divide(new BigDecimal(parcela))
				.toString();
	}

	public String getLimitSum4ParcelaSemJuros() {
		return card.getCredit_Limit().divide(card.getParcelasSemJuros())
				.multiply(card.getParcelasSemJuros()).toString();
	}

	public String Credit_Limit() {
		return card.getCredit_Limit().toString();
	}
}
