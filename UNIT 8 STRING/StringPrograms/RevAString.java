//package StringPrograms;

public class RevAString
{
    public static void main(String[] args)
    {
        String name="CHETAN";
        
        int leng=name.length();
        String rev="";
        
        for(int i=leng-1; i>=0; i--)
        {
            //System.out.println(name.charAt(i));
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
