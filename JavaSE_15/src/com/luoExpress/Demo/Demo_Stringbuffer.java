package com.luoExpress.Demo;

public class Demo_Stringbuffer {
	
/*	�������������Ӧ�ķ�����Ҫ�����Լ�������API�в��ң������з���ʹ�á�
	��ָ��λ�ÿ�ʼ����ĩβ��������ȡ���ַ������������������ַ���
	��ԭ���ַ������������ݻ����ϣ�ɾ��ָ��λ���ϵ��ַ�
*/
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sdfjava,sdfsjava");
		
		while (sb.indexOf("java") > 0)
			sb.delete(sb.indexOf("java"), sb.indexOf("java") + 4);
		System.out.println(sb);
	}
}
