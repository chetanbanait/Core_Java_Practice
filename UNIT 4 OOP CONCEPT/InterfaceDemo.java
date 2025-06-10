interface I1
{
	void show1();	
}
interface I2
{
	void show2();
}
interface I3
{

}
class A
{

}
class InterfaceDemo extends A implements I1, I2, I3
{
	public void show1() {
	System.out.println("show1() from I1 interface");
	}

	public void show2() {
	System.out.println("show2() from I2 interface");
	}

		public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.show1();
		obj.show2();
}

}