package day48_Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		/*
		 * Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak
		 * donduren bir method yaziniz. mapè { 101=Ali, Can, java, 102=Veli, Yan, java,
		 * 103=Ali, Yan, C#} Istenen dil java, Sonuc [Ali, Veli]
		 */

		Map<Integer, String> soruMap = MapOlustur.myMap();// diger class'dan cagirdik

		String istenenDil = "Java";

		System.out.println(dilBilenListe(soruMap, istenenDil));

	}

	private static List<String> dilBilenListe(Map<Integer, String> soruMap, String istenenDil) {

		List<String> dilBilenListe = new ArrayList<>();

		List<String> valueList = new ArrayList<>(soruMap.values());// collection dondurur, liste atadik
		// valueList= eleman sayisi 3 { 101=Ali, Can, java, 102=Veli, Yan, java,
		// 103=Ali, Yan, C#}
		// bu 3 elemani tek tek ele alip split ile bolup
		// dil degeri verilen input'a esit olanlarin
		// isi degerlerini dilBilenListe ekleyecegim

		String parcaliArray[] = new String[3];

		for (String each : valueList) {
			parcaliArray = each.split(", ");// [Ali, Can, Java] seklinde 3 elemanli array getrecek

			if (parcaliArray[2].equalsIgnoreCase(istenenDil)) {//2 index dil bilgisi istenene esit ise
				dilBilenListe.add(parcaliArray[0]);//
			} else {

			}
		}
		return dilBilenListe;

	}

}
