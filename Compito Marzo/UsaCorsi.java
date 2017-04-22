interface ICorso{
	public abstract float calcolo(float o, float c);
}

class docenti implements ICorso{
	public float calcolo(float giorni, float contributo){
		float g=giorni;
		float c=contributo;
		return g*c;
	}
}

class studenti implements ICorso{
	public float calcolo(float ore, float contributo){
		float o=ore;
		float c=contributo;
		return o*c;
	}
}

class UsaCorsi{
	public static void main(String args[]){
		float contributo,totalec=0;
		int lunghezza=0;
		System.out.println("Inserisci il contributo:");
		contributo=InpuT.leggiFloat();
		int scelta;
		
		ICorso c[];
		c = new ICorso[100];
		
		do{
			
			System.out.println("[1] Inserisci docenti al corso.");
			System.out.println("[2] Inserisci studenti al corso.");
			System.out.println("[3] Stampa totale corso.");
			System.out.println("[0] Exit");
			scelta=InpuT.leggiIntero();
			
			switch(scelta){
				
				case 1:
				
					System.out.println("Quanti docenti devi inserire?");
					int n=InpuT.leggiIntero();
					for(int a=0;a<n;a++){
						int i=lunghezza;
						c[i] = new docenti();
						System.out.println("Inserisci giorni del docente.");
						float giorni=InpuT.leggiFloat();
						totalec=totalec+c[i].calcolo(giorni,contributo);
						i++;
						lunghezza++;
					}
				
				break;
				
				case 2:
					
					System.out.println("Quanti studenti devi inserire?");
					n=InpuT.leggiIntero();
					for(int a=0;a<n;a++){
						int i=lunghezza;
						c[i] = new studenti();
						System.out.println("Inserisci ore dello studente.");
						float ore=InpuT.leggiFloat();
						totalec=totalec+c[i].calcolo(ore,contributo);
						i++;
						lunghezza++;
					}
				
					
				break;
				
				case 3:
					
					System.out.println("Totale costo: "+totalec);
					
				break;
				
				
				
			}
		}while(scelta!=0);
	}
}
