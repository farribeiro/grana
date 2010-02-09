package br.org.auxiliar.grana.core.patterns.brazil.financial;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Card {

	private String Card_Number;
	private Account account_model = null;
	private String flag;
	private BigDecimal Credit_Limit;
	private boolean titular;
	private final BigDecimal ParcelasSemJuros = new BigDecimal(12);

	public BigDecimal getParcelasSemJuros() {
		return ParcelasSemJuros;
	}

	public String getFlag() {
		return flag;
	}

	public BigDecimal getCredit_Limit() {
		return Credit_Limit;
	}

	public Account getAccount_Model() {
		return account_model;
	}

	public String getCardNumber() {
		return Card_Number;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public void setCredit_Limit(BigDecimal credit_limit) {
		this.Credit_Limit = credit_limit;
	}

	public void setModelo_conta(Account account_model) {
		this.account_model = account_model;
	}

	public void setCard_Number(String card_number) {
		this.Card_Number = card_number;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}
}
