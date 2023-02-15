package constructor;

public class ChildConst extends Constructor {
	public ChildConst(int d) {
		super(10);
	
	System.out.println("child constructor "+d);
}
public static void main(String []args) {
	
	ChildConst obj=new ChildConst(12);
}
}
