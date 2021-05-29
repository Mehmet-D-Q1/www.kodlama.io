
public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Class lar birden fazla interface i implemente edebilirler. Ama classlar sadece bir classı extend edebilirler.

	@Override
	public void add() {
		System.out.println("Mysql'e eklendi...");

		
	}
	

}
