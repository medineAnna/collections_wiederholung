package day47_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		Map<Integer, String>sinif=new HashMap<>();//HashMap classini kullandik, Map olmaz interface

		sinif.put(101, "Ali, Can, J.dev");
		sinif.put(102, "Veli, Yan, QA");
		sinif.put(103, "Ali, Yan, C");
		
		int no=104;
		String isim="Ayse";
		String soyisim="Can";
		String branch="QA";
		
		sinif.put(no, isim + "," + soyisim + "," + branch);
		
		System.out.println(sinif);
		
		System.out.println(sinif.get(102));
		System.out.println(sinif.get(104));
		
		//map;deki tum keyler'i gorelim
		System.out.println(sinif.keySet());//int keyleri getirdi
		
		//siniftaki ogrencilerin isimlerini bir listeye ekleyip yazdirin
		List<String>valueList=new ArrayList<>(sinif.values());
		System.out.println("Value List: " + valueList);
		
		System.out.println(valueList.size());//4 
		
		List<String>isimListesi=new ArrayList<>();
		String bilgiler[]=new String[3];//3 uzunlugu array
		
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler=valueList.get(i).split(",");//3 e bolup, 3 elemani bilgilere atadik
			isimListesi.add(bilgiler[0]);//her seferind 0. elemani alir
			
		}
		System.out.println(isimListesi);
		
	}

}
