

 class C{
	
	private int id;
	public void m1() {
	// id is not a static variable so we can not use  like in method m2	
		this.id=45;
		
	}
	public void m2() {
		C.id=45;
	}
}


 
 
public class C {

	private int p;
	
	public C() {	
		System.out.println("C's no-arg consturctor  invoked");
		this(0);
		// constructor must call the first statetment in  the function
		// this can not take this variable with function
		}
	public C(int p) {
		p=p;
	}
	
	public void setP(int p) {
		p=p;
		
	}
}



