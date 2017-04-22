import java.io.*;
class UsaArray{
	public static void main(String s[]){
	
		Array a=null;
		int scelta=0;
		int dim=0;

		do{
			System.out.println("[1] Imposta dimensione vettore.");
			System.out.println("[2] Carica vettore.");
			System.out.println("[3] Aggiungi un elemento.");
			System.out.println("[4] Stampa vettore.");
			System.out.println("[5] Ordina vettore.");
			System.out.println("[6] Ricerca valore.");
			System.out.println("[7] Ricava numero elementi.");
			System.out.println("[8] Cancella elemento.");
			System.out.println("[9] Ricerca.");
			System.out.println("[10] Cancella.");
			System.out.println("[0] Esci.");
				
			scelta=InpuT.leggiIntero();
						
			switch (scelta){
			
			case 1:
				System.out.println("Inserisci la dimensione del vettore.");
				int dim2=InpuT.leggiIntero();
				a = new Array(dim2);
			break;
			
			case 2:
				System.out.println("Quanti elementi vuoi caricare?");
				dim=InpuT.leggiIntero();
				for(int i=0;i<dim;i++){
					System.out.println("Inserisci il "+(i+1)+"° elemento.");
					a.aggiungi(InpuT.leggiIntero());
				}
			break;
				
			case 3:
				System.out.println("Inserisci l'elemento da aggiungere.");
				a.aggiungi(InpuT.leggiIntero());			
			break;
				
			case 4:
				a.stampa();
			break;
			
			case 5:
				a.ordinamento();
			break;
			
			case 6:
				System.out.println("Inserisci il valore da cercare.");
				int val=InpuT.leggiIntero();
				int ric=a.ricerca(val);
				
				if(ric==0)
				System.out.println("Il valore "+val+" non è stato trovato.");
				else
		                System.out.println("Il valore "+val+" è stato trovato: "+ric+" volte/a.");
			break;
				
			case 7:
				System.out.println("I valori all'interno dell'array sono: "+a.getLunghezza());
					
			break;
			
			case 8:
				System.out.println("Inserisci il valore da cancellare.");
				int val2=InpuT.leggiIntero();
				a.cancella(val2);
			break;
			
			case 9:
				System.out.println("Inserisci il valore da cercare.");
				val=InpuT.leggiIntero();
				if(a.trova(val)!=-1)
				System.out.println("Valore trovato.");
				else
				System.out.println("Valore non trovato.");
			break;
				
			case 10:
				System.out.println("Inserisci il valore da cancellare.");
				val=InpuT.leggiIntero();
				a.cancella1(val);
			break;	
				
			}	
		
		}while(scelta!=0);

	}
}