package br.org.auxiliar.grana.core.base;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PatternTime {

	private final GregorianCalendar today = new GregorianCalendar();
	private DecimalFormat dayMonth = new DecimalFormat("00");
	private GregorianCalendar date;
	private String day;
	private String month;
	private String year;
	private String dateString;

	private String extenso;

	private String getAAAA_MM_DD() {
		return year + "/" + month + "/" + day;
	}

	private String getDD_MM_AAAA() {
		return day + "/" + month + "/" + year;
	}

	public GregorianCalendar toGregorian() {
		return new GregorianCalendar(Integer.parseInt(dateString
				.substring(6, 8)),
				Integer.parseInt(dateString.substring(3, 5)), Integer
						.parseInt(dateString.substring(0, 2)));
	}

	/**
	 * This method returns the String date for today date
	 * 
	 * @return Today date in String
	 */
	public String getToday_DD_MM_AAAA() {
		return getDD_MM_AAAA();
	}

	public String getToday_AAAA_MM_DD() {
		return getAAAA_MM_DD();
	}

	public String getDate_DD_MM_AAAA() {
		return getDD_MM_AAAA();
	}

	public GregorianCalendar getToday() {
		return today;
	}

	// public String getCountofMonths(){
	//		
	// }

	public GregorianCalendar getTomorrow() {
		GregorianCalendar tomorrow = today;
		tomorrow.add(1, Calendar.DAY_OF_MONTH);
		return tomorrow;
	}

	public String getTotalofMonths() {
		return String.valueOf(Calendar.DECEMBER + 1);
	}

	public PatternTime() {
		today.add(Calendar.MONTH, 1);
	}

	public PatternTime(String date) {
		dateString = date;
	}

	public PatternTime(GregorianCalendar date) {
		day = dayMonth.format(date.get(Calendar.DAY_OF_MONTH));
		month = dayMonth.format(date.get(Calendar.MONTH));
		year = String.valueOf(date.get(Calendar.YEAR));
	}

	public int toMonths() {
		return Integer.parseInt(month) % Integer.parseInt(getTotalofMonths());
	}
	// TODO Repensar na logica deste metodo e reestrutura
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

}