import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StringSplitDemo {

	public static void main(String[] args) {

		String s = "admiaai";
		// �����ĸ���ĸ��������

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
				// System.out.println(++count+"����");
				// System.out.println(tag);
				// hm.containsKey(a[i]);
				hm.put(a[i], tag);
				tag = 0;
			}
		}

//		System.out.println();
		// ���hm����
		// �Ȼ�ȡmap���ϵ�����[��]��Set���ϣ�keySet();
		Set<String> keySet = hm.keySet();

		// ����Set���ϣ��Ϳ��Ի�ȡ������
		Iterator<String> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			String keyString = iterator.next();
			// ���˼��Ϳ���ͨ��map���ϵ�get������ö�Ӧ��ֵ
			Integer valueString = (Integer) hm.get(keyString);
			System.out.println("" + keyString + "," + valueString);
		}
	}
}