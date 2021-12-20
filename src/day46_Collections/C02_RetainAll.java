package day46_Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		
		Set<String> set1=new LinkedHashSet<>();//sagdaki kullancagimz methodlari icerir
		
		set1.add("Ali");
		set1.add("Mehmet Ali");
		set1.add("Hasan");
		set1.add("Kutlu");
		
		Set<String> set2=new LinkedHashSet<>();
		set2.add("Ali");
		set2.add("Mehmet Ali");
		set2.add("Medine");
		
		/*System.out.println(set1.retainAll(set2));
		System.out.println(set1);
		System.out.println(set2);*/
		
		System.out.println(set2.retainAll(set1));
		System.out.println(set1);
		System.out.println(set2);
		
	}

}
