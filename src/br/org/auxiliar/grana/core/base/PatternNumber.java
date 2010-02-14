package br.org.auxiliar.grana.core.base;

import java.text.DecimalFormat;

public class PatternNumber {

	private final DecimalFormat NumberPattern = new DecimalFormat(
			"#,###,##0,00");

	public DecimalFormat getNumberPattern() {
		return NumberPattern;
	}

	public String RemoveMarks(String value) {
		return value.replace(".", "").replace(",", ".");
	}
}
