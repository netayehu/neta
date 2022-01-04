package a.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("hello");
		list.add("java");
		list.add("world");
		list.add("java");
		list.add("hello");
		
		System.out.println(list);
		System.out.println("size:" +list.size());
		System.out.println(list.get(2));// get element by index
		
		
	}
	


}
