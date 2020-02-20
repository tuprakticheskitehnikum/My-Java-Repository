
public abstract class Vehicle {

	int maxSpeed;
	String Model;
	double Price;
	
	public Vehicle(int maxSpeed, String model, double price) throws SpeedException, PriceException{
		super();
		setMaxSpeed(maxSpeed);
		setModel(model);
		setPrice(price);
	}
	
	abstract int calcPromo();

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) throws SpeedException{
		if (maxSpeed <= 0) {
			throw new SpeedException();
		}
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) throws PriceException{
		if(price <= 0) {
			throw new PriceException();
		}
		Price = price;
	}
	
	
}
