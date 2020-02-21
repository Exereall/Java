import java.util.Date;

public class Test {
public static void main(String[] args) {
	Student student=new Student(1111122233,"john");
	java.util.Date dateCreated=student.getDateCreated();
	dateCreated.setTime(2000000);;
	
}
}

class Student{
	private int id;
	private String name;
	private java.util.Date dateCreated;
	
	public Student(int ssn,String newName) {
		id=ssn;
		name=newName;
		dateCreated=new java.util.Date();		
	}
	public int getId() {
		return id;	
	}
	public String getName() {
	return name;	
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
}