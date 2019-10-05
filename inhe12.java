class A
{
	void show()
	{
	System.out.println("A method");
	}
}
class B extends A
{
	void show()
	{
	System.out.println("B method");

	}
}
class C extends B
{
	void show()
	{
	System.out.println("C method");
	
	}
}
class inhe12
{
	public static void main(String args[])
	{
	C c=new C();
	B b=new B();
	A a=new A();
	c.show();
	a.show();
	}
}