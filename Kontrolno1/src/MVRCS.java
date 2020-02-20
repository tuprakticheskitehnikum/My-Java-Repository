import java.util.ArrayList;
import java.util.Scanner;

public class MVRCS {
	ArrayList<AutomobileInquiry> molbi = new ArrayList<AutomobileInquiry>();
	int gisheNum;
	long vhodqshtNum;

	
	public MVRCS(ArrayList<AutomobileInquiry> molbi, long tekusht) {
		super();
		Scanner scan = new Scanner(System.in);
		
		this.molbi = molbi;
		this.vhodqshtNum = tekusht;
		
		System.out.println("Enter nomer na gisheto: ");
		this.gisheNum = scan.nextInt();
	}
	
	public long priemaMolba(AutomobileInquiry e) {
		e.setInquiryNum(vhodqshtNum);
		molbi.add(e);
		vhodqshtNum++;
		
		return e.getInquiryNum();
	}

	public void iztriiMolba(int vhodqshtNomerInquiry) {
		molbi.remove(vhodqshtNomerInquiry);
	}
}
