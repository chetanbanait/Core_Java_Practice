class TernaryOperator
{
	public static void main(String[] args)
	{
		int no1=10;

		int res= (no1!=10) ? no1+10 : no1-10;
		int res1= (no1==10) ? no1+10 : no1-10;

		System.out.println(res);
		System.out.println(res1);
	}
}