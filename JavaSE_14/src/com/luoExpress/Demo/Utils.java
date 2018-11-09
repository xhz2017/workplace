package com.luoExpress.Demo;

import java.util.ArrayList;
import java.util.Random;

public class Utils {
	public static ArrayList init() {
		ArrayList al = new ArrayList();
		Employee em1 = new Manager("zhangshan", "123", 234.5);
		al.add(em1);
		Employee em2 = new Chef("lisi", "124");
		al.add(em2);
		Employee em3 = new Server("wangwu", "125");
		al.add(em3);
		Employee em4 = new Server("zhaoliu", "126");
		al.add(em4);
		return al;
	}

	public static String getLucy(ArrayList al) {
		int index = 0;
		Random rn = new Random();
		index = rn.nextInt(al.size());
		Employee em = (Employee) al.get(index);
		return em.getName();
	}

	public static void visit(ArrayList al) {
		for (int i = 0; i < al.size(); i++) {
			Employee em = (Employee) al.get(i);
			em.work();
			if (em instanceof Chef) {
				((Chef) em).iVip();
			}
			if (em instanceof Server) {
				((Server) em).iVip();
			}
		}
	}
	
	public static String revString(String str) {
		StringBuffer sbBuffer = new StringBuffer(str); 
		sbBuffer.reverse();
		return sbBuffer.toString();
	}
}
