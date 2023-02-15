package vechicle;

public class Vechicle3 extends Vechile2 {
	public void colorPrice() {
	System.out.println("Enter the vechile color = "+color);
	System.out.println("Enter the vechile price = "+price);
	
	}
	public static void main(String []args) {
		Vechicle3 obj=new Vechicle3();
		obj.read();
		obj.typeModel();
		obj.colorPrice();
		
	}
	

}
