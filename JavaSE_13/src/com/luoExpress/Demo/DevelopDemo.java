package com.luoExpress.Demo;

public class DevelopDemo {
	public static void main(String[] a) {
		Employee dev = new JavaDevelop("123", "allan", "develop");
		dev.work();
		Employee dev2 = new AndroidDevelop("124", "may", "develop");
		dev2.work();
		Employee dev3 = new HardwareworkDev("125", "sue", "MaintainDevelop");
		dev3.work();
		Employee dev4 = new NetworkDev("126", "cony", "MaintainDevelop");
		dev4.work();
	}
}
