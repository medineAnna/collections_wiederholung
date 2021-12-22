package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

	public static Map<Integer, String> myMap(){
		
		Map<Integer, String> ornekMap=new HashMap<>();
		
		//{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		
		ornekMap.put(101, "Ali, Can, Java");
		ornekMap.put(102, "Veli, Yan, java");
		ornekMap.put(103, "Ali, Yan, C#");
		return ornekMap;
		
	}
}
