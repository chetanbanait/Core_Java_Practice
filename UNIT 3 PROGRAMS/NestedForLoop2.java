class NestedForLoop2
{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println("i : "+i);
			for(int j=1; j<=i; j++)
			{
				System.out.println("j : "+j);
			}
		}
	}
}