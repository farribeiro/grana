package br.org.auxiliar.grana.core.base;

import java.text.DecimalFormat;

public class NumbersPatterns {

	private final DecimalFormat NumberPattern = new DecimalFormat(
			"#,###,##0,00");

	public DecimalFormat getNumberPattern() {
		return NumberPattern;
	}
}
