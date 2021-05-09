
public class ders21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kendisini tam bölen sayıların toplamı kendisini veren sayıya mükemmel sayı denir.
		
		int number = 28;
		
		int total = 0;
		
		for(int i=1; i<number; i++) //i=1 den başlayarak number sayısına kadar 1 er artıracak.
		{
			if(number % i == 0) // eğer number sayısı  i değişkenine tam bölünüyorsa
			{
				total = total + i; // i değişkenini total değişkeniyle toplayıp yine total değişkenine atayacak.
				
			}
		}
		
		if(total == number) // yukarıda tam bölenlerin toplamını atadığımız total değişkeni number sayısına eşitse mükemmel sayıdır.
		{
			System.out.println("Mükemmel sayıdır...");
		}
		
		else // değilse mükemmel sayı değildir.
		{
			System.out.println("Mükemmel sayı değildir...");
		}

	}

}
