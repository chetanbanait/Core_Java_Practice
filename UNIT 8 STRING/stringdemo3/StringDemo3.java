//package stringdemo3;

public class StringDemo3
{
    public static void main(String[] args)
    {
        String name="deepak";
        name.concat("java");
        System.out.println(name);
        
        
        StringBuffer sb=new StringBuffer("deepak");
        sb.append("java");
        System.out.println(sb);
        
        StringBuilder sbb=new StringBuilder("deepak");
        
        
        System.out.println(sb.insert(3, "abc"));
    }
}
