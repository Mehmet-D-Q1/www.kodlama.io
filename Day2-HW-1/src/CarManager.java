
public class CarManager {

		// Araç Özellikleri:
		String Brand ;
		String Color ;
		double Height ;
		double Width ;
		double Length ;
		String Fuel ;
		int Price;
		
		
		//Constructor:
		public CarManager(String marka, String renk, double yukseklik, double genislik, double uzunluk, String yakit, int fiyat) {
			
			//This anahtar kelimesiyle "public class CarManager" clasındaki özellikleri "public CarManager" constructorın parametreleriyle eşleştirdik.
			this.Brand = marka;
			this.Color = renk;
			this.Height = yukseklik;
			this.Width = genislik;
			this.Length = uzunluk;
			this.Fuel = yakit;
			this.Price = fiyat;
			
		}
		
	
		// 1. Metodumuzu oluşturduk.
		public void secilenArac()
		{
		System.out.println("***Seçilen Araç Özellikleri: ***" + 
		"\nMarka: " + Brand + 
		"\nRenk: " + Color +  
		"\nYükseklik: " + Height + " mm" + 
		"\nGenişlik: " + Width + " mm" + 
		"\nUzunluk: " + Length + " mm" + 
		"\nYakıt: " + Fuel + 
		"\nFiyatı: " + Price + "TL'dir.");
		}
		
		// 2. Metodumuzu oluşturduk.
		public void indirimOrani()
		{
			double iskonto = 0.05;
			double indirimliFiyat = Price - (iskonto * Price);
			System.out.println("Aracın İndirimli Fiyatı: " + indirimliFiyat + " TL'dir.");
			
		}
		
		
		
		



}
