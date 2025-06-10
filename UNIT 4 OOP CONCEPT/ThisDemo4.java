class ThisDemo4 {
	void m1() {
		System.out.println("i am in m1 method");
		m2();         // 👈 Implicit call to m2() of current object
		// this.m2();  // 👈 Would do exactly the same
	}
	void m2()
	{
		System.out.println("i am in m2 method");
	}
	public static void main(String[] args)
	{
		ThisDemo4 ob=new ThisDemo4();
		ob.m1();
	}
}