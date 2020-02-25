import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
	ArrayList <Object> shapes=new ArrayList<>();
	
		Square square=new Square(4.0);
		Rectangle rect=new  Rectangle(2.0, 3.0);
		TestShape t=new TestShape();
		t.ControlObject(square);
		t.ControlObject(rect);	
	}
}
class Rectangle{
	private double height;
	private double edge;
	
	public double getArea() {
		
		double area=height*edge;
		return area;
	}
	public Rectangle(double height,double edge) {
		
	this.edge=edge;
	this.height=height;
		// TODO Auto-generated constructor stub
	}
	public Rectangle() {
		
	}
	

		
}
	
class Square{
private double edge;

public double getArea( ) {
	double area= edge*edge;
	return area;
}
public Square(double edge) {
	this.edge=edge;
}
		public Square() {
			
		}
}


	
class TestShape{
		
	
	public static  void ControlObject(Object object) {
		Rectangle rect=new Rectangle(0.0,0.0);	
		Square square=new Square(0.0);
		if(object instanceof Square) {
	
			System.out.println("Square area."+square.getArea());
		
		}
		
		if(object instanceof Rectangle) {
		
		System.out.println("Ractangle area:"+rect.getArea());
		}
		else {
			System.out.println("incalid object");
		}
	}
		
}


