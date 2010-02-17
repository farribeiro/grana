package br.org.auxiliar.grana.core.administrative;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.org.auxiliar.grana.core.base.PatternTime;

public class People {

	// private Commons c = new Commons();
	private Person person;
	private PatternTime time;
	private GregorianCalendar birthday;
	private int Age;

	public People(final String RG, final String CPF, final String birthday,
			final String firstName, final String familyName) {
		person = new Person(RG, CPF, birthday, firstName, familyName);
	}

	// public void save() {
	// }
	//
	// private void delete() {
	//
	// }

	public String getAge() {
		time = new PatternTime(person.getBirthday());
		birthday = time.toGregorian();

		int age = time.getToday().get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

		birthday.add(Calendar.YEAR, age);
		if (time.getToday().before(age))
			age -= 1;

		return String.valueOf(age);
	}

	public boolean isAdult(String age) {
		this.Age = Integer.parseInt(age);
		return Age >= person.getCivilAge();
	}

	// public void save() {
	// }
	//
	// private void delete() {
	//
	// }
	
	public People(String birthday) {
		person = new Person(birthday);
	}
}
// Duvida com ou sem mascara?