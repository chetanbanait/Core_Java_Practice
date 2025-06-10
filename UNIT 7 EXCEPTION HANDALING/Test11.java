import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Test11
{
    public static void main(String[] args)
    {
	try
	{
		FileInputStream fis=new FileInputStream("C:/Users/cheta/OneDrive/Desktop/SMART PROGRAMMING/PROGRAM ALL/UNIT 7 EXCEPTION HANDALING/ddd.txt");
		int i=fis.read();
		System.out.println(i);
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
    }
}