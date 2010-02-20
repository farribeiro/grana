package br.org.auxiliar.grana.core.administrative;

import br.org.auxiliar.grana.core.base.PatternNumber;

public class Cars {

	private Car car;
	private double initKM;
	private double endKM;
	private PatternNumber np;

	public Cars(String initkm, String endkm, String fuel, String fuelcost) {
		initKM = Double.valueOf(initkm);
		endKM = Double.valueOf(endkm);
		car = new Car(Double.valueOf(fuel), Double.valueOf(fuelcost), this
				.setKM());
		np = new PatternNumber();
	}

	// public Cars(String km, String fuel, String fuelcost) {
	// this.km = new BigDecimal(km);
	// np = new NumbersPatterns();
	// }

	public String getKm4Liters() {
		return np.getNumberPattern().format(
				Double.valueOf(getKM()) / car.getFuel());
	}

	// public String getLiters4KmLiters(String kmliters) {
	// return np.getNumberPattern().format(
	// car.getFuel() * Double.valueOf(kmliters));
	// }

	public String getCost4KmLiters() {
		return np.getNumberPattern().format(
				car.getFuelCost() / Double.valueOf(getKm4Liters()));
	}

	private double setKM() {
		return endKM - initKM;
	}

	public String getKM() {
		return String.valueOf(car.getKm());
	}

	@Override
	protected void finalize() throws Throwable {
		np = null;
		car = null;
		super.finalize();
	}
}
