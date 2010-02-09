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

	public PatternTime() {
		today.add(Calendar.MONTH, 1);
	}

	public PatternTime(String date) {
		dateString = date;
	}

	private void getGregorian2String(GregorianCalendar date) {
		day = dayMonth.format(date.get(Calendar.DAY_OF_MONTH));
		month = dayMonth.format(date.get(Calendar.MONTH));
		year = String.valueOf(date.get(Calendar.YEAR));
	}

	private String getAAAA_MM_DD() {
		return year + "/" + month + "/" + day;
	}

	private String getDD_MM_AAAA() {
		return day + "/" + month + "/" + year;
	}

	/**
	 * This method returns the String date for today date
	 * 
	 * @return Today date in String
	 */
	public String getTodayDDMMAAAAFormat() {
		getGregorian2String(today);
		return getDD_MM_AAAA();
	}

	public String getTodayAAAAMMDDFormat() {
		getGregorian2String(today);
		return getAAAA_MM_DD();
	}

	public String getDateDDMMAAAA() {
		getGregorian2String(date);
		return getDD_MM_AAAA();
	}

	public GregorianCalendar getString2Gregorian() {
		return new GregorianCalendar(Integer.parseInt(dateString
				.substring(6, 8)),
				Integer.parseInt(dateString.substring(3, 5)), Integer
						.parseInt(dateString.substring(0, 2)));
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
}