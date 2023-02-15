package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayColor {
	 
		ArrayList<String>Is=new ArrayList<String>();
		
		public  void  addclr() {
		Is.add("pink");
		Is.add("Black");
		Is.add("Green");
		Is.add("blue");
		Is.add("red");
		System.out.println("Array list are = "+Is);
		 }
		 public void remove() {
			 
		Is.remove(3);
		System.out.println("After deletion = "+Is);
		 }
		 public void retrieve() {
			 String r=Is.get(1);
			 System.out.println("Retrieved elements = "+r);
		 }
		 public void iterate() {
			 System.out.println("Iterating List");
			 for(String a:Is)
				 System.out.println(a);
		 }
		 public void search() {
			 String s="pink";
			 System.out.println("Searching for "+s+" ");
			 for(int i=0;i<Is.size();i++) {
				 if(s==Is.get(i)) {
					 System.out.println("element is found");
				 }
				 else
					 System.out.println("Element not found");
			 }
		 }
		 public static void main(String []args) {
			 ArrayColor obj1=new ArrayColor();
			 obj1.addclr();
			 obj1.remove();
			 obj1.retrieve();
			 obj1.iterate();
			 obj1.search();
			 
			 
		 
		 }
		 }




	