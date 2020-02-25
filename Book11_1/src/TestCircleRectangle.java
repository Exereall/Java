import java.util.Date;

class GeometricObject{
	
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		
		dateCreated=new java.util.Date();
		
	}
	
	public GeometricObject(String color ,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String NewColor) {
		this.color=NewColor;
	}
	public boolean isFilled() {
		return filled;
	}
	
	public void setFİlled(boolean itsFilled) {
		this.filled=itsFilled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public String toString () {
		return "createdon"+dateCreated+"\n COLLOR"+color+"and filled :"+filled;
	}	
}

class Circle extends GeometricObject{
	private double radius;
	
	Circle(){
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	
	
}

public class TestCircleRectangle {

}
