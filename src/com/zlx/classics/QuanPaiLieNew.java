package com.zlx.classics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Title:ȫ�����㷨
 * </p>
 * 
 * <p>
 * Copyright: http://blog.csdn.net/sunyujia/
 * </p>
 * 
 * @author ���ڼ�
 * @main sunyujia@yahoo.cn
 * @date 2009-04-25 23:57:23 PM
 */
public class QuanPaiLieNew {
	// ��NUM����Ϊ����������ĳ��ȼ�ʵ��ȫ����
	private static int NUM = 4;

	/**
	 * �ݹ��㷨�������ݷ�Ϊ�����֣��ݹ齫���ݴ�������Ҳ�ʵ��ȫ����
	 * 
	 * @param datas
	 * @param target
	 */
	private static void sort(List datas, List target) {
		if (target.size() == NUM) {
			for (Object obj : target)
				System.out.print(obj);
			System.out.println();
			//return;
		}
		for (int i = 0; i < datas.size(); i++) {
			List newDatas = new ArrayList(datas);
			List newTarget = new ArrayList(target);
			newTarget.add(newDatas.get(i));
			newDatas.remove(i);
			sort(newDatas, newTarget);
		}
	}

	public static void main(String[] args) {
		String[] datas = new String[] { "a", "b", "c", "d" };
		//System.out.println(Arrays.asList(datas));
		sort(Arrays.asList(datas), new ArrayList());
	}

}