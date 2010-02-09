package br.org.auxiliar.grana.core.financial;

import java.math.BigDecimal;

public class ROI {
	
	private BigDecimal I;
	private BigDecimal ROI;
	private FinancialTools ft = new FinancialTools();
	
	public ROI(String Investment, String ReturnofInvestment) {
		I = new BigDecimal(Investment);
		ROI = new BigDecimal(ReturnofInvestment);
	}
	
	public String returnTaxYear(){
		return ft.getCurrency_Format().format(ROI.divide(I).multiply(ft.getCem()));
	}
	
	public String prazo_Investment(){
		return I.divide(ROI).toString();
	}

	@Override
	protected void finalize() throws Throwable {
		ft = null;
		super.finalize();
	}

}
