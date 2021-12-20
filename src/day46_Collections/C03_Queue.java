package day46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		//gelen sona gelir,silinen bastan silinir
		
		
		Queue<String> kuyruk=new LinkedList<>();//queu methodlari kullanmak icin data type queue dir
		
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);
		
		kuyruk.remove();
		System.out.println(kuyruk);

		kuyruk.remove();
		System.out.println(kuyruk);//sira ile siler
	}

}
