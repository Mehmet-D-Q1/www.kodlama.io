
public class UserManager {

	public void saveUser(User user)
	{
		System.out.println(user.getFirstName() + user.getLastName() + "kullanıcısı sisteme kayıt edildi." );
		
	}
	
	public void deleteUser(User user)
	{
		System.out.println(user.getFirstName() + user.getLastName() + "kullanıcısı sistemden silindi." );
		
	}
	
}
