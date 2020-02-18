
public class Test {

	public static void main(String[]args) {
		
		
		long totalms=System.currentTimeMillis();
		
		long totalS=totalms/1000;
		
		long currentS=totalS%60;
		
		long totalM=totalS/60;
		
		long currentMinute=totalM%60;
		
		long totalHours=totalM/60;
		
		long currentHour=totalHours%60;
		
	System.out.println("Current time is "+currentHour+" : "+currentMinute+" : "+currentS+"Gmt");	
	}
}
