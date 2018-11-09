package com.luoExpress.Demo;

public class Demo_String {
	public static void main(String[] args) {
		demo2();
		//find(substr);
	}

/*	题目二：将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
	思路：1.把字符串分为两个部分，第一部分为字符串中第一个字母，第二部分为剩下的字符串。
	2.把第一部分字符串转换成大写字母，把第二部分字符串转换成小写字母
	3.把两部分字符串连接在一起，得到一个完整的字符串*/
	private static void demo2() {
		String string = new String("faf'las'2142141DSFDSczxcz");
		String substr= string.substring(0,1).toUpperCase()+ string.substring(1).toLowerCase();
		System.out.println(substr);
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
