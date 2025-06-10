class Outer 
{
	class Inner 
	{
		void show2() 
		{
			System.out.println("4");
		}
	}

	void show() 
	{
		System.out.println("3");
	}

	void show3() 
	{
		Inner i = new Inner();
		i.show2();
		System.out.println("1");
	}
}

class MethodLocalInnerClass2 {
	public static void main(String[] args) {
		Outer ob = new Outer();
		ob.show3();
		ob.show();
		System.out.println("2");
	}
}
