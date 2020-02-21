import java.util.Scanner;
public class TestLoan {
public static void main(String[] args) {
	
Scanner scn=new Scanner(System.in);


	System.out.println("Enter annual interest rate, for example, 8.25:");
	double annualInterstRate=scn.nextDouble();
	System.out.println("Enternumberof years a an integer");
	int numberOfYears=scn.nextInt();
	System.out.println("Enter loan amount , for example ,1200000.95");
	double loanAmount=scn.nextDouble();
	Loan loan=new Loan(annualInterstRate,numberOfYears,loanAmount) ;
	System.out.printf(" The loan was created on %s\n"+"The monthly payment is %.2f\n  The total Paymentis %.2f\n",loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
	
}
}

class Loan{
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmaount;
	private java.util.Date loanDate;
	public Loan(){
	this(2.5,1, 1000);
	}
	Loan(double annualInterestRate ,int  numberOfYears,double loanAmount){	
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public int getNumberofYears() {
		return numberOfYears;
	}
	
	public double LoanAmount() {
		return loanAmaount;
	}
	public java.util.Date getLoanDate(){
	return loanDate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public void setNumberOfYears(int  years) {
		this.numberOfYears=years;
	}
	
	public void setLoanAmount(double loann) {
		
		this.loanAmaount=loann;
	}
	public double getMonthlyPayment() {
		double monthlyInterestRate=annualInterestRate/1200;
		double monthlyPayment=loanAmaount*monthlyInterestRate/1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
	return monthlyPayment;
	}
	public double getTotalPayment() {
		double totalPayment=getMonthlyPayment()*numberOfYears*12;
		return totalPayment;
	}
	}