package br.org.auxiliar.grana.core.financial;

import br.org.auxiliar.grana.core.base.PatternNumber;
import java.math.BigDecimal;

/**
 * 
 * @author fabio
 */
public class Rule72 {
	private final BigDecimal rule = new BigDecimal(72);
	private BigDecimal tax;
	private PatternNumber pn = new PatternNumber();
	private String extenso;
	private FinancialTools ft = new FinancialTools();

	private BigDecimal calculate() {
		return rule.divide(tax);
	}

	public String getResultInMonths() {
		return calculate().toString();
	}

	// TODO Repensar na logica deste metodo
	public String getExtendedResult() {
		int resultado = calculate().divide(ft.getMonthsInYear()).intValue();
		if (resultado >= 2)
			extenso = String.valueOf(resultado) + " anos";
		else
			extenso = String.valueOf(resultado) + " ano";

		resultado = calculate().intValue();
		if ((resultado % 12) != 0)
			extenso = extenso + " e " + (resultado % 12) + " meses";

		return extenso;
	}

	public Rule72(String i) {
		this.tax = new BigDecimal(pn.RemoveMarks(i));
	}
}
