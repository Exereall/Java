
public class Test {

	public static void main(String[] args) {
		Circle myCircle=new Circle(1);
		
	int  n=5;
	printAreas(myCircle,n);
	
	System.out.println("\n"+"Radius is "+myCircle.getRadius());
	System.out.println(" n is "+n);
		
			}
	
	public static void printAreas(Circle c,int times) {
		
		System.out.println("Radius \t\t area");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
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