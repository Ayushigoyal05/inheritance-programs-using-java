class boxa
{
	int i;
	boxa(int p)
	{
	i=p;
	}
	void show()
	{
	System.out.println("in is"+i);
	}
}
class boxb extends boxa
{
	int j;
	boxb(int l, int m)
	{
	i=l;
	j=m;
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
class inhe10
{
	public static void main(String args[])
	{
	boxc b=new boxc(6,7,8);
	b.display();
	b.show();
	}
}
