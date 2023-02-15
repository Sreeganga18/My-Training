package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<String> obj=new ArrayList<String>();
	obj.add("sreeganga");
	obj.add("aleena");
	obj.add("jibiya");
	obj.add("pranav");
	obj.add("Harsha");
	//System.out.println(obj);
	obj.remove(1);
	System.out.println("after deletion = "+obj);
	Collections.sort(obj);
	System.out.println("sorted elemets = "+obj);
	for(int i=0;i<obj.size();i++){
	System.out.println(obj.get(i));
	}
for(String a:obj)
{
	System.out.println(a);
}
	}
}



