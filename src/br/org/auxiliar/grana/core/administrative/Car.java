package br.org.auxiliar.grana.core.administrative;


public class Car {
	private final int oneHourInMinutes = 60;
	private double Fuel;
	private double FuelCost;
	private double km;

	public Double getFuel() {
		return Fuel;
	}

	public void setFuel(Double fuel) {
		Fuel = fuel;
	}

	public Double getFuelCost() {
		return FuelCost;
	}

	public void setFuelCost(Double fuelCost) {
		FuelCost = fuelCost;
	}

	public int getOneHourInMinutes() {
		return oneHourInMinutes;
	}

	public void setFuel(double fuel) {
		Fuel = fuel;
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
}
