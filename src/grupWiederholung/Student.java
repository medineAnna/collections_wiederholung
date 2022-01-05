package grupWiederholung;

import java.util.Scanner;

public class Student {

	Scanner scan=new Scanner(System.in);
	String adi;
	String soyad;
	int yas;
	char cins;
	boolean okuyormu;
	
	public Student(String adi, String soyad, int yas, char cins, boolean okuyormu) {
		
		System.out.println("Lutfen yeni ismi giriniz: ");
		adi=scan.next();
		
		System.out.println("Lutfen yeni soyadinizi giriniz: ");
		soyad=scan.next();
		
		System.out.println("Lutfen yasinizi giriniz: ");
		yas=scan.nextInt();
		
		System.out.println("Cinsiyetinizi giriniz: ");
		cins=scan.next().charAt(0);
		
		System.out.println("Ogrenim durumunuzu giriniz: ");
		try {
			okuyormu=scan.nextBoolean();
		}catch (Exception e) {
			System.out.println("True veya false olarak giris yapmalisiniz..");
		}
	}


}
