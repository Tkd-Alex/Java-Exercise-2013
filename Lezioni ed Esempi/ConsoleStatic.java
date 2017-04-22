import java.io.*;
class ConsoleStatic{
	private static InputStreamReader is=new InputStreamReader(System.in);
	private static BufferedReader t=new BufferedReader(is);	
	public static int leggiIntero(){
		int valoreLetto=0;
		try{
		     String fraseLetta=t.readLine();	
		     valoreLetto=Integer.parseInt(fraseLetta);		
		}
		catch (Exception e){
			System.out.println("errore"+e);
		}
		return valoreLetto;
	}
	public static String leggiStringa(){
		String valoreLetto="";
		try{
		     valoreLetto=t.readLine();		
		}
		catch (Exception e){
			System.out.println("errore"+e);
		}	
		return valoreLetto;
	}	
}