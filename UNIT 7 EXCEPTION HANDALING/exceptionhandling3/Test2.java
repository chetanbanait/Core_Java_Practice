
//package exceptionhandling3;

public class Test2
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("hiiii");
        }
    }
}
