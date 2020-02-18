



public class Test extends Employee {
	
	public static void main(String[] args) {
		new Test ();
	}
	public Test() {
		System.out.println("(4)Persons no-arg constructors  in invoked");
	}

}
class Employee extends Person{
	
	public Employee() {
		this("(2) Invoke Employee 's overloaded consructors");
		System.out.println("(3) Invoke Employee's overloaded consructors i");
	}
	
	public Employee(String s) {
		System.out.println(s);
	}
}
class Person{
	
	
	
	public Person() {
		System.out.println("(1) Bİsmmilahirahamnirrahim");
	}
	
}