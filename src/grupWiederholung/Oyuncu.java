package grupWiederholung;

import java.util.Scanner;

public class Oyuncu {

	static Scanner scan=new Scanner(System.in);
	static String kelime="";
	char harf='a';
   
	static int puan1=0;
	static int puan2=0;

	
	
	@SuppressWarnings("static-access")
	public void oyunuBaslat() {
        
		System.out.println("OYUNCU 1-->");
		System.out.println("Oyunu baslatmak icin bir kelime giriniz: ");   // ana
		this.kelime=scan.next();
	    
	
	}
	
	@SuppressWarnings("static-access")
	public void ikinciOyuncu(String kelime) {
		
		System.out.println("\nOYUNCU 2-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n" );
		System.out.println(" Girilen kelime ge�erli mi?" + "Gecerli: 1'e BAS\nGecersiz: 2'ye BAS"   );
		int secim=scan.nextInt();
		
		switch (secim) {
		   
		    case 1:
			
			harfEklemeMethodu(this.kelime); 
			puan2+=this.kelime.length();
			birinciOyunu(this.kelime);
			
			break;
         case 2:
			
        	 System.out.println("Gecersiz Kelime. Birinci oyuncu kazandi." );
        	 System.out.println( "Birinci Oyuncunun Puan�: " + (puan1)   );
			break;
			
		default:
			break;
		}
		
		
		
		
		

		
	}

	
	
	
	
	
	@SuppressWarnings("static-access")
	private void birinciOyunu(String kelime) {
		
		
		System.out.println("\nOYUNCU 1-->");
		System.out.println("\nGirilen kelime: " + this.kelime + "\n" );
		System.out.println(" Girilen kelime gecerli mi?" + "Gecerli: 1'e BAS\nGecersiz: 2'ye BAS"   );
		int secim=scan.nextInt();
		
		switch (secim) {
		   
		    case 1:
			
			harfEklemeMethodu(this.kelime); 
			puan1+=this.kelime.length();
			ikinciOyuncu(this.kelime);
			
			break;
         case 2:
			
        	 System.out.println("Gecersiz Kelime. ikinci oyuncu kazandi");
        	 System.out.println( "ikinci Oyuncunun Puan: " + (puan2)   );
        	 
			break;
			
		default:
			break;
		}
	
		
		
	}

	
	
	
	@SuppressWarnings("static-access")
	private void harfEklemeMethodu(String kelime) {
	
		System.out.println("Kelimeye eklemek icin bir harf giriniz: ");
	    harf=scan.next().charAt(0);
	    System.out.println("Kelimenin basina eklemek icin B , kelimenin sonuna eklemek icin S tuslayiniz: ");
		char tus=scan.next().toUpperCase().charAt(0);
	    
		switch (tus) {
		case 'B':
			this.kelime=harf+kelime;
			System.out.println("Yeni olusan kelime: " + this.kelime);
			break;
        case 'S':
			this.kelime=kelime+harf;
			System.out.println("Yeni olusan kelime: " + this.kelime);
			
			break;
		
        default:
        	System.out.println("Yanlis giris tusladiniz.");
        	harfEklemeMethodu(this.kelime);
			break;
		}
		 
	    
	    
	
		
		
	}
	
	
	
	
	
	
}
