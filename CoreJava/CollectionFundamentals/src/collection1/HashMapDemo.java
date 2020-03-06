package collection1;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<>(); // right side angular paras are not required since java 7
		map.put("Shailesh", 8097810274L);
		map.put("sonu", 1234567890L);
		map.put("Sid", 987654321L);
		map.put(null, 0L);
		map.putIfAbsent("Sid", 987654321L);

		Long value = map.get("Shailesh");
		System.out.println("Shailesh's number is: " + value);

		System.out.println(map);
	}

}
