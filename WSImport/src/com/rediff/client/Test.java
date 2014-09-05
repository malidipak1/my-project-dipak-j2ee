package com.rediff.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String arg[]) {
		
		String abs = "Specifications test charÛ in string ÀÛ ";
		
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
		hsMap.put("À" ,"A"); hsMap.put("Á","A");  hsMap.put("Â","A"); 	hsMap.put("Ã","A");
		hsMap.put("Ä","A");	 hsMap.put("Å","A");  hsMap.put("Æ","AE");	hsMap.put("Ç","C");
		hsMap.put("È","E");	 hsMap.put("É","E");  hsMap.put("Ê","E");	hsMap.put("Ë","E");
		hsMap.put("Ì","I");	 hsMap.put("Í","I");  hsMap.put("Î","I");	hsMap.put("Ï","I");
		hsMap.put("Ğ","D");	 hsMap.put("Ñ","N");  hsMap.put("Ò","O");	hsMap.put("Ó","O");
		hsMap.put("Ô","O");	 hsMap.put("Õ","O");  hsMap.put("Ö","O");	hsMap.put("Ø","O");
		hsMap.put("Ù","U");  hsMap.put("Ú","U");  hsMap.put("Û","U");  hsMap.put("Ü","U");
		hsMap.put("İ","Y");  hsMap.put("ß","s");  hsMap.put("à","a");  hsMap.put("á","a");
		hsMap.put("â","a");  hsMap.put("ã","a");  hsMap.put("ä","a");  hsMap.put("å","a");
		hsMap.put("æ","ae"); hsMap.put("ç","c");  hsMap.put("è","e");  hsMap.put("é","e");
		hsMap.put("ê","e");  hsMap.put("ë","e");  hsMap.put("ì","i");  hsMap.put("í","i");
		hsMap.put("î","i");  hsMap.put("ï","i");  hsMap.put("ñ","n");  hsMap.put("ò","o");
		hsMap.put("ó","o");  hsMap.put("ô","o");  hsMap.put("õ","o");  hsMap.put("ö","o");
		hsMap.put("ø","o");  hsMap.put("ù","u");  hsMap.put("ú","u");  hsMap.put("û","u");
		hsMap.put("ü","u");  hsMap.put("ı","y");  hsMap.put("ÿ","y");  hsMap.put("Ğ","D");
		hsMap.put("Œ","OE"); hsMap.put("œ","oe"); hsMap.put("Š","S"); 
		hsMap.put("š","s");  hsMap.put("Ÿ","Y");  hsMap.put("","Z");
		hsMap.put("","z");  hsMap.put("ƒ","f");
		
		return hsMap;
	}
	
	
}
