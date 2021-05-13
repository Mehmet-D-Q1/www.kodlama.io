
public class Main {

	public static void main(String[] args) {

		//OgretmenKrediManeger ogretmenKrediManeger = new OgretmenKrediManeger();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManeger());
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
