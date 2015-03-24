import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StringSplitDemo {

	public static void main(String[] args) {

		String s = "admiaai";
		// 计算哪个字母出现最多次

		String[] a = s.split("");

		System.out.println(a.length);
		int tag = 0;
		HashMap hm = new HashMap();
		int count = 0;

		for (int i = 1; i < a.length; i++) {
			// System.out.print(a[i]+",");
			if (!hm.containsKey(a[i])) {
				for (int j = 1; j < a.length; j++) {
					if (a[i].equals(a[j])) {
						++tag;
					}
				}
				// System.out.println(++count+"次数");
				// System.out.println(tag);
				// hm.containsKey(a[i]);
				hm.put(a[i], tag);
				tag = 0;
			}
		}

//		System.out.println();
		// 输出hm内容
		// 先获取map集合的所有[键]的Set集合，keySet();
		Set<String> keySet = hm.keySet();

		// 有了Set集合，就可以获取迭代器
		Iterator<String> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			String keyString = iterator.next();
			// 有了键就可以通过map集合的get方法获得对应的值
			Integer valueString = (Integer) hm.get(keyString);
			System.out.println("" + keyString + "," + valueString);
		}
	}
}