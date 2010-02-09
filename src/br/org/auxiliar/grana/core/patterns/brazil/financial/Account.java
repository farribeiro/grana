package br.org.auxiliar.grana.core.patterns.brazil.financial;

import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Account {

	private Bank bank_model = new Bank();
	// TODO falta criar um mecanismo que cria a pessoa fisica ou a juridica
	private final BigDecimal cash_minimal_limit = new BigDecimal(600);
	private final BigDecimal transfer_mininal_limit = new BigDecimal(1000);
	private String account_number;
	private BigDecimal amount;
	private String description;

	public BigDecimal getCashMinimalLimit() {
		return cash_minimal_limit;
	}

	public BigDecimal getTransferMininalLimit() {
		return transfer_mininal_limit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAccountNumber() {
		return account_number;
	}

	public void setAccountNumber(String accont_number) {
		this.account_number = accont_number;
	}

	public Bank getBank_Model() {
		return bank_model;
	}

	public void setBank_Model(Bank bank_model) {
		this.bank_model = bank_model;
	}
}