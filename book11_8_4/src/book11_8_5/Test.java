package book11_8_5;


public class Test {

	public static void main(String[] args) {
		
		new Person().printPerson();
		new Student().printPerson();
	}
	
	
}
class Student extends Person{
	
	public String getInfo() {
		
		return"Student";
	}
}

class Person {
	public String getInfo() {
		return"Person";
	}
public void printPerson() {
	System.out.println(getInfo());
}
}
/* PERSON 
 * STUDENT  */

