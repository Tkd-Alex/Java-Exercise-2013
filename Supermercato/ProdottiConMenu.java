import java.io.*;
class ProdottiConMenu{
	public static void main(String s[]){
		
			InputStreamReader j=new InputStreamReader(System.in);
			BufferedReader t=new BufferedReader(j);

			String scelta=null;
			int scelta2=0;
			String i2=null;
			int i=0;
			String nome=null;
			String pprezzo=null;
			float prezzo=0;
			float totale=0;
			Prodotto p[]=null;
		
			do{
				System.out.println("[1] Caricamento dei prodotti.");
				System.out.println("[2] Stampa dei prodotti.");
				System.out.println("[3] Calcolo totale del prodotti con percentuale di sconto.");
				System.out.println("[0] Esci.");
				
				try{
					scelta=t.readLine();
					scelta2=Integer.parseInt(scelta); 
				}
				
				catch (Exception e){
					System.out.println("Errore d'inserimento.");
				}	
				
					switch (scelta2){
						case 1: //Caricamento
							
						try{
							System.out.println("Quanti prodotti vuoi inserire?");
							i2=t.readLine();
							i=Integer.parseInt(i2); 
						}
						catch (Exception e){
							System.out.println("Errore d'inserimento");
						}	
						
						p=new Prodotto[i];
						
						for(int n=0;n<i;n++){
		
						try{
							System.out.println("Inserisci il nome dell " + (n+1) + "° prodotto.");
							nome=t.readLine();
							
							System.out.println("Inserisci il prezzo dell " + (n+1) + "° prodotto.");
							pprezzo=t.readLine();
							prezzo=Float.parseFloat(pprezzo); 
						}
						catch (Exception e){
							System.out.println("Errore d'inserimento.");
						}	
		
						p[n]=new Prodotto();	
							
						p[n].setNome(nome);
						p[n].setPrezzo(prezzo);
						
						}
						
						break;
						
						case 2: //Stampa
				
						System.out.println("Stampa dei prodotti inseriti:");
						
						for(int n=0;n<i;n++){
							System.out.println((n+1)+"° prodotto: "+p[n].getNome() + " / " +p[n].getPrezzo()+"€");
						}
			
		
						break;
												
						case 3: //Calcolo
				
						for(int n=0;n<i;n++){
							totale=(totale+p[n].getPrezzo());
						}
						
						if((totale>20)&&(totale<50))
							totale=totale-((totale*5)/100);
						
						else if((totale>50)&&(totale<100))
							totale=totale-((totale*10)/100);
						
						else if(totale>100)
							totale=totale-((totale*30)/100);
						
						System.out.println("Il totale dei prodotti e' "+totale+"€");

						break;
					}
			}while(scelta2!=0);
	}
}