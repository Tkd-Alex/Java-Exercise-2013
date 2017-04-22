import java.io.*;
//copia file riga per riga
class LeggiTesto1
{
	public static void main(String[] argv)
	{
	int c;
	String s="";
	FileReader f=null;
	try
	{
	f=new FileReader("test1.txt");
	BufferedReader r=new BufferedReader(f);
	while ((s=r.readLine())!=null)
	      System.out.println(s);	
	 r.close();
	}
	catch (IOException e){
		System.out.println(e.getMessage());	
		}
	 }
}

