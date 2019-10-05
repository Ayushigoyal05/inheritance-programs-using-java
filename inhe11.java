class boxa
{
	int i;
	boxa(int i)
	{
	this.i=i;
	}
	void show()
	{
	System.out.println("in is"+i);
	}
}
class boxb extends boxa
{
	int j;
	boxb(boxb m)
	{
	j=m.j;
	}
	void show()
	{
	System.out.println("i and j are"+i+" "+j);
	}
}
class boxc extends boxb
{ int k;
boxc(int c, int d,int e)
{
	i=c;
	j=d;
	k=e;
}	
void display()
{
	System.out.println("i j k "+i+" "+j);
}
}
class inhe11
{
	public static void main(String args[])
	{
	boxc b=new boxc(6,7,8);
	b.display();
	b.show();
	}
}
