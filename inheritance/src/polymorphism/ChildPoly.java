package polymorphism;

public class ChildPoly extends ParentPoly {
public void display(int a,int b) {
	super.display(15,20);
	b+=a;
	System.out.println("Child class "+b);
}
	public static void main(String[] args) {
	ChildPoly obj=new ChildPoly();
	obj.display(10,20);

	}

}
