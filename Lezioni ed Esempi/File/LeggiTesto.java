import java.io.*;
//lettura diun file di testo caratte per carattere
class LeggiTesto
{
	public static void main(String[] argv)
	{
	int c;
	String s="";
	FileReader f=null;
	try
	{
	f=new FileReader("test.txt");
	while ((c=f.read())!=-1)
	        s=s+(char)c;
	System.out.println(s);	
	 f.close();
	}
	catch (IOException e){
		System.out.println(e.getMessage());	
		}
	 }
}

