package abstraction;

public class Searching extends Google{
	public void searchAll() {
		System.out.println("Searching");
	}
public int number(int num) {
	num++;
	return num;
	
	
}

public static void main(String []args) {
	Searching obj=new Searching();
	obj.hello();
	obj.searchAll();
	
	
	System.out.println(obj.number(123));
}
}
