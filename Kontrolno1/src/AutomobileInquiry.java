import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutomobileInquiry {

	private String currentOwner = new String();
	private String newOwner = new String();
	private String registryNum = new String();
	long inquiryNum = 0;
	
	
	public String cityCode(String registryNum)
	{
		Pattern pattern = Pattern.compile("[A-Z]+");
		
		Matcher matcher1 = pattern.matcher(getRegistryNum());
		
		while(matcher1.find())
		{
			if(matcher1.group().length()!=0)
			{
				return matcher1.group().trim();
			}
		}
		
		return null;
		
	}
	
	public AutomobileInquiry(String currentOwner, String newOwner, String registryNum, long inquiryNum) {
		super();
		this.currentOwner = currentOwner;
		this.newOwner = newOwner;
		this.registryNum = registryNum;
		this.inquiryNum = inquiryNum;
	}
	
	
	public String getCurrentOwner() {
		return currentOwner;
	}
	public void setCurrentOwner(String currentOwner) {
		this.currentOwner = currentOwner;
	}
	public String getNewOwner() {
		return newOwner;
	}
	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}
	public String getRegistryNum() {
		return registryNum;
	}
	public void setRegistryNum(String registryNum) {
		this.registryNum = registryNum;
	}
	public long getInquiryNum() {
		return inquiryNum;
	}
	public void setInquiryNum(long inquiryNum) {
		this.inquiryNum = inquiryNum;
	}
	
	
	
}
