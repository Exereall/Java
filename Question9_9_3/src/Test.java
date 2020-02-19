
public class Test {
public static void main(String[] args) {
	Circle myCircle=new Circle();
System.out.println("Radius is "+myCircle.getRadius());
	//System.out.println("Radius is"+myCircle.radius);
// soru burda neden hata vardır gayet basit cunki private bir değeri cagırmak icin sadece obje referansı yeterli değildir
	// o objenin içinde ayrıca bir get(accessor method set(mutator method bulunmak zorundadır.
	// bu kod yalnıstır ve düzeltiyorum
}
}
/*
class Circle {
	private double radius=1;
	
	public double getArea() {
		return radius *radius *(Math.PI);
	}
	
}
*/
class Circle{
	private double radius=1;

	public double getArea() {
		return radius *radius *Math.PI;
		
	}
	double  getRadius() {
		return radius;
	}
	void setRadius(double newRadius)
	{
		this.radius=newRadius;
	}
}