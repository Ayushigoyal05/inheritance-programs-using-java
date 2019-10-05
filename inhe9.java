class box
{
	int i,j;
	void show()
	{
	System.out.println("i and j "+i+" "+j);
}}
class boxd extends box
{
	int k;
	boxd(int a,int b, int c)
	{
	i=4;
	j=7;
	k=c;
	}
	void show()
	{
	System.out.println("k is"+k+"i and j are"+i+" "+j);
	}
}
class inhe9
{
	public static void main(String args[])
	{
	boxd b=new boxd(1,2,3);
	b.show();
	}
}