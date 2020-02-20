import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Author {

	private String name;
	private String country;
	private String phone;
	
	public Author(String name, String country, String phone) {
		super();
		this.name = name;
		this.country = country;
		this.setPhone(phone);
		//this.phone = setPhone(phone); - zashto ne taka?
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone1) {
		Pattern pattern1 = Pattern.compile("\\(?([0-9]{3})\\)?( |-)?([0-9]{3})(-)?([0-9]{4})");
		
		Matcher match1 = pattern1.matcher(phone1);
				
		if(match1.find())
		{
			this.phone=match1.group(1)+"-"+match1.group(3)+"-"+match1.group(5);
		}
		
		/*
		 * String ptrn = "^(?:([0-9]{3})([0-9]{3})([0-9]{4}))|"; ptrn +=
		 * "(?:([0-9]{3})[\\-]([0-9]{3})[\\-]([0-9]{4}))|"; ptrn +=
		 * "(?:[\\(]([0-9]{3})[\\)][ ]([0-9]{3})[\\-]([0-9]{4}))$"; Pattern p =
		 * Pattern.compile(ptrn); Matcher m = p.matcher(phone1); if(m.matches()){
		 * if(m.group(1)!=null) this.phone=m.group(1)+"-"+m.group(2)+"-"+m.group(3);
		 * else if(m.group(4)!=null)
		 * this.phone=m.group(4)+"-"+m.group(5)+"-"+m.group(6); else
		 * this.phone=m.group(7)+"-"+m.group(8)+"-"+m.group(9); return; }
		 */ 


	}
		
}

