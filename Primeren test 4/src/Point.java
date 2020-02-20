
public class Point implements Movable {

	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void print(int x, int y) {
		
		System.out.println("X, Y: " + x + ", " + y);
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public void moveUp(int a) {
		int result=y+a;
		for(; y < result; y++) {
			print(this.x,this.y);
		}
		print(this.x,this.y);
	}
	
	public void moveDown(int a) {
		int result=y-a;
		for(; y > result; y--) {
			print(this.x,this.y);
		}
		print(this.x,this.y);
	}

	public void moveLeft(int a) {
		int result=x-a;
		for(; x > result; x--) {
			print(this.x,this.y);
		}
		print(this.x,this.y);
	}

	public void moveRight(int a) {
		int result = x+a;
		for(; x < result; x++) {
			print(this.x,this.y);
		}
		print(this.x,this.y);
	}

}
