package polymorphismex;

public class PolyChild extends Poluparent {
	public void add() {
		super.add();
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Poluparent obj=new Poluparent();
		//obj.add();
		PolyChild obj1=new PolyChild();
		obj1.add();
	}

}
