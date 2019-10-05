abstract class abc
{
abstract void show();
void display()
{
	System.out.println("abc class");
}
}
class def extends abc
{
	void show()
	{
	System.out.println("def class ");
	}
}
class inhe13
{
	public static void main(String args[])
	{
	def d=new def();
	d.show();
	d.display();
	}
}