package grupWiederholung;

import java.io.IOException;

public class StudentMain {

	public static void main(String[] args) throws IOException{
		String adi="Ahmet";
		String soyad="Aslan";
		int yas=30;
		char cins='K';
		boolean okuyormu=true;
		
		Student s1=new Student(adi, soyad, yas, cins, okuyormu);
		System.out.println(s1.adi + " " + s1.soyad + " " + s1.cins);

	}

}
