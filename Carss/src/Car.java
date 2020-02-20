
public class Car extends Vehicle{

	int power;
	String fuel;
	int passengers;
	
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public Car(int maxSpeed, String model, double price, int power, String fuel, int passengers) throws SpeedException, PriceException{
		super(maxSpeed, model, price);
		
		setPower(power);
		setFuel(fuel);
		setPassengers(passengers);
	}

	@Override
	int calcPromo() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}