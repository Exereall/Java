// its about "this"   
public class Test1 {
	
	
	public static void main(String[] args) {
		
		Circle c=new Circle(5);
		Circle1 c1=new Circle1(5);
		System.out.println(c);
		System.out.println(c1);
		// they are equal
		
	}
}

class Circle{
	
		private double radius;

		Circle (double Radius){
		this.radius=Radius;
		}
	public double getArea() {
		return this.radius * this.radius *Math.PI;
		
	}

	public String toString() {
		return " radius   "+ this.radius+"area"+this.getArea();
				}
}

class Circle1{
	private double radius;
	public double getArea() {
	return radius *radius *Math.PI;
	}
	Circle1(double rad){
		radius=rad;
		
	}
	
	public String toString() {
		return "radius" +radius+"area:"+getArea();
	}
}

