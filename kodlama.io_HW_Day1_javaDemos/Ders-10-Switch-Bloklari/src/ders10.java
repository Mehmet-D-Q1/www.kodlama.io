
public class ders10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char grade = 'A';
		
		switch (grade) 
		{
		case 'A': 
			System.out.println("Muhteşem Geçtiniz...");
			break;
			
		case 'B':
			System.out.println("Çok iyi Geçtiniz...");
			break;
		
		case 'C':
			System.out.println("Ortalamayla Geçtiniz...");
			break;
		
		case 'D':
			System.out.println("Malesef Kaldınız...");
			break;
			
		default: // yukarıdaki durumlar sağlanmazsa
			System.out.println("Geçersiz Not");
			
			
		}
		
		
	}

}
