
public class Circle {

public static void main(String[] args) {
Circle circle1=new Circle();	
System.out.println("The area of the circle of radius"+circle1);
		
	
	
	
	}

double radius;

Circle(){
	
	radius=1;
}


Circle(double newRadius){
	radius=newRadius;
	
}
	
double getArea() {
	return radius *radius *Math.PI;
	
}

double getPerimeter() {
	
	return 2* radius *Math.PI;
}	
void setRadius(double newRadius) {
		
		radius=newRadius;
		
	}

}



