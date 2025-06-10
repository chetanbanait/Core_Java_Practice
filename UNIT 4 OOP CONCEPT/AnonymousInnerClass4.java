class Vehicle
{
	Vehicle()
	{
		System.out.println("1");
	}

	void start()
	{
		System.out.println("2");
	}
}
class AnonymousInnerClass4
{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
		{
			public void start()
			{
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}