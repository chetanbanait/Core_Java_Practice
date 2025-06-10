
package checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis=new FileInputStream("");
        fis.read();
    }
}
