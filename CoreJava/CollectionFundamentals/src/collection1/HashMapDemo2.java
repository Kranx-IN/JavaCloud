package collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<>(); // right side angular paras are not required since java 7
		map.put("Shailesh", 8097810274L);
		map.put("sonu", 1234567890L);
		map.put("Sid", 987654321L);
		map.put(null, 0L);
		map.putIfAbsent("Sid", 987654321L);
		
		Set<String> keys = map.keySet();		//by retreiving keys we can iterate over map
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Long value = map.get(key);
			System.out.println("Key: "+key+", Value: "+value);
		}
	}

}
