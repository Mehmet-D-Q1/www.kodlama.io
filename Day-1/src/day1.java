
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// camelCase
				// Don't repeat yourself!
				
				
				// TEK SATIR YORUM
				
				/*
				  Ã‡OKLU
				  SATIR
				  YORUMU
				 */
				
				String internetSubeButonu = "İnternet Şubesi";
				int vade = 12;
				double dolarDun = 8.15;
				double dolarBugun = 8.18;
				boolean dolarDustumu = false;
				
				
				System.out.println("Hello World"); // Sys Ctrl + Space 
				System.out.println(internetSubeButonu); // Sysout + ctrl + space ile kÄ±sa yoldan eriÅŸebiliriz.
				System.out.println(vade);
				System.out.println(dolarDun);
				
				System.out.println("vade deÄŸeri: " + vade + " AydÄ±r");
				
				if(dolarBugun < dolarDun) // dolarBugun, dolarDun'den dÃ¼ÅŸÃ¼kse iÃ§erisindeki blok Ã§alÄ±ÅŸÄ±r.
				{
					System.out.println("Dolar dÃ¼ÅŸtÃ¼ resmi");
				}
				
				else if(dolarBugun > dolarDun) // dolarBugun, dolarDun'den bÃ¼yÃ¼kse iÃ§erisindeki blok Ã§alÄ±ÅŸÄ±r.
				{
					System.out.println("Dolar yÃ¼kseldi resmi");
				}
				
				else // yukarÄ±dakiler deÄŸilse iÃ§erisindeki blok Ã§alÄ±ÅŸÄ±r.
				
				{
					System.out.println("Dolar deÄŸiÅŸmedi resmi");
				}
				
				
				String kredi1 = "HÄ±zlÄ± Kredi1";
				String kredi2 = "HÄ±zlÄ± Kredi2";
				String kredi3 = "HÄ±zlÄ± Kredi3";
				String kredi4 = "HÄ±zlÄ± Kredi4";
				String kredi5 = "HÄ±zlÄ± Kredi5";
				String kredi6 = "HÄ±zlÄ± Kredi6";
				
				
				String[] krediler = //krediler adÄ±nda bir arraylist oluÅŸturduk.
						{ 
						"HÄ±zlÄ± Kredi1",
						"HÄ±zlÄ± Kredi2",
						"HÄ±zlÄ± Kredi3",
						"HÄ±zlÄ± Kredi4",
						"HÄ±zlÄ± Kredi5",
						"HÄ±zlÄ± Kredi6"
						};
				
				//foreach dÃ¶ngÃ¼sÃ¼:
				for(String kredi : krediler) //krediler adÄ±ndaki dizinin elemanlarÄ±nÄ± for dÃ¶ngÃ¼sÃ¼ sayesinde tek tek dolaÅŸÄ±p kredi adÄ±ndaki string veri tipindeki deÄŸiÅŸkene atanacak.	
				{
					System.out.println(kredi);
				}
				
				
				
				for(int i = 0; i<krediler.length; i++) //krediler adÄ±ndaki dizinin eleman uzunluÄŸu(0,eleman sayÄ±sÄ±-1 aralÄ±ÄŸÄ± kadar sayÄ±p 1 er arttÄ±rarak i , uzunluktan kÃ¼Ã§Ã¼k olana kadar i deÄŸiiÅŸkenine atar.)
				{
					System.out.println(krediler[i]);
				}
				
				
				// Ã–nemli Ã–rnek_1: //deÄŸer tipinde veri tutar.
				int sayi1 = 10;
				int sayi2 = 20;
				sayi1 = sayi2;
				sayi2 = 100;
				System.out.println(sayi1);
				
				
				// Ã–nemli Ã–rnek_2: //arrayler referans tipinde veri tutar.
				int[] sayilar1 = {1,2,3,4,5};
				int[] sayilar2 = {10,20,30,40,50};
				sayilar1 = sayilar2; // referans tipinde aynÄ± adresleri tutuyorlar.
				sayilar2[0] = 100;
				System.out.println(sayilar1[0]);
				System.out.println(sayilar2[0]);
				
				
				// Ã–nemli Ã–rnek_3: //Stringler iÃ§in istisnai bir durumdur. char tipindedir. yani deÄŸer tipinde iÅŸlem yaparlar. Nprmalde stringler referans tipindedirler.
				String sehir1 = "Ankara";
				String sehir2 = "İstanbul";
				sehir1 = sehir2 ;
				sehir2 = "İzmir";
				System.out.println(sehir1);
				System.out.println(sehir2);


	}

}
