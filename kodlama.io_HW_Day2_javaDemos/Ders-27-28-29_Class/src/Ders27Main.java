
public class Ders27Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
				
		//İnt veri tipleri value(değer) veri tipidir. Kendisi yer tutar. Stack te yer tutarlar.
		int sayi1 = 10;
		int sayi2 = 201;
		sayi2 = sayi1; // sayıların bir birini etkiliyor. (değerleri)
		sayi1 = 30;
		System.out.println(sayi2);
		
		
		//Arraylar referans tiplidirler. Birbirlerinin adreslerini(referanslarını) tutarlar. 
		//Heap bölgesinde saklanırlar. array içerisindeki elemanların in, byte olması şaşırtabilir. 
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
	}

}
