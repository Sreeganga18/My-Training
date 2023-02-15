package multilevel.inheritance;

public class Child1 extends Child {
	public void display1()
	{
		System.out.println("child class 2");
	}

	public static void main(String[] args) {
		Child1 obj2=new Child1();
		obj2.display1();
		obj2.display();
		obj2.print();

	}

}
