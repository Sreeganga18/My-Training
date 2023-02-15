package inheritance;

public class Child extends Parent {
	public void display() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();

	}

}
