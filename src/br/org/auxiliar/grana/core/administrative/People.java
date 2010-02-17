package br.org.auxiliar.grana.core.administrative;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.org.auxiliar.grana.core.base.PatternTime;

public class People {

	// private Commons c = new Commons();
	private Person person;
	private PatternTime pd;
	private GregorianCalendar bd;
	private int Age;

	public People(final String RG, final String CPF, final String birthday,
			final String firstName, final String familyName) {
		person = new Person(RG, CPF, birthday, firstName, familyName);
	}

	public void save() {
	}

	private void delete() {

	}

	public People(String birthday) {
		person = new Person(birthday);
	}

	public String getAge() {
		pd = new PatternTime(person.getBirthday());
		bd = pd.toGregorian();

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