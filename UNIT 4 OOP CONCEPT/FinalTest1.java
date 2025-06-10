class A
{
	void m1()
	{
		final int a=10;
		System.out.println(a+20);
	}
	A(){
		System.out.println(" Default Constructor A");
	}
}
class FinalTest1
{
	public static void main(String[] args)
	{
		A ob=new A();
		ob.m1();
	}
}