
public class ders22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tanım: sayıların kendileri hariç pozitif tam bölenlerinin toplamı diğer sayıya eşitse bu sayılara "Arkadaş Sayılar" denir.
		
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i = 1; i < sayi1; i++) // i=1 den başlayarak sayi1 sayısına kadar 1 er artıracak.
		{
			if(sayi1 % i == 0) // eğer sayi1 sayısı  her bir i değişkenine tam bölünüyorsa
			{
				toplam1 = toplam1 + i; // i değişkenini toplam1 değişkeniyle toplayıp yine toplam1 değişkenine atayacak.
									   // Bu şekilde sayi1 değerinin tam bölenlerinin toplamı bulunmuş olacak.
			}
		}
		
		for(int i = 1; i < sayi2; i++) // i=1 den başlayarak sayi2 sayısına kadar 1 er artıracak.
		{
			if(sayi2 % i == 0) // eğer sayi2 sayısı  her bir i değişkenine tam bölünüyorsa
			{
				toplam2 = toplam2 + i;// i değişkenini toplam2 değişkeniyle toplayıp yine toplam2 değişkenine atayacak.
				   					  // Bu şekilde sayi2 değerinin tam bölenlerinin toplamı bulunmuş olacak.
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) // Arkadaş sayıların kuralının sağlanıp sağlanmadığı kontrol ediliyor.
		{
			System.out.println("Bu iki sayı arkadaş sayıdır...");
		}
		else
		{
			System.out.println("Bu iki sayı arkadaş sayı değildir...");
		}

	}

}
