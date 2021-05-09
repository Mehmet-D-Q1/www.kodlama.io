
public class ders19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tanım: 1 ve kendinden başka tam böleni olmayan sayıya asal sayı denir. En küçük asal sayı 2 dir.
		
		int number = 25;
		boolean Asalmi = true; //isPrime: asal sayı mı? demektir biz bunu başta true olarak tanımladık.
		System.out.println("Gririlen sayı: " + number);
			
		/*
		int remainder = number % 2; // number sayısının 2 ile bölümünden kalanı verir.
		System.out.println(remainder);
		*/
		
		if(number < 2) // eğer girilen number sayısı 2 den küçükse
		{
			Asalmi = false; // Asalmi(asal mı kontrol değişkenini) false tanımladık.
			
			System.out.println("Geçersiz bir sayı girdiniz...");
			System.out.println("Lütfen 1'den büyük bir sayı giriniz...");
			return; // retıun den sonra gelen kodlar okunmaz.
		}
		
	
		else // eğer yukarıdaki değilse(number 2 den büyük veya eşitse)
		{
		
			for(int i = 2; i< number; i++) // i=2 den başlayarak, numberdeğerine kadar 1 er artacak
			{
				if(number % i == 0) // number sayısı i değişkenine sırasıyla bölümğnden  kalanın 0 olduğunu kontrol edecek.(Tam bölünme durumunu)
									// Tam bölünme varsa zaten asal sayı değildir.
				{
					Asalmi = false; // tam bölünme yakalandığında Asalmi = false olarak tanımlanacak.
					break; //ve döngü burada kırılacak.Çünkü her hangi bir i değerinde tam bölünme varsa zaten diğerlerine bakmaya gerek yoktur. Asal değildir.
					
				}

			}

		}
		
		if(Asalmi == true) // Asalmi değişkeni true ise sayı asal olacaktır.
		{
			System.out.println("Girilen Sayı Asaldır...");
		}
		
		else // Asalmi değişkeni false ise sayı asal olmayacaktır.
		{
			System.out.println("Girilen Sayı Asal Değildir...");
		}
		

	}

}
