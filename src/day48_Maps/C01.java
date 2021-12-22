package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01 {

	public static void main(String[] args) {
		/* Verilen bir String’deki harfleri
		 * ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		 * Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3 */
		
		String input="Hello";
	
		Map<String, Integer> mainMap = harfSay(input);
		System.out.println(mainMap);

	}

	private static Map<String, Integer> harfSay(String input) {
		
		Map<String, Integer>harfSayiMap=new HashMap<>();
		
		String inputArr[]=input.split("");
		
		for (String each : inputArr) {
			if (!harfSayiMap.containsKey(each)) {//icermiyorsa
				harfSayiMap.put(each, 1);
			}else {
			//	harfSayiMap.get(each)+1; girilen harfin value'sunu bulup 1 artiri
				harfSayiMap.put(each, harfSayiMap.get(each)+1);
			}
		}
		return null;
	
		
	}

}
