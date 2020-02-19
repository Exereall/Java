
public class Main {

	public static void main(String[] args) {
		Circle myCircle=new Circle(5.0);
		// created object has a value 5.0
		System.out.println("The area of thecircle of radius"+myCircle.getRadius()+"is    "+myCircle.getArea());
		// increase myCircle 's radius by %10
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		// burda get diyerek çağırdığımız radiusu 1.1 oranı ile %10 arttırıyoruz
		System.out.println("The area of the circle of radius"+myCircle.getRadius()+"is"+myCircle.getArea());
		
		System.out.println("The number of objects created is"+Circle.getNumberOfObjects());

		
		
	}
	
}

class Circle{
	// enkapsülasyonun katkıları nelerdir  bir class icindeki saklanması 
	//gereken baska biri kod yazarken sizin değerleinizi kullanırsa mesela
	// buna her yerden ulasım saglarsa buna sansı olur ki bu hic istenmeyen bir durum olcaktır tamamen tüm proje mahvolabilir
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
   // burda get radius bir accesor methodtur  acccesor methodlar diğer class larda obje olarak tanımlanabilir
		
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius >=0)?newRadius:0;
	}
	// set ise mutator methodtur içindeki öğeyi değiştirir obje çapırıldıgında refereans uzerindden bu methodlara aulasıldıgında
	// iceriği değiştirebilrisiniz
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
    return radius*radius*Math.PI;		
	}
}