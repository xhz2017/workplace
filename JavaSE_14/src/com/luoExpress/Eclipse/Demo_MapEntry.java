package com.luoExpress.Eclipse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo_MapEntry {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("zhangshan", 23);
		map.put("lisi", 24);
		map.put("wangwu", 25);
		
		for (Map.Entry<String,Integer> en:map.entrySet()) {
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		
		/*for (String key:map.keySet()) {
			System.out.println(key + "---"+map.get(key));
		}*/
	}

}
