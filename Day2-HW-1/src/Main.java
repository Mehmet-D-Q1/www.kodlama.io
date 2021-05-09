

public class Main {

	public static void main(String[] args) {
		
		CarManager carmanager1 = new CarManager("BMW","Yeşil",1389,1825,4638,"Mazot",275000);
		CarManager carmanager2 = new CarManager("Mercedes","Mavi",1405,1920,4500,"Benzin",325000);
		CarManager carmanager3 = new CarManager("Toyota","Siyah",1460,1750,4750,"Hibrid",300000);
		
		carmanager1.secilenArac();
		carmanager1.indirimOrani();
		
		
		CarManager[] properties = {carmanager1, carmanager2, carmanager3};
		for(CarManager pro : properties)
		{
			System.out.println(pro.Color);
		}
		
		

	}
	

}
