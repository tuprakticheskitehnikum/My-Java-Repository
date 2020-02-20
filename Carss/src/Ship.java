
public class Ship extends Vehicle implements Water{

	int tovarovm;
	int vodovm;
	
	public int getTovarovm() {
		return tovarovm;
	}

	public void setTovarovm(int tovarovm) {
		this.tovarovm = tovarovm;
	}

	public int getVodovm() {
		return vodovm;
	}

	public void setVodovm(int vodovm) {
		this.vodovm = vodovm;
	}

	public Ship(int maxSpeed, String model, double price, int tovarovm, int vodovm) throws SpeedException, PriceException{
		super(maxSpeed, model, price);
		setTovarovm(tovarovm);
		setVodovm(vodovm);
	}

	@Override
	int calcPromo() {

		
		return 0;
	}

	@Override
	public String printWater() {
		System.out.println("Tova se dviji po voda :)");
		return null;
	}

}
