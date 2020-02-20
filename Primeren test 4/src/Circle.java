
public class Circle implements Movable{

	Point center;
	int radius;
	
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	

	public void print(int x, int y) {
		
		System.out.println("Center (X, Y): " + x + ", " + y + "\tRadius: " + this.radius);
	}
	
	
	@Override
	public void moveUp(int a) {
		
		int result=center.getY()+a;
		for(; center.getY() < result; center.y++) {
			print(this.center.getX(),this.center.getY());
		}
		print(this.center.getX(),this.center.getY());
		
	}

	@Override
	public void moveDown(int a) {
		int result=center.getY()-a;
		for(; center.getY() > result; center.y--) {
			print(this.center.getX(),this.center.getY());
		}
		print(this.center.getX(),this.center.getY());
		
	}

	@Override
	public void moveLeft(int a) {
		int result=center.getX()-a;
		for(; center.getX() > result; center.x--) {
			print(this.center.getX(),this.center.getY());
		}
		print(this.center.getX(),this.center.getY());
		
	}

	@Override
	public void moveRight(int a) {
		int result=center.getX()+a;
		for(; center.getX() < result; center.x++) {
			print(this.center.getX(),this.center.getY());
		}
		print(this.center.getX(),this.center.getY());
		
	}
	
	/*
	public boolean isInsideSq(Point a) {
		if ( (a.y > this.center.y+radius || a.y < this.center.y-radius) || (a.x > this.center.x+radius || a.x < this.center.x-radius) ) {
			return false;
		}
		return true;
	}
	*/

	public boolean isInside(Point a) {
		double length = Math.abs(a.getX()-center.getX()); 
		double height = Math.abs(a.getY()-center.getY()); 
		
		double z = Math.sqrt(length*length + height*height);
		
		if(z > radius) {
			return false;
		}
		return true;
	}
	
}
