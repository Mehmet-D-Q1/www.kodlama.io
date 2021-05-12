
public class Category {
	
	private	int id; //Private olarak tanımlandığı için diğer claslardan erişilmesi getter ve setter eklenerek yapılabilir.
	private String name; //Private olarak tanımlandığı için diğer claslardan erişilmesi getter ve setter eklenerek yapılabilir.
	public String kod ="Ahmet"; //public olarak tanımlandığı için diğer claslardan erişilebilir.
	
	//Yukarıdaki Private değişkenlere getter ve setterları otomatik eklemek için değişkenlerden herhangi birtanesine sağ tıkla/source/generates getter and setters/listeden seçim yap 
	//ve neyden sonra oluşturulacağını seç ve ürete tıkla. aşağıdaki şekilde otomatik oluşturulacaktır.
	
	public Category() // parametresiz yapıcı oluşturduk.
	{
		

	}
	
	public Category(int id, String name) // parametreli yapıcı oluşturduk. Bu classın içerisindeki field değişkenleri parametrelere ayarlamak için this anahtar kelimesiyle atamak için yapıyoruz.
	{
		//this: bu classtaki demektir.
		this.id = id; //bu classtaki id değişkenine bu yapıcıdaki id parametresini tanımlıyoruz.
		this.name = name; //bu classtaki name değişkenine bu yapıcıdaki name parametresini tanımlıyoruz.
	}
	
	public int getId() // get okur.
	{
		return id ;
	}
	
	public void setId(int id) //set yazar.
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name + "!";
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
