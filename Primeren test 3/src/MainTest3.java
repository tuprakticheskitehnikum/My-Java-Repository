
public class MainTest3 {

	public static void main(String[] args) {
		
		Author gosho = new Author("Gosho", "Ada", "089-378-4555");
		System.out.println(gosho.getPhone());
		
		Poem p1 = new Poem("ABCD", "aA 6", gosho);
	    Poem p2 = new Poem("DEFG", "a@A ||||||||||@@@@####6", gosho);

	    System.out.println(Poem.comparePoems(p1, p2));
	    System.out.println(p1.comparePoems(p2));
	    //p1.compare(p2);

	}

}
