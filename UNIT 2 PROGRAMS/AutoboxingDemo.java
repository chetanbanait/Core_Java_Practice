class AutoboxingDemo
{
	public static void main(String[] args)
	{
		int a=10;
		Integer i=new Integer(a);
		Integer ii=a;//autoboxing (Integerii=Integer.valueOf(a))
		System.out.println(a);
		System.out.println(i);
		System.out.println(ii);
	}
}
