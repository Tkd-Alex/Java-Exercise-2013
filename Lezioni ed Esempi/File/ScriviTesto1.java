import java.io.*;
//scrittura con PrintWriter
class ScriviTesto1
{
	public static void main(String[] argv)
	{
	char c;
	String s="";
	FileWriter f=null;
	InputStreamReader i=new InputStreamReader(System.in);
	
	try
	{
	f=new FileWriter("test2.txt",true);
	PrintWriter p=new PrintWriter(f);	
	for(int h=0;h<3;h++)
	{
	while ((c=(char)i.read())!='\n')
               s=s+c;
	p.println(s);
	s="";
	}
	}
	catch (IOException e){
		System.out.println(e.getMessage());	}
	finally
	{
		try
		{
		 f.close();
		}
		 catch (IOException e)
		 {System.out.println(e.getMessage());}
	}
		System.out.println(s);	
	
		}
}

