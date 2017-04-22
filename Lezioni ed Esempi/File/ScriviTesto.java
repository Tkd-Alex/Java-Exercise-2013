import java.io.*;
//scrittura senza PrintWriter
class ScriviTesto
{
	public static void main(String[] argv)
	{
	char c;
	String s="";
	FileWriter f=null;
	InputStreamReader i=new InputStreamReader(System.in);
	
	try
	{
	f=new FileWriter("test1.txt",false);
	for(int h=0;h<3;h++)
	{
	while ((c=(char)i.read())!='\n')
               s=s+c;
	s=s+'\n';
	f.write(s);
	s="";
	}
	}
	catch (IOException e){
		System.out.println(e.getMessage());	}
	finally
	{
		try
		{
		 f.close();}
		 catch (IOException e)
		 {System.out.println(e.getMessage());}
	}
		System.out.println(s);	
	
		}
}

