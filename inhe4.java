class A
{
	int i,j;
	void show(){
	System.out.println("i and j are"+i+" "+j);

	}
}
class B extends A
{
	int k;
	void display()
	{
	System.out.println("i and j and k"+i+"  "+j+"  "+k);

	}
}
class inhe4{
	public static void main(String args[])
	{
	B b=new B();
	b.i=20;
	b.j=10;
	b.k=30;
	b.display();
	b.show();
	}
}