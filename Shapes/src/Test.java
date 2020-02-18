
public class Test {

	public static void main(String[] args) {
	
		
		Circle ci=new Circle();
		Circle ci1=new Circle(r);
		Square s1=new Square();
		Square s2=new Square(s);
	
		Square squares=new Square(4);
		
		squares[0]=s1;
		squares[1]=s2;
		squares[2]=new Square();
		squares[3]=new Square(5);
		
		
		
int  i,j,k;

for(i=0;i<=2;i++) {
	
	squares[i].printProperties();
}

for(j=0;j<=3;j++) {
	circles[i].printProperties();
	
}

for(k=0;k<=4;k++) {
	
	rectangles[i].printProperties();
	
	
}
		
		
	}
	
}

class Rectangle{
	
	double length;
	double width;
	
	Rectangle(double l,double w){
		
		this.length=l;
		this.width=w;
	}
	
	double calcArea() {
		
		return this.length*this.width;
		
	}
	double calcParameter() {
		return 2*(this.length*this.width);
		
	}
	
}


class Square{
	double side;
	
	Square(){
		
		side=4;
		
	}
	
	
	
	Square(double s){
		
		side=s;
	}
	
	
	double calcArea() {
		
return this.side*this.side;

	}
	
	
	double calcParameter() {
		
		
		
		
		return side;
	}
	
}


class Circle{
	
	double raidus;
	
	
	Circle(){
		raidus=4;
		}
	    Circle(double r){
		this.raidus=r;
		
	    }
		double calcArea() {
			return raidus=raidus*3.14;	
		}
		
		double calcParameter() {
			
			return 2*raidus*3.14;
		}
	
}


