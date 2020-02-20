
public class MainTest4 {

	public static void main(String[] args) {
		Point kur = new Point(5,5);
		
		kur.moveUp(4);
		kur.moveRight(3);
		kur.moveDown(2);
		kur.moveRight(3);
		
		System.out.println();
		System.out.println();
		
		Circle kurr = new Circle(kur,2);
		kurr.moveLeft(5);
		kurr.moveDown(2);
		
		Point uno = new Point(7, 6);
		System.out.println("Point uno (" + uno.getX() + ", " + uno.getY() + ") is in the circle: " + kurr.isInside(uno));
		
		System.out.println();
		System.out.println();
		
		Point botR = new Point(9,3);
		Rectangle rkur = new Rectangle(kur, botR);
		rkur.moveUp(2);
		System.out.println();
		rkur.moveDown(2);
		System.out.println();
		rkur.moveLeft(2);
		System.out.println();
		rkur.moveRight(2);

	}

}
