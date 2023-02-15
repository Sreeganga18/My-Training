package discount;

import java.util.Scanner;

public class Onseason extends Offseason{
	public void discount(int a,int b,int c) {
		float total;
		float discount;
		float onseasonDiscount;
		total =(a+b+c);
		onseasonDiscount=(total*40)/100;
		discount=(total-onseasonDiscount);
		System.out.println("Total price = "+total);
		System.out.println("Onseason discoun = "+onseasonDiscount);
		System.out.println("Price discount = "+discount);
	}
public void print() {
	Scanner sc=new Scanner(System.in);
	String s;
	int x,y,z,x1,x2,x3;
	System.out.println("choose the season ");
	s=sc.nextLine();
	System.out.println(s);
	switch(s) {
	
	
	case "offseason":
		System.out.println("Enter the first price ");
		x=sc.nextInt();
		System.out.println("Enter the second price ");
		y=sc.nextInt();
		System.out.println("Enter the third price ");
		z=sc.nextInt();
		super.discount(x,y,z);
		break;
		
		
	case "onseason":
		System.out.println("Enter the first price ");
		x1=sc.nextInt();
		System.out.println("Enter the second price ");
		x2=sc.nextInt();
		System.out.println("Enter the third price ");
		x3=sc.nextInt();
		discount(x1,x2,x3);
		}
}
}
