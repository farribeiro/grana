package br.org.auxiliar.grana.core.administrative;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.org.auxiliar.grana.core.base.PatternTime;

public class People {

	// private Commons c = new Commons();
	private Person person = new Person();
	private PatternTime pd;
	private GregorianCalendar bd;
	private int Age;

	public People() {
	}

	public People(String birthday) {
		person.setBirthday(birthday);
	}

	public String getAge() {
		pd = new PatternTime(person.getBirthday());
		bd = pd.getString2Gregorian();

		int age = pd.getToday().get(Calendar.YEAR) - bd.get(Calendar.YEAR);

		bd.add(Calendar.YEAR, age);
		if (pd.getToday().before(bd)) {
			age -= 1;
		}
		return String.valueOf(age);
	}

	public boolean isAdult(String age) {
		this.Age = Integer.parseInt(age);
		return Age >= person.getCivilAge();
	}
}
// Duvida com ou sem mascara?