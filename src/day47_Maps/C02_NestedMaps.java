package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {

		Map<String, String> ogr = new HashMap<>();
		ogr.put("isim", "Ali");
		ogr.put("soyisim", "Can");
		ogr.put("branch", "J.dev");

		Map<String, String> ogr2 = new HashMap<>();
		ogr2.put("isim", "Veli");
		ogr2.put("soyisim", "Yan");
		ogr2.put("branch", "QA");

		Map<String, String> ogr3 = new HashMap<>();
		ogr3.put("isim", "Ali");
		ogr3.put("soyisim", "Yan");
		ogr3.put("branch", "C");

		Map<String, String> ogr4 = new HashMap<>();
		ogr4.put("isim", "Ayse");
		ogr4.put("soyisim", "Can");
		ogr4.put("branch", "QA");

		System.out.println("1.Ogrenci: " + ogr);
		System.out.println("2.Ogrenci: " + ogr2);
		System.out.println("3.Ogrenci: " + ogr3);
		System.out.println("4.Ogrenci: " + ogr4);
		
		Map<String, String> ogr5 = new HashMap<>();
		ogr5.put("isim", "Ali");
		ogr5.put("soyisim", "Can");
		ogr5.put("branch", "J.dev");

		Map<Integer, Map<String, String>> sinifMap = new HashMap<>();

		sinifMap.put(101, ogr);
		sinifMap.put(102, ogr2);
		sinifMap.put(103, ogr3);
		sinifMap.put(104, ogr4);
		sinifMap.put(105, ogr5);

		System.out.print(sinifMap); 

	}

}
