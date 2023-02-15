package interfacebank;
import java.util.Scanner;
public class HDFC implements RBI {
	int amount;
	int duration;
	float amountDeposit;
	float interest;
	float total;
	@Override
	public void recurringDeposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount deposit ");
		amount=sc.nextInt();
		System.out.println("Enter the duration of deposit ");
		duration=sc.nextInt();
		amountDeposit=(ONEYEAR_INTEREST*amount)/100;
		if(duration>1)
		{
			interest=(amountDeposit*duration);
		}
		else {
			System.out.println("Invalid");
		}
		 total=amount+interest;
		
	}
public void print() {
 System.out.println("Enter the amount = "+amount);
 System.out.println("Duration of amount deposit = "+duration);
 System.out.println("Interest amount of one year = "+amountDeposit);
 System.out.println("Interst amount for morethan oneyear duration = "+interest);
 System.out.println("Total amount = "+total);
}
public static void main(String []args) {
	HDFC obj=new HDFC();
	obj.recurringDeposit();
	obj.print();
	
}
}
