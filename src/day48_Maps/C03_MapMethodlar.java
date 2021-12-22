package day48_Maps;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlar {

	public static void main(String[] args) {
		
		Map<Integer, String>ornek= MapOlustur.myMap();//ornege myMap classin elemanlari geldi atadik
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110));// keyler 110 iceriyormu true/false doner, FALSE
		
		System.out.println(ornek.containsValue("Java"));//false doner
		
		System.out.println(ornek.containsValue("Mustafa, Kan, Java"));//TRUE
		
		Set<Entry<Integer, String>>entrySet=ornek.entrySet();//her bir eleman entry(giris) 101=Ali, Can, Java gibi

		int sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ".entry : " + each);
			sayac++;
		}
		System.out.println(ornek.getOrDefault(110, "Girilen key map'de yok"));
		System.out.println(ornek.getOrDefault(103, "Girilen key map'de yok"));
		
		ornek.putIfAbsent(103, "Ali, Can, C#");//eklemeyecek
		ornek.putIfAbsent(110, "Fikri, Yan, QA");//ekleyecek
		
	}

}
