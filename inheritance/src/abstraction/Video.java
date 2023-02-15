package abstraction;

public class Video extends Google {
		public void searchAll() {
		System.out.println("Searching videos");
		}
public int number(int num1) {
num1++;
return num1;
}
public static void main(String []args) {
	Video obj1=new Video();
	obj1.hello();
	obj1.searchAll();
	
	System.out.println(obj1.number(123));
}
}
