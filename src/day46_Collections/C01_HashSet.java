package day46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		//verilen array'deki sayilari silip, unique degerlerden olusan bir array olusturun

		int arr[]= {3,4,5,3,5,6,7,8,9,3,2,5,4,6};
		
		Set<Integer> benzersiz=new HashSet<>();
		
		for (Integer each : arr) {
			benzersiz.add(each);
		}
		System.out.println(benzersiz);
		
		Object[] tekrarsizArr=benzersiz.toArray();
		System.out.println(Arrays.toString(tekrarsizArr));
	}
}
