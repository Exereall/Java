import java.util.Scanner;

public class Test {

	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter annual interst rate, e,g.,7.25");
		double annualIR=input.nextDouble();
		
		double monthlyInterestRate=annualIR/1200;
		System.out.println("Enter number of years as an integer,e.g.,5:");
		int numberOfYears=input.nextInt();
		
		System.out.println("Enter loan amount ,e.g.. ,1200000.95");
		 double loanAmaount=input.nextDouble();
		 
		 double monthlyPayment=loanAmaount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		 double totalPayment=monthlyPayment*numberOfYears*12;
		 
		 System.out.println("The monthly  payment is $"+(int)(monthlyPayment*100)/100.0);
		 System.out.println("The total payment is $ is"+(int)(totalPayment*100/100.0));
		 }
}
