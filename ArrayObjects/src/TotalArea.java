// 9.11
public class TotalArea {
// main method
	public static void main(String[] args) {
		// declare circle array
		Circle[] circleArray;
		//createe circleArray
		
		circleArray=createCircleArray();
		printCircleArray(circleArray);
	}
	public static Circle[] createCircleArray(){

		Circle[] circleArray=new Circle[5];
		for(int i=0; i<circleArray.length;i++)
		{
			circleArray[i]=new Circle(Math.random()*100);
		}
		return circleArray;
	}
	public static void printCircleArray(Circle[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius", "Area");
		for(int i=0;i<circleArray.length;i++){
			System.out.printf("%-30s%-15s\n"+circleArray[i].getRadius()				,circleArray[i].getArea());
}
System.out.println("---------------------------------------------------");
System.out.printf("%-30s%-15f\n"+"The total area of circles is",sum(circleArray));	
}
	
public static double sum(Circle [] c) {
double sum=0;
for(int i=0;i<c.length;i++) {
sum+=c[i].getArea();			
}
return sum;
}

}
class Circle {
double radius;
Circle(double newRadius) {
radius = newRadius;
}
public double getRadius(){
return radius;
}
public double getArea() {
return radius *radius*(Math.PI);
}
}