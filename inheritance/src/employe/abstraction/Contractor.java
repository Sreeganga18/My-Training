package employe.abstraction;
import  java.util.Scanner;
public class Contractor extends Employee
{
Scanner sc=new Scanner(System.in);
public void calSal() {
	System.out.println("Enter the no of working hours = ");
	int n=sc.nextInt();
	float total=n*100;
	System.out.println("Your amount for"+" "+n+"hours"+" "+" "+ "is"+" "+total);
}

}
