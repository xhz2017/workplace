package com.luo.exception;

public class Son implements Inter {
	public static void main(String[] args) {
		method2();
	}
	public void method() {
		int[] arr = null;
		if(arr==null){
			try{
				throw new Exception("null");
			}catch(Exception e){
				//e.printStackTrace();
				e.toString();
				//throw new NullPointerException();
			}
		}
	}
	public static void method2() {
		int[] arr = null;
		if(arr==null){
			try{
				throw new Exception("null");
			}catch(Exception e){
				e.printStackTrace();
				//throw new NullPointerException();
			}
		}
	}

}
