package com.luoExpress.Demo;

public class Demo_String2 {
	public static void main(String[] args) {
		demo2();
		//find(substr);
	}

/*	题目三：查询大字符串中，出现指定小字符串的次数。如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数。
	思路：1.在大串中，查找小串出现的位置，出现了就次数+1
	2.在上次小串出现位置的后面继续查找，需要更改大串的内容为上次未查询到的字符串。
	3.回到第一步，继续查找小串出现的位置，直到大串中查询不到小串为止*/

	private static void demo2() {
		String string = new String("faf'laaasa'2142141DasaaaaaSFDSczxcz");
		String substr = "aa";
		int fromIndex=0;
		int index=0;
		int times=0;
		index = string.indexOf(substr, fromIndex);
		while(index>=0){
			fromIndex = index+1;
			times++;
			System.out.println(index);
			index = string.indexOf(substr, fromIndex);
		}
		System.out.println(times);
	}

/*	题目一：获取指定字符串中，大写字母、小写字母、数字的个数。
	思路：1.为了统计大写字母、小写字母、数字的个数。创建3个计数的变量。
	2.为了获取到字符串中的每个字符，进行字符串的遍历，得到每个字符。
	3.对得到的字符进行判断，如果该字符为大写字母，则大写字母个数+1；如果该字符为小写字母，则小写字母个数+1；如果该字符为数字，则数字个数+1。
	4.显示大写字母、小写字母、数字的个数*/

	public static int find(String string) {
		int daxie = 0;
		int xiaoxie = 0;
		int shuzi = 0;
		int other=0;

		char[] arr = string.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				daxie++;
			}else if(arr[i] >= 'a' && arr[i] <= 'z'){
				xiaoxie++;
			}else if(arr[i] >= '0' && arr[i] <= '9'){
				shuzi++;
			}else{
				other++;
			}
		}
		System.out.println("大写个数"+daxie+" 小写个数"+xiaoxie+" 数字个数"+shuzi+" 其他个数"+other);
		return daxie;
	}
	
	
}
