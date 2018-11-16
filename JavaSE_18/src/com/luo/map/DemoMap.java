package com.luo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Mon");
		map.put("2", "Tues");
		 //visite1(map);
		visite2(map);
	}

	private static void visite2(Map<String, String> map) {
		Set<Map.Entry<String, String>> entrySet =map.entrySet();
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> en = it.next();
			String key = en.getKey();
			String value = en.getValue();
			System.out.println(key+" "+value);
		}
	}

	private static void visite1(Map<String, String> map) {
		Set<String> keySet = map.keySet();
		 Iterator<String> iterator = keySet.iterator();
		 while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value = map.get(key);
			System.out.println(key+" "+value);
		}
	}
}
