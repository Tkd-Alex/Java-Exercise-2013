import java.io.*;
//copia file carattere per carattere
class CopiaFile
{
	public static void main(String[] ss)
	{
		int c;
		
		try
		{
		FileInputStream iinn=new FileInputStream("LeggiTesto1.class");
		FileOutputStream oouutt=new FileOutputStream("LeggiTesto2.class");
		while ((c=iinn.read())!=-1){
			 System.out.println(c);
			 oouutt.write(c);
		}	
		iinn.close();
		oouutt.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}