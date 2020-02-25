
public class CastingDemo {

	public static void main(String[] args) {
		
	}
	public static void display(Object object) {
		if(object instanceof CircleFromSimpleGeometricObject) {
			
			System.out.println("The circleare:"+CircleFromSimpleGeometricObject.getArea());
	System.out.println("The circle diameter is"+((CircleFromSimpleGeometricObject).getDiameter()));
		}
	}
}
