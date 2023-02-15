package multilevel.inheritance;

public class Child extends Parent {
	public void display() {
		System.out.println("child class 1");
	}

	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.display();
		obj1.print();

	}

}
