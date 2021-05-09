
public class ders25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		
		topla(2,5);
		
	}
	
	public static void ekle()
	{
		System.out.println("Eklendi");
	}
	
	public static void sil()
	{
		System.out.println("Silindi");
	}
	
	public static void güncelle()
	{
		System.out.println("Güncellendi");
	}
	
	
	public static int topla(int sayi1, int sayi2) // integer tipinde değer döndürür.
	{
		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		return toplam;
	
	}
	

}
