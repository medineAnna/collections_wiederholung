package grupWiederholung;

public class Personel {
String isim="Merve";
String soyisim="Caliskan";
String meslek="DEV";
int yas=28;
char cins='K';
boolean calisiyormu=true;

Personel(){
	
}

public Personel(String ad, String soyad, String meslek, int i, char cins, boolean c) {
	isim=ad;
	soyisim=soyad;
	this.meslek=meslek;
	yas=i;
	cins=cins;
	calisiyormu=c;
}

}
