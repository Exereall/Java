
public class Test {
	public static void main(String[] args) {
		new A();// once super class basılır dedik simdi A ya bakalım
		// set fonksiyonu var icindeki değeri 20 almıs
		// ve 20yi 2 ile carpan bir fonksiyon 
		// dolayısı ile ilk output : i from A is 40;
		new B();
	}
}

class A{
	
	int i=7;
	public A() {
		setI(20);
		System.out.println("i from A is"+i);
	}
	public void setI(int i) {
		this.i=2*i;
	}
}
class B extends A{
	public B() {
		System.out.println("i from B is"+i); }
	public void setI(int i) {
		this.i=3*i;   }
}
