package com.luoExpress.Demo;

public class Demo_String2 {
	public static void main(String[] args) {
		demo2();
		//find(substr);
	}

/*	��Ŀ������ѯ���ַ����У�����ָ��С�ַ����Ĵ������硰hellojava,nihaojava,javazhenbang���в�ѯ���֡�java���Ĵ�����
	˼·��1.�ڴ��У�����С�����ֵ�λ�ã������˾ʹ���+1
	2.���ϴ�С������λ�õĺ���������ң���Ҫ���Ĵ󴮵�����Ϊ�ϴ�δ��ѯ�����ַ�����
	3.�ص���һ������������С�����ֵ�λ�ã�ֱ�����в�ѯ����С��Ϊֹ*/

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

/*	��Ŀһ����ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ�����
	˼·��1.Ϊ��ͳ�ƴ�д��ĸ��Сд��ĸ�����ֵĸ���������3�������ı�����
	2.Ϊ�˻�ȡ���ַ����е�ÿ���ַ��������ַ����ı������õ�ÿ���ַ���
	3.�Եõ����ַ������жϣ�������ַ�Ϊ��д��ĸ�����д��ĸ����+1��������ַ�ΪСд��ĸ����Сд��ĸ����+1��������ַ�Ϊ���֣������ָ���+1��
	4.��ʾ��д��ĸ��Сд��ĸ�����ֵĸ���*/

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
		System.out.println("��д����"+daxie+" Сд����"+xiaoxie+" ���ָ���"+shuzi+" ��������"+other);
		return daxie;
	}
	
	
}