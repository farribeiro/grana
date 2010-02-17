package br.org.auxiliar.grana.core.administrative;

public class Car {
	private final int oneHourInMinutes = 60;
	private double Fuel;
	private double FuelCost;
	private double km;

	public double getFuel() {
		return Fuel;
	}

	public void setFuel(double fuel) {
		Fuel = fuel;
	}

	public double getFuelCost() {
		return FuelCost;
	}

	public void setFuelCost(double fuelCost) {
		FuelCost = fuelCost;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getOneHourInMinutes() {
		return oneHourInMinutes;
	}

}
