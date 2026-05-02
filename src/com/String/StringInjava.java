package com.String;

public class StringInjava {
	
	public static void main(String [] args) {
		String s=new String("shital");
		
		s.concat("babar"); // We can not change the value in String. Because the string is immutable (not changeable)
		System.out.println(s);
		String p=s.concat("babar");
		System.out.println(p);
		
		StringBuffer sb=new StringBuffer("abc");
		sb.append("def");  //Here we can change the value.Because the StringBuffer is mutable
		System.out.println(sb);
		
		
		StringBuilder SB=new StringBuilder("xyz");
		SB.append("abc");  //Here we can change the value.Because the StringBuilder is mutable
		System.out.println(SB);
		
		
		
	}

}
