/*
import java.util.Date;

public class TestPut {

	public static void main(String[] args) {
   Date date=null;
   m1(date);
   System.out.println(" time ::: is yours "+date);
		
	}
	
	public static void m1( Date date) {
		date=new Date();
		
	}
}
*/
// null
/*
import java.util.Date;

public class TestPut{
	
	public static void main(String[] args) {
		
		Date date=new Date(23123123);
		m1(date);
		System.out.println(date.getTime());
	}
	
	public static void m1(Date date) {
		date=new Date(8445345);
		
	}
}
*/
// out put:23123123
// anladıgım kadarıyla hiyerarşiyi anlatmaya calısıyor eğer main icinde cagırdınız objeye ne girerseniz onu vericek
/*
import java.util.Date;
class TestPut{
	
	public static void main(String[] args) {
		Date date=new Date(1234567);
		m1(date);
		System.out.println(date.getTime());
	}
	public static void m1(Date date) {	
		date.setTime(23452345);
	}
}
*/
// out put set time da verilen cıktı 23452345
// sanırım içeri girilen değeri set ile ve main içinde objeyi cagırırken
// cagırdıgınız constructordan once geliyor set constructura kendini isletiyor




