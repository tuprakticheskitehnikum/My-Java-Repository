import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MVRCSSofia extends MVRCS{

	public MVRCSSofia(ArrayList<AutomobileInquiry> molbi, long tekusht) {
		super(molbi, tekusht);
		
	}

	public long priemaMolba(AutomobileInquiry e) {
		
		Pattern pattern = Pattern.compile("([C]+|[CA]+|[CB]+)");
		
		Matcher matcher1 = pattern.matcher(e.getRegistryNum());
		
		while(matcher1.find())
		{
			if(matcher1.group().length()!=0)
			{
				return e.getInquiryNum();
				//super.priemaMolba(e);
			}
		}
		return 0;
	}
}
