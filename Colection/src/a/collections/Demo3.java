package a.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sun");
		map.put(3, "tue");
		map.put(6, "fri");

		System.out.println(map.get(6));
		System.out.println(map);
		for (Integer key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}

		System.out.println("=============");

		Map<String, String> milon = new TreeMap<String, String>();
		milon.put("Java", "a programming language");
		milon.put("table", "a  furniture");
		milon.put("dog", "an animale that barks");

		System.out.println(milon.get("dog"));

		System.out.println(milon);

		Collection<String> values = milon.values();
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("===========");

		Set<String> keys = milon.keySet();
		for (String val : values) {
			System.out.println(val);
		}
		System.out.println("===========");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word:");

	}

}
