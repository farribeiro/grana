package br.org.auxiliar.grana.core.administrative;

public class Car {
	private final int oneHourInMinutes = 60;
	private double fuel;
	private double fuelCost;
	private double km;

	public Car(double fuel, double fuelCost, double km) {
		this.fuel = fuel;
		this.fuelCost = fuelCost;
		this.km = km;
	}

	public int getOneHourInMinutes() {
		return oneHourInMinutes;
	}

	public double getFuel() {
		return fuel;
	}

	public double getFuelCost() {
		return fuelCost;
	}

	public double getKm() {
		return km;
	}

}
