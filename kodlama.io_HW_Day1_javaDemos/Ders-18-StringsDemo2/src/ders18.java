
public class ders18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj = "Bugün hava çok güzel...  ";
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
		
		System.out.println("**********DEVAM********");
		
		
		System.out.println(mesaj.replace(' ', '-')); // boşluk karakteri yerine - karakterini ekler.
		System.out.println(mesaj.substring(6)); // mesajın 6.indexinden itibaren(6. dahil) alır.
		System.out.println(mesaj.substring(2,6)); // mesajın 2.indexinden başlar(dahil) ve 6. indexe kadar(6. dahil değil) alır.
		
		
		for(String kelime: mesaj.split(" ")) // mesaj içerisindeki herbir boşluktan sonraki metinleri ayrı ayrı yazar.
		{
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // mesajın tüm harflerini küçük harfle yazar.
		System.out.println(mesaj.toUpperCase()); // mesajın tüm harflerini büyük harfle yazar.
		System.out.println(mesaj.trim()); // mesaj metininin içerisinde başında ve sonundaki boşlukları siler.

	}
}
