package a.collections;


import java.util.HashSet;
import java.util.Set;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("hello");
		
		System.out.println(set);
		System.out.println("size:" +set.size());
		
		
	}
	


}
