class ConstructorDemo
{
	ConstructorDemo()
	{
		System.out.println("Default constructor");
	}
	void show()
	{
		System.out.println("show method");
	}
	public static void main(String[] args)
	{
		ConstructorDemo ob=new ConstructorDemo();
		ob.show();
	}
}