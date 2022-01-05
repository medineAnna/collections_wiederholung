package grupWiederholung;

public class Scrabble {

	public static void main(String[] args) {
		/*
		 * 1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini
		 * iste. 2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya
		 * verilen kelimenin geçerli olup olmadıgını sor 2.1) Eğer yeni oyuncu verilen
		 * kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf
		 * sayısını ekleyin ve 3. adıma gidin 2.2) Eğer yeni oyuncu verilen kelimeyi
		 * geçerli olarak kabul etmesse
		 * "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
		 * 3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer
		 * devam etmek isterlerse: 3.1) Kullanıcıdan kelimeye eklemek için bir harf
		 * isteyin 3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya
		 * Sona) 3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam
		 * etmek istemezlerse: "Game Finished" yazdırın. Puanları ve kazananı ekrana
		 * yazdırın.
		 * 
		 * 
		 * 
		 * Write a Scrabble Game for two person Rules OK== 1- At the beginning Ask to
		 * first Player enter a word for starting game OK 2- Then change the player ask
		 * to new player if given word is valid or not OK i) If new player accepts the
		 * given word add number of letters in the word as points to player who wrote
		 * the word And go to step 3 OK ii) If new player does not accept the word as
		 * valid then print "Invalid word, player X(Current player) won the game" and
		 * finish the game OK 3- Ask to users if user want to continue game or not OK i)
		 * If player want to continue, OK ask to user a letter to add to word OK and ask
		 * to user side to add (beginning or end) OK then add letter to word and run
		 * step 2 OK ii) If player does not want to continue then print "Game Finished"
		 * and print points and winne
		 */
		@SuppressWarnings({})

		Oyuncu oyuncular = new Oyuncu();
		// Oyuncu oyuncu2=new Oyuncu();

		oyuncular.oyunuBaslat();
		oyuncular.ikinciOyuncu(Oyuncu.kelime);

	}

}
