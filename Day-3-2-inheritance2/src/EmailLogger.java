
public class EmailLogger extends Logger{

	@Override // Logger üzerine yeni bir şey yazdırmak(metod vs. gibi) için override ediyoruz eziyoruz.
	public void log()
	{
		System.out.println("Email yollandı...");
	}
	
}
