
public class Test {

	public static void main(String[] args) {

		
		
		try{
			Ship titanic = new Ship(100, "Negur", 20, 1, 2);
			System.out.println(titanic.getMaxSpeed());
			System.out.println(titanic.getPrice());
		}
		catch (PriceException e) {
			System.out.println(e.getMessage());
		}
		catch (SpeedException e) {
			System.out.println(e.getMessage());
		}

	}

}
