class TryCatchFinally5
{
	public static void main(String[] args)
	{
		System.out.println("1");

		try
		{
			System.out.println(100/0);
			System.out.println("2");
		}
		finally
		{
			System.out.println("3");
		}

		System.out.println("5");
	}
}