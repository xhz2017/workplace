package com.luoExpress.Demo;

public class Demo_String {
	public static void main(String[] args) {
		demo2();
		//find(substr);
	}

/*	��Ŀ�������ַ����У���һ����ĸת���ɴ�д��������ĸת����Сд������ӡ�ı����ַ�����
	˼·��1.���ַ�����Ϊ�������֣���һ����Ϊ�ַ����е�һ����ĸ���ڶ�����Ϊʣ�µ��ַ�����
	2.�ѵ�һ�����ַ���ת���ɴ�д��ĸ���ѵڶ������ַ���ת����Сд��ĸ
	3.���������ַ���������һ�𣬵õ�һ���������ַ���*/
	private static void demo2() {
		String string = new String("faf'las'2142141DSFDSczxcz");
		String substr= string.substring(0,1).toUpperCase()+ string.substring(1).toLowerCase();
		System.out.println(substr);
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