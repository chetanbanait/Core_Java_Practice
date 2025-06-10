
//package stringdemo2;

public class Test1
{
    public static void main(String[] args)
    {
       String str1=new String("deepak");
       System.out.println(str1);       
       byte[] b={97, 98,99,100}; // ascii value
       String str2=new String(b);
        System.out.println(str2);
        
        char[] c={'a','b'};
        String str3=new String(c);
        System.out.println(str3);
    }
}
