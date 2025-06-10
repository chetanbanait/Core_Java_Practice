interface A
{
	void show1()
	{
		System.out.println("1");
	}
}
interface B
{
	void show1()
	{
		System.out.println("2");
	}
}
class C implements A, B
{

}
class MultipleInheritance
{
	public static void main(String[] args)
	{
		C ob=new C();
		ob.show1();
	}
}