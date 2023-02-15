package interfacemyexm;

public class VariMeth implements VariMath,Variii{

	@Override
	public void add() {
	System.out.println("hello");
		
	}

	public static void main(String []args) {
		VariMeth v=new VariMeth();
		v.add();
		v.print();
		System.out.println(v.a);
	}

	@Override
	public void print() {
		System.out.println("hii");
		
	}
	

	

}
