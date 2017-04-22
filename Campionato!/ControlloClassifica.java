class ControlloClassifica{
	public static void main(String a[]){
		
		int dim=0;
		int scelta=0;
		
		Squadra s[]=null;
		s=new Squadra[100];
		
		Squadra s2=new Squadra();
		
		do{
			System.out.println("[1] Aggiungi squadra.");
			System.out.println("[2] Ordina classifica.");
			System.out.println("[3] Stampa classifica.");
			System.out.println("[0] Esci.");
		
			scelta=InpuT.leggiIntero();	
		
			switch (scelta){
				
				case 1: //Aggiungi squadra
				s[dim]=new Squadra();	
				System.out.println("Inserisci il nome della squadra:");
				s[dim].setNome(InpuT.leggiStringa());
				System.out.println("Inserisci il numero di partite vinte:");
				s[dim].setVinte(InpuT.leggiIntero());
				System.out.println("Inserisci il numero di partite perse:");
				s[dim].setPerse(InpuT.leggiIntero());
				System.out.println("Inserisci il numero di partite pareggiate:");
				s[dim].setPareggio(InpuT.leggiIntero());
				
				dim++;
				break;
				
				case 2: //Ordina classifica
					
				for(int i=0;i<dim-1;i++){
					for(int j=i+1;j<dim;j++){
						if(s[i].Punti()<s[j].Punti()){
							s2=s[i];
							s[i]=s[j];
							s[j]=s2;
						}    
					}    
				}    
				
				break;
				
				case 3: //Stampa classifica
					
				for(int i=0;i<dim;i++){
					s[i].Stampa();
				}
				
				break;
				
			}
		}while(scelta!=0);
		
		
	}
}