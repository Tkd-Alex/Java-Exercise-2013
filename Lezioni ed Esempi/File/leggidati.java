import java.io.*;

class leggidati
{
public static void main(String argv[])
{ 
  Persona p;  
  
     
try
{

FileInputStream f=new FileInputStream("elenco.dat");
ObjectInputStream fin= new ObjectInputStream(f);

while(true)
{
	try
	{ 
	  p=(Persona) fin.readObject();
	  System.out.println("\nnome: "+p.nome);
	  System.out.println("\neta': "+p.eta);
	}
	catch (EOFException e)
	{
	break;
	}
}
f.close();
}

catch(Exception e)
{
 System.out.println("eccezione"+ e.getMessage()); 
}
}
}