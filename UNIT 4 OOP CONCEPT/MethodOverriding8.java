class A
{
	public static void main(String[] args)
	{
		System.out.println("1");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		System.out.println("2");
	}
}
class MethodOverriding8
{
	public static void main(String[] args)
	{
		A ob3=new B();

		String[] str={"a", "b", "c"};
		B.main(str); // Will print "2"
		A.main(str); // Will print "1"
	}
}