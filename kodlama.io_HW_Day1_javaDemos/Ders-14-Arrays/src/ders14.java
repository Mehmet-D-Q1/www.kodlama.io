
public class ders14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------------");

		String[] ogrenciler = new String[4]; // String veri tipinde 4 elemanlı öğrenciler adında bir dizi oluşturduk.
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		System.out.println(" 2. yazım şekli dizilerle---------------------------");
		
		for(int i = 0; i < ogrenciler.length; i++) // for döngüsüyle öğrenciler dizisinin elemanlarına index numaralarıyla erişiyoruz.
		{
			System.out.println(ogrenciler[i]);
		}
		
		
		// Foreach Döngüsü ...
		System.out.println("3. yazım şekli dizilerle-----------------------------");
		
		for(String ogrenci:ogrenciler) // String veri tipindeki öğrenciler dizisindeki herbir elemanı gez ve ogrenci takma adına atar.
		{
			System.out.println(ogrenci);
		}
		
	}

}
