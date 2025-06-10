
//package stringdemo;

final class Test
{
    void greet()
    {
        System.out.println("hi");
    }
}
public class Test2 //extends Test
{
    void greet()
    {
        System.out.println("hello");
    }
    public static void main(String[] args)
    {
        Test2 t2=new Test2();
	t2.greet();
    }
}
