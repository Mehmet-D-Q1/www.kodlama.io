
public class ders23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[]{1,2,5,7,9,0}; // integer tipinde sayılar adında elemanları tanımlı(6 elemanlı) bir dizi oluşturduk.
		int aranacak = 5; // dizi içerisinde arayacağımız elemanı tanımladık.
		
		boolean varMi = false; 
		
		
		//Foreach Döngüsü 
		for(int sayi : sayilar) // sayılar adındaki dizi içerisindeki her bir elemanı gezer ve sayi adında bir değişkene atar.(Foreach Döngüsü )
		{
			if(sayi == aranacak) // atanan sayi değişkeni aranacak sayıya eşitse
			{
				varMi = true; // varMi değişkeni true yapılacak. Çünkü aranacak sayı dizi içerisinde bulunmuş olacak.
				break; // varMi = true olduğu anda Döngüyü bitirecek.
			}
		}
		
		if(varMi)
		{
			System.out.println("Sayı mevcuttur.");

		}
		else
		{
			System.out.println("Sayı mevcut değil.");
		}
		
	}

}
