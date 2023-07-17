package javaPractice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Setty {
	public static void main(String[] args) {
		
		Map<String,Integer> m= new LinkedHashMap<String,Integer>();
		m.put("watch", 75);
		m.put("clothes", 90);
		m.put("mobile", 110);
		m.put("earphones", 150);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
	}

}
