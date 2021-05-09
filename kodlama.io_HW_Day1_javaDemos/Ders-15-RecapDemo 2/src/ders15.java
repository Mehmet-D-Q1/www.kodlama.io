
public class ders15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Array oluşturma yöntemi-1--------");
		double[] myList1 = new double[4]; 
		
		for (double number:myList1)
		{
			System.out.println(number);
		}
		
		System.out.println("Array oluşturma yöntemi-2--------");
		double[] myList2 = {1,2,3,4,5,6};
		
		for (double number:myList2)
		{
			System.out.println(number);
		}
		
		System.out.println("Örnek-1--------");
		
		double[] myList3 = {1.1,2.2,3.3,4.4,5.5,6.6};
		double total = 0;
		double max = myList3[0];
		
		for (double number:myList3)
		{
			if(max < number)
			{
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam : " + total);
		System.out.println("En büyük : " + max);
		
		
		
	}

}
