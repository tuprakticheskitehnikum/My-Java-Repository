import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {

	private String title;
	private String content;
	private Author author;
	
	public Poem(String title, String content, Author author) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
		
	}
	
	public static boolean comparePoems(Poem p1, Poem p2) {
		
		String stripp1 = stripPoem(p1.content);
		String stripp2 = stripPoem(p2.content);
		
		if (stripp1.equals(stripp2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean comparePoems(Poem p) {
		return Poem.comparePoems(this, p);
	}
	
	private static String stripPoem(String poem) {
		StringBuilder strippedPoem = new StringBuilder(poem.length());
		
		Pattern pattern1 = Pattern.compile("[a-zA-Z0-9]+");
		
		Matcher match1 = pattern1.matcher(poem);
		
		while(match1.find()) {
			strippedPoem.append(match1.group().toLowerCase());
		}
		
		//System.out.println(strippedPoem.toString());
		
		return strippedPoem.toString();
	}
	
}
