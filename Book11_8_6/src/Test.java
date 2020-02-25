
public class Test {

	public static void main(String[] args) {
		A a=new A(3);
		// kitapta ağır bos yapılıyor bu noktada a nın icinde int t olsa ne 
		// olmasa ne amk cekigi bize bunu gostermeye calsıyıor
		// silincede output silmeyincede
		// önce super class basılır super class b
		
//	B's constructors is invoked
//	A's consructor is invoked

		
	}
	}

class A extends B{
	
	public A(int t) {
		System.out.println("A's consructor is invoked");
	}
}


class B{
	public B() {
		System.out.println("B's constructors is invoked");
	}
}