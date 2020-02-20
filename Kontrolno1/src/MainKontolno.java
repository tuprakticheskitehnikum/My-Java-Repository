import java.util.ArrayList;

public class MainKontolno {

	public static void main(String[] args) {
		//CA1212PB
		//A9823CA
		
		AutomobileInquiry Gosho = new AutomobileInquiry("Gosho", "Tosho", "A9823CA", 0);
		
		/*
		 * String city = Gosho.cityCode(Gosho.getRegistryNum());
		 * System.out.println("City code is: "+city);
		 */
		
		
		
		ArrayList<AutomobileInquiry> Tosho = new ArrayList<AutomobileInquiry>();
		/*
		 * MVRCS Edno = new MVRCS(Tosho, 2); long vhodqshtNomer =
		 * Edno.priemaMolba(Gosho); System.out.println("Vhodqshtiq nomer e: " +
		 * vhodqshtNomer);
		 */
		
		MVRCSSofia Dve = new MVRCSSofia(Tosho, 2);
		long proba = Dve.priemaMolba(Gosho);
		System.out.println("proba = "+proba);
	}

}
