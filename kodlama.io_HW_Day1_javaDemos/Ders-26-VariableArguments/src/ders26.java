
public class ders26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toplam2 = topla2(2,3,4,5);
		System.out.println(toplam2);

	}
	
	public static int  topla2(int... sayilar) // birden fazla veri yi ... şeklinde girebiliyoruz.
	{
		int toplam2 = 0;
		for(int sayi:sayilar)
		{
			toplam2 = toplam2 + sayi;
			
		}
		return toplam2;
	}

}
