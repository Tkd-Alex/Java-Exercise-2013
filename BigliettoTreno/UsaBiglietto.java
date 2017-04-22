//Floramo Vittorio e Maggio Alessandro

//importa il package che contiene le classi relative agli stream
import java.io.*;
class UsaBiglietto{
	public static void main(String s[]){
		//istanzia lo stream di lettura collegandolo alla tastiera
		InputStreamReader i=new InputStreamReader(System.in);
		//aggancia il buffer allo stream
		BufferedReader t=new BufferedReader(i);
		//dichiarazione delle variabili con inizializzazione
		
		BigliettoDelTreno b = new BigliettoDelTreno();
		
		String stazpart=null;
		String stazarrivo=null;
		String stazdistanza=null;
		String stazclasse=null;
		int classe=0;
		float distanza=0;
		try{
			System.out.println("Inserisci la stazione di partenza:");
			//legge la stringa dal buffer
			stazpart=t.readLine();
			System.out.println("Inserisci la stazione di arrivo:");
			//legge la stringa dal buffer
			stazarrivo=t.readLine();
			System.out.println("Inserisci la distanza:");
			//legge la stringa dal buffer
			stazdistanza=t.readLine();
			System.out.println("Inserisci la classe:");
			//legge la stringa dal bufferMilano
			stazclasse=t.readLine();
			//converte il numero in intero
			classe=Integer.parseInt(stazclasse); 
			distanza=Float.parseFloat(stazdistanza);
			
		}
		
		//cattura tutti i tipi di eccezione (generica)
		catch (Exception e){
			System.out.println("errore d'inserimento");
		}	
		
		b.setStazpart(stazpart);
		b.setStazarrivo(stazarrivo);
		b.setStazdistanza(distanza);
		b.setStazclasse(classe);
		
		BigliettoDelTreno b2 = new BigliettoDelTreno(stazpart,stazarrivo,distanza,classe);
		
		
	//stampa il dato letto
        System.out.println("Stazione di partenza: "+b.getStazpart());
	System.out.println("Stazione di arrivo: "+b.getStazarrivo() );
        System.out.println("Distanza: "+b.getStazdistanza());
        System.out.println("Classe: "+b.getStazclasse());
	System.out.println("Prezzo: "+b.prezzo());		
	
	System.out.println("-----------------------");
	System.out.println("Stampa del parametrico: ");
	System.out.println("-----------------------");	
		
	//stampa2biglietto
        System.out.println("Stazione di partenza: "+b2.getStazpart());
	System.out.println("Stazione di arrivo: "+b2.getStazarrivo() );
        System.out.println("Distanza: "+b2.getStazdistanza());
        System.out.println("Classe: "+b2.getStazclasse());
	System.out.println("Prezzo: "+b2.prezzo());		
	
	}	
}
