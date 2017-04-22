import java.io.*;
class Console{
private InputStreamReader is;
private BufferedReader t;	
public Console(){
	is=new InputStreamReader(System.in);
	t=new BufferedReader(is);
}	
public  int leggiIntero(){
	int valoreLetto=0;
	try{
	     String fraseLetta=t.readLine();	
	     valoreLetto=Integer.parseInt(fraseLetta);		
	}
	catch (Exception e){
		System.out.println("errore");
	}
	return valoreLetto;
}
public String leggiStringa(){
	String valoreLetto=null;
	try{
	     valoreLetto=t.readLine();		
	}
	catch (Exception e){
		System.out.println("errore");
	}	
	return valoreLetto;
}
	
}