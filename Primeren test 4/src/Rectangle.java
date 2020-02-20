
public class Rectangle implements Movable {

	Point topLeft;
	Point botRight;
	
	
	public Rectangle(Point topLeft, Point botRight) {
		super();
		this.topLeft = topLeft;
		this.botRight = botRight;
	}

	
	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public Point getBotRight() {
		return botRight;
	}

	public void setBotRight(Point botRight) {
		this.botRight = botRight;
	}

	public void print() {
		System.out.println("Top left point (X, Y): " + topLeft.getX() + ", " + topLeft.getY() + "\tBottom Right point (X, Y): " + botRight.getX() + ", " + botRight.getY());
	}
	
	@Override
	public void moveUp(int a) {
		
		int result1 = topLeft.getY()+a;
		for(; topLeft.getY() < result1; topLeft.y++) {
			print();
		}
		int result2 = botRight.getY()+a;
		for(; botRight.getY() < result2; botRight.y++) {
			print();
		}
		print();
		
	}

	@Override
	public void moveDown(int a) {
		
		int result1 = topLeft.getY()-a;
		for(; topLeft.getY() > result1; topLeft.y--) {
			print();
		}
		int result2 = botRight.getY()-a;
		for(; botRight.getY() > result2; botRight.y--) {
			print();
		}
		print();
		

	}

	@Override
	public void moveLeft(int a) {

		int result1 = topLeft.getX()-a;
		for(; topLeft.getX() > result1; topLeft.x--) {
			print();
		}
		int result2 = botRight.getX()-a;
		for(; botRight.getX() > result2; botRight.x--) {
			print();
		}
		print();
	}

	@Override
	public void moveRight(int a) {

		int result1 = topLeft.getX()+a;
		for(; topLeft.getX() < result1; topLeft.x++) {
			print();
		}
		int result2 = botRight.getX()+a;
		for(; botRight.getX() < result2; botRight.x++) {
			print();
		}
		print();
		
	}

}
