package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		Map<String, Integer> ornek=new HashMap<>();
		
		ornek.put("A", 2);
		ornek.put("B", 5);
		ornek.put("C", 1);
		ornek.put("Z", 3);
		ornek.put("K", 10);
		
		System.out.println(ornek);
		System.out.println(ornek);
		
		ornek.compute("A", (key,value)-> 2*value+5);//for each ile hepsini yapabiliriz
		
		ornek.computeIfAbsent("D", v-> 20);//olmayan eleman olusturdu ve elemanlara ekledi
		ornek.computeIfAbsent("C", v->11);//C oldugu icin eklemedi
		ornek.computeIfAbsent("L", k->12);
		System.out.println(ornek);
		
		ornek.computeIfPresent("L",  (key,value)-> 2*value+5);//varsa degistircek
		System.out.println(ornek);
		

	}

}
