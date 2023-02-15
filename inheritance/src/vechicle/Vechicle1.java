package vechicle;
import java.util.*;
public class Vechicle1 {
	String type;
	String model;
	String color;
	float price;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter the vechile type");
		type=sc.nextLine();
		System.out.println("Enter the vechile model");
		model=sc.nextLine();
		System.out.println("Enter the vechile color");
		color=sc.nextLine();
		System.out.println("Enter the vechile price");
		price=sc.nextFloat();
		
	}

}
