import java.util.Scanner;

public class Test {

	public static void main(String []args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the purchase amount...");
		double purchaseAmaount=input.nextDouble();
		
		double tax=purchaseAmaount * 0.06;
		System.out.println("Sales tax is $"+(int)(tax*100)/100.0);		
	}
}
