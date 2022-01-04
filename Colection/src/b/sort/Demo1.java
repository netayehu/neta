package b.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Person> list= new ArrayList<>();
		list.add(new Person(105,"ccc",35));
		list.add(new Person(105,"lll",35));
		list.add(new Person(120,"ggg",56));
		list.add(new Person(115,"ccc",20));
		list.add(new Person(108,"rrrr",50));
		list.add(new Person(134,"yyy",38));
		list.add(new Person(107,"cjj",8));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
