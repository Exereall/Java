
public class Test {
	
public static void main(String[] args) {
	F f1=new F();
	F f2=new F();
	// invoking 
	f1.setI(10);
	System.out.println( f1.getI());
	
 // thats mean this.i=10;
	
	f2.setI(45);
	System.out.println(f2.getI());
// thats mean this.i=45;
  f1.setI(5);
  System.out.println(f1.getI());
	System.out.println(f2.getI());
	
	F.setK(33);
	System.out.println(F.getK());
	// at here we change the variable of k to 33
	// there is no problem k is a static method so we can change it with no with any refferance
	
	
	
}
}

class F{
	
	private int i =5;
	private static double k=0;
	
	public void setI(int i) {
		this.i=i;
	}
	public double getI() {
		return i;
	}
	
	
	public static void setK(double k) {
	F.k=k; // because its static variable
	
	}
  public static double getK() {
	  return F.k;
  }
}