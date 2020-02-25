
public class PolymorphismDemo {
public static void main(String[] args) {
// egerburda static siz bir seikilde m methodunu cagırmak ıstersek bu bulundugumuz vlş
	m(new graduateStudent());
	m(new Student () );
	m(new Person ());
	m(new Object());
	
	Student s1=new Student(); // object
	Student s2= new Student();// object
Student s3=s1;	//reference
	if(s1==s2) {
		System.out.println("baban");
	} 
	
	else {
	System.out.println("anan");	
	}
	if(s1==s3) {
		System.out.println(" kardesim");
	}
	else {
		System.out.println("bacım");
	}
	
}
// eger burda variabnle methodu statictanımlamasayxdık biz burda herhangibir seikilde main
//methodunda ayrı bir cagırım yapamazsık

public static void m(Object x) {
	System.out.println(x.toString());
}
}

class graduateStudent extends Student {
	

}

class Student extends Person {

public String toString() {
	return "Student";
}
}
// burda Person klassı otamatik olarak Object classından extend edildiğin icin burda bizim 
//herahanggi bir cagırım yapmamızmıza gerek yok
/*
 * Object o=new Student();  impling casting
 * sen gucluklass object klassıdır  eger onun uzerindeen bir klassa cating yaparsak bu olur
 * fakat biz sunu  yamapayız
 * graduatedstudent gs=new Student();
 * casting Objects
 * neden castinh yaparız 
; * student b= 0 tahats not possible
 * EXPLİCT CASTİNG
 Student n=new(Student)o;
 weshould use this other case yukardaki gibi compiöler hata verir
 why casting is neccessary
 CASTİNG SUPERCLASS TO SUB CLASS
 Example
 Apple x=(Apple)fruit;
 Orange x=(Orange) fruit;
 apple is a fruit so you can always safely assing instafe of apple 
 how ever fruit is not neccesary of apple 
 */
class Person{

	public String toString() {
		return"Person";
	}
}
