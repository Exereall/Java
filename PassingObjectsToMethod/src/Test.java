
public class Test {
public static void main(String[] args) {
	Circle myCircle=new Circle(5.0);
	printCircle(myCircle);
}
public static void printCircle(Circle c) {
	System.out.println("The area of the circle of radius "+c.getRadius()+"is "+c.getArea());
	
}
}

class Circle{
	private double radius=1;
	
	private static int numberOfObjects=0;
	
	public Circle() {
		numberOfObjects++;
		
	}
	
	public Circle(double newRadius) {
		
		radius=newRadius;
		numberOfObjects++;
		
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius=(newRadius >=0)? newRadius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius* radius *(Math.PI);
	}
	
	
}