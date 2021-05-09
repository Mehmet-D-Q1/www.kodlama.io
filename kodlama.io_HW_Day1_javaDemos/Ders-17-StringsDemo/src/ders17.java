
public class ders17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj = "Bugün hava çok güzel...";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());  // Eleman sayısını verir.
		System.out.println("5. eleman: " + mesaj.charAt(4)); // 5. eleman 4. index teki elemandır.
		System.out.println(mesaj.concat(" Yaşasın!")); // mesaj stringinin sonuna ekleme yapar.
		System.out.println(mesaj.startsWith("B")); // B ile başlıyor mu?
		System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu?
		
		char[] karakterler = new char[5]; // char tipinde karakterler adında 5 elemanlı bir dizi oluşturduk.
		mesaj.getChars(0, 5, karakterler, 0); //0.indexteki karakterden 5. index teki karaktere kadar(dahil değil) karakterler dizisine 0. indeksten itibaren ata.
		System.out.println(karakterler);
		
		
		System.out.println(mesaj.indexOf('g')); // g karakterinin mesaj içerisinde kaçıncı index te olduğunu verir.(ilk bulduğunu verir.)
		System.out.println(mesaj.indexOf("hava")); // hava stringinin mesaj içerisinde kaçıncı index te olduğunu verir.(ilk bulduğunu verir.)
		
		System.out.println(mesaj.lastIndexOf("g")); //g stringinin baştan sayarak son geçen g stringini bulmaya çalışır.


	}
}
