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

	public People() {
	}

	public People(final String RG, final String CPF, final String birthday,
			final String firstName, final String familyName) {
		person = new Person(RG, CPF, birthday, firstName, familyName);
	}

	 public People(String birthday) {
		person = new Person(birthday);
	}

	public String getAge() {
		time = new PatternTime(person.getBirthday());
		birthday = time.toGregorian();

		Age = time.getToday().get(Calendar.YEAR)
				- birthday.get(Calendar.YEAR);

		birthday.add(Calendar.YEAR, Age);
		if (time.getToday().before(Age))
			Age -= 1;

		return String.valueOf(Age);
	}

	public boolean inCivilAge(String age) {
		Age = Integer.parseInt(age);
		return Age >= person.getCivilAge();
	}

	public boolean inPenalAge(String age) {
		Age = Integer.parseInt(age);
		return Age >= person.getPenalAge(); 
	}

	// public void save() {
	// }
	//
	// private void delete() {
	//	
	// }
	// TODO Duvida com ou sem mascara?
}
