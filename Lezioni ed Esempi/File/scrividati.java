import java.io.*;


class scrividati
{
public static void main(String argv[])
{ 
  Persona p1,p2,p3;  
  
  p1=new Persona("Mario",22);    
  p2=new Persona("Anna",18);   
  p3=new Persona("Luigi",32);   
       
try
{

FileOutputStream f=new FileOutputStream("elenco.dat");
ObjectOutputStream fOut= new ObjectOutputStream(f);

fOut.writeObject(p1);
fOut.writeObject(p2);
fOut.writeObject(p3);
fOut.flush();
f.close();
}

catch(Exception e)
{
 System.out.println("eccezione"+ e.getMessage()); 
}
}
}