
public class recap_demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//En Büyük Sayı Hangisi
		
		int sayi1 = 3000;
		int sayi2 = 2500;
		int sayi3 = 28800;
		
		int enBuyuk = sayi1; // enbüyük sayiyi öncesinde sayi1 olarak tanımladık.
		
		if(enBuyuk < sayi2)
		{
			enBuyuk = sayi2;
			//System.out.println("En büyük sayi2'dir.");
		}
		
		System.out.println(enBuyuk);
		
		if(enBuyuk < sayi3)
		{
			enBuyuk = sayi3;
			//System.out.println("En büyük sayi3'tür.");
		}
		
		
		System.out.println("En büyük : " + enBuyuk);
		
	}

}
