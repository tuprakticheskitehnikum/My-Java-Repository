
public class Hovercraft extends Vehicle implements Water, Neshto{

	int passengers;
	int numEngines;
	
	public Hovercraft(int maxSpeed, String model, double price, int passengers, int numEngines) throws SpeedException, PriceException{
		super(maxSpeed, model, price);
		setPassengers(passengers);
		setNumEngines(numEngines);
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getNumEngines() {
		return numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}

	@Override
	int calcPromo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String printWater() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printLand() {
		System.out.println("Tova se dviji po zemq :)");
		return null;
	}

	
}
