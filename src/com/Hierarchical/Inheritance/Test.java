package com.Hierarchical.Inheritance;

public class Test {
	public static void main(String []args) {
		WbUser wb = new WbUser("Shital Babar","Shital@123","1000");
		wb.showWbUser();
		
		WpUser wp = new WpUser("Shital Babar","Shital@123","8329299851");
		wp.showWpUser();
		
		InstaUser i = new InstaUser("Shital Babar","Shital@123","babar_shital_1508","27","47");
		i.showInstaUser();
	}

}
