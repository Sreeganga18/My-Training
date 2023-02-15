package discount;
import java.util.*;
public class Offseason {
	Scanner sc=new Scanner(System.in);
	public void discount(int a,int b,int c) {
		float total,discount;
		float offseasonDiscount;
		total=(a+b+c);
		offseasonDiscount=(total*15)/100;
		discount=(total-offseasonDiscount);
		System.out.println("total price  = "+total);
		System.out.println("offseason price  = "+offseasonDiscount);
		System.out.println("Discount  = "+discount);
		
		
		
					
	}

}
