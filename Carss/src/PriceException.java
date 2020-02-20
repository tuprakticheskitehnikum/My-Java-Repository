
public class PriceException extends Exception{

	public String getMessage(){
		return "The price must be a positive number!";
	}
}
