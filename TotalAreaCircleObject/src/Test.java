
public class Test {

	public static void main(String[] args) {
		
		
		Circle [] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);
		
	}
public static  Circle[] createCircleArray() {
	
	Circle[] circleArray=new Circle[5];
	for(int i=0;i<circleArray.length;i++) {
		
	circleArray[i]=new Circle(Math.random()*1000);
	
	}
	return circleArray;
}
	
	
	public static void printCircleArray(Circle[] c) {
System.out.println( "Radius  \t\t Area .");	

for(int i=0; i<c.length;i++) {
	
	System.out.println(c[i].getRadius()+"  \t\t"+c[i].getArea());
	
}
System.out.println("___________________________________________________");
System.out.println("\t\t The total area of circle is");
sum(c);
	}


public static double sum(Circle[] c) {
	
	double sum=0;
	for(int i=0; i<c.length;i++) {
		sum+=c[i].getArea();
	}
	return sum;
}

}
class Circle{
	
	double radius;
	
	static int numberOfObjects;
	
	Circle()
	{
		radius=1;
		numberOfObjects++;
		
	}
	
	Circle(double newRadius){
		radius=newRadius;
		numberOfObjects++;
		
	}

	
	double getArea() {
		return radius*radius*(Math.PI);
	}
	
	double getRadius() {
		
		return radius;
	}
	
}