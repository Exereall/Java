package book11_8_5;

public class Test1 {
	
	
	public static void main(String[] args) {
	new Person().printPerson();
	new Student().printPerson();
	}

}

class Person{
	
	private String getInfo() {
		return"Person";
	}
public void printPerson() {
	
	System.out.println(getInfo());
}
}

class Student extends Person{
	private String getInfo() {
		return "Student";
	}
}
// out put Person Person