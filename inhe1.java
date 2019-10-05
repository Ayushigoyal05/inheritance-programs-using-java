class A
{
	int i,j;
	void show()
	{
	System.out.println("super ob are"+i+"  "+j);
	}
}
class B extends A
{
	int k;
	void show2()
	{
	System.out.println("subob are"+i+"  "+j+"  "+k);
	}
}
class inhe1
{
	public static void main(String args[])
	{
	B b=new B();
	b.i=10;
	b.j=20;
	b.k=30;
	b.show();	
	b.show2();
}

}