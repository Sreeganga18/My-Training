package superexample;

public class Child extends Parent {
	public int number;
	public void print(int a) {
		super.number=a;
		number=a;
		
	}
	
public void display1() {
	System.out.println("number of parent class = "+super.number);
	System.out.println("class child = "+number);
}
public static void main(String []args) {
	Child obj=new Child ();
	obj.print(20);
	//obj.display();
	obj.display1();
}
}
