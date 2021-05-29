
public abstract class GameCalculator {
	
	public abstract void hesapla(); // abstract metodu haline getirdik, çünkü diğer sınıflar bu metodu override ederek kullanacak ve içerisindeki işlemi kendi sınıfında tanımlayacaklar.Kendi kodunu kendi sınıfında yazmak zorunda.
	
	
	public void gameOver() // GameCalculator sınıfını kullanan diğer sınıflar bu metodu otomatik kullanacaklar. İçeriği değiştirilemez sadece burada yazan içerik işleme alınır.
	{
		System.out.println("Oyun bitti.");
	}

}
