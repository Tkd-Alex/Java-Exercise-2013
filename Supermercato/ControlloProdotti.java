//Floramo Vittorio e Maggio Alessandro

//importa il package che contiene le classi relative agli stream
import java.io.*;
class ControlloProdotti{
	public static void main(String s[]){
		//istanzia lo stream di lettura collegandolo alla tastiera
		InputStreamReader j=new InputStreamReader(System.in);
		//aggancia il buffer allo stream
		BufferedReader t=new BufferedReader(j);
		//dichiarazione delle variabili con inizializzazione
		
		String i2=null;
		int i=0;
		
		try{
			System.out.println("Quanti prodotti vuoi inserire?");
			//legge la stringa dal buffer
			i2=t.readLine();
			//converte il numero in intero
			i=Integer.parseInt(i2); 
		}
		//cattura tutti i tipi di eccezione (generica)
		catch (Exception e){
			System.out.println("Errore d'inserimento");
		}	
		
		Prodotto p[]=new Prodotto[i];
		
		String nome=null;
		String pprezzo=null;
		float prezzo=0;
		
		for(int n=0;n<i;n++){
		
			try{
				System.out.println("Inserisci il nome dell " + (n+1) + "° prodotto.");
				//legge la stringa dal buffer
				nome=t.readLine();
				System.out.println("Inserisci il prezzo dell " + (n+1) + "° prodotto.");
				//legge la stringa dal buffer
				pprezzo=t.readLine();
				//converte il numero in intero
				prezzo=Float.parseFloat(pprezzo); 
			}
			//cattura tutti i tipi di eccezione (generica)
			catch (Exception e){
				System.out.println("Errore d'inserimento");
			}	
		
		p[n]=new Prodotto();	
			
		p[n].setNome(nome);
		p[n].setPrezzo(prezzo);
			
		}
		
		float totale=0;
		
		for(int n=0;n<i;n++){
			totale=(totale+p[n].getPrezzo());
		}
		
		if((totale>20)&&(totale<50))
		totale=totale-((totale*5)/100);
		
		else if((totale>50)&&(totale<100))
		totale=totale-((totale*10)/100);
		
		else if(totale>100)
		totale=totale-((totale*30)/100);
		
		
		
		System.out.println("Il totale dei prodotti e' "+totale);
	}
}