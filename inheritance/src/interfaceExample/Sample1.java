package interfaceExample;

public class Sample1 implements Sample,Sample3 {
	public void print() {
		System.out.println("hello");
	}
	@Override
	public void display() {
		System.out.println("Display");
	}
	public void sayHi() {
		System.out.println("hello");
	}
	
		
public static void main(String []args) {
	Sample1 obj=new Sample1();
	obj.print();
	obj.display();
	obj.sayHi();

}

	
}

	






