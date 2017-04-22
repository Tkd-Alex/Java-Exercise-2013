//importa il package che contiene le classi relative agli stream
import java.io.*;
class InputDaTastiera{
	public static void main(String s[]){
		//istanzia lo stream di lettura collegandolo alla tastiera
		InputStreamReader i=new InputStreamReader(System.in);
		//aggancia il buffer allo stream
		BufferedReader t=new BufferedReader(i);
		//dichiarazione delle variabili con inizializzazione
		String frase=null;
		int numero=0;
		try{
			System.out.println("inserisci la stringa");
			//legge la stringa dal buffer
			frase=t.readLine();
			//converte il numero in intero
			numero=Integer.parseInt(frase); 
		}
		//cattura l'eccezione sul formato numerico
		catch (NumberFormatException e){
			System.out.println("Non è un numero");
		}	
		//cattura tutti i tipi di eccezione (generica)
		catch (Exception e){
			System.out.println("errore d'inserimento");
		}	
		
		
	//stampa il dato letto	
	System.out.println("stringa="+(frase+2));
        
	//stampa il numero convertito sommando 2
        System.out.println("numero="+(numero+2));
		
	}	
}