class BreakDemo3
{
	public static void main(String[] args)
	{
		l1:for(int i=1; i<=5; i++)
		{
			System.out.println("i : "+i);
			l2:for(int j=1; j<=5; j++)
			{
				System.out.println("j : "+j);
				if(j==4)
				{
					break l1;
				}
			}
		}
	}
}