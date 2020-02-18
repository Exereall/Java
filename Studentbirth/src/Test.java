
public class Test {

	
	public static void main(String[] args) {
		Student student=new Student(1112233333,1970,5,3);
		birthdata date=student.getBirthdate();
		date.setYear(2010);
		System.out.println("Student data has been changed");
	}
}
class Student{
	
	private int  id;
	private birthdata birthdate;
	
	public Student(int ssn,int year,int month,int day)
	{
		
		id=ssn;
		birthdate=new birthdata(year,month,day);
		
	}
	
	public int getId() {
		return id;
		
	}
	public birthdata getBirthdate() {
		return birthdate;
	}
	
	
	
}
class birthdata{
	
	private int year;
	private  int month;
	private int day;
	
	public birthdata(int newYear,int newMonth,int newDay) {
		year=newYear;
		month=newMonth;
		day=newDay;
		
	}
	public void setYear(int newYear) {
		year=newYear;
	}
	
}