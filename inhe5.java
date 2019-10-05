class A 
{
	void show()
	{
	System.out.println("first class");
	}
}
class B extends A
{
	final void show()
	{
	System.out.println("second class");
	}
}
class C extends B{
	void show()
	{
	System.out.println("third class");


	}
}
class inhe5
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	b.show();
	c.show();
	}
}