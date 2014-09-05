package com.rediff.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String arg[]) {
		
		String abs = "Specifications test char� in string �� ";
		
		System.out.println(removeAccent(abs));
		
		/*String ab = "Shop No-G32,Ground  Flour,BMC Market Bldg.Bhandup -W";
		String temp = "";
		System.out.println(ab.length());
		
		System.out.println(org.apache.commons.lang.StringUtils.substring(ab, 0, 30));
		System.out.println(org.apache.commons.lang.StringUtils.substring(ab, 30, 60));
		System.out.println(org.apache.commons.lang.StringUtils.substring(ab, 60, 85));
		*/
		/*String  a = "";
		double b = Double.parseDouble(a);
		System.out.println(b + " ----- " + a);*/
	}
	
	public static String getFirstChar(String str, int start, int end) {
		String temp = "";
		try {
			temp = str.substring(start, end);
		} catch (StringIndexOutOfBoundsException strE) {
			//temp = str.substring(0, str.length());
			strE.printStackTrace(System.out);
		} catch (Exception e) {
			temp = "";
		}
		return temp;
	}
	
	public static String removeAccent(String str) {
		
		Set set = accentChar().keySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			String ch = (String)it.next();
			str = str.replace(ch, "");
		}
		return str;
	}
	
	public static HashMap accentChar() {
		
		HashMap<String, String> hsMap = new HashMap<String, String>();
		hsMap.put("�" ,"A"); hsMap.put("�","A");  hsMap.put("�","A"); 	hsMap.put("�","A");
		hsMap.put("�","A");	 hsMap.put("�","A");  hsMap.put("�","AE");	hsMap.put("�","C");
		hsMap.put("�","E");	 hsMap.put("�","E");  hsMap.put("�","E");	hsMap.put("�","E");
		hsMap.put("�","I");	 hsMap.put("�","I");  hsMap.put("�","I");	hsMap.put("�","I");
		hsMap.put("�","D");	 hsMap.put("�","N");  hsMap.put("�","O");	hsMap.put("�","O");
		hsMap.put("�","O");	 hsMap.put("�","O");  hsMap.put("�","O");	hsMap.put("�","O");
		hsMap.put("�","U");  hsMap.put("�","U");  hsMap.put("�","U");  hsMap.put("�","U");
		hsMap.put("�","Y");  hsMap.put("�","s");  hsMap.put("�","a");  hsMap.put("�","a");
		hsMap.put("�","a");  hsMap.put("�","a");  hsMap.put("�","a");  hsMap.put("�","a");
		hsMap.put("�","ae"); hsMap.put("�","c");  hsMap.put("�","e");  hsMap.put("�","e");
		hsMap.put("�","e");  hsMap.put("�","e");  hsMap.put("�","i");  hsMap.put("�","i");
		hsMap.put("�","i");  hsMap.put("�","i");  hsMap.put("�","n");  hsMap.put("�","o");
		hsMap.put("�","o");  hsMap.put("�","o");  hsMap.put("�","o");  hsMap.put("�","o");
		hsMap.put("�","o");  hsMap.put("�","u");  hsMap.put("�","u");  hsMap.put("�","u");
		hsMap.put("�","u");  hsMap.put("�","y");  hsMap.put("�","y");  hsMap.put("�","D");
		hsMap.put("�","OE"); hsMap.put("�","oe"); hsMap.put("�","S"); 
		hsMap.put("�","s");  hsMap.put("�","Y");  hsMap.put("�","Z");
		hsMap.put("�","z");  hsMap.put("�","f");
		
		return hsMap;
	}
	
	
}
