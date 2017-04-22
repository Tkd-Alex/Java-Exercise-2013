class usaAlgoritmi{
	public static void main(String args[]){
		
		Automobile a[]=new Automobile[100];
		Televisore t[]=new Televisore[100];
		mioRettangolo re[]=new mioRettangolo[100];
		
		int l1=0,l2=0,l3=0,scelta;
		
		do{
			
			System.out.println("[1] Inserisci un' automobile.");			
			System.out.println("[2] Inserisici un televisore.");
			System.out.println("[3] Ricerca di un' automobile.");
			System.out.println("[4] Ricerca di un televisore.");
			System.out.println("[5] Ordinamento array automobile.");
			System.out.println("[6] Ordinamento array televisori");
			System.out.println("[7] Stampa array automobile.");
			System.out.println("[8] Stampa array televisore.");
			System.out.println("----------------------------");
			System.out.println("[9] Inserisci un rettangolo.");
			System.out.println("[10] Ricerca di un rettangolo.");
			System.out.println("[11] Ordinamento array rettangolo.");
			System.out.println("[12] Stampa array rettangolo.");
			System.out.println("[0] Exit.");
			
			scelta=InpuT.leggiIntero();
			
			switch(scelta){
			
				case 1:
				
					System.out.println("Inserisci cilindrata auto.");
					a[l1]=new Automobile();
					a[l1].setCilindrata(InpuT.leggiFloat());
				
					l1++;
				
				break;
				
				case 2:
					
					System.out.println("Inserisci pollici televisore.");
					t[l2]=new Televisore();
					t[l2].setPollici(InpuT.leggiFloat());
					
					l2++;
				
				break;
				
				case 3:
					
					Automobile ar = new Automobile();
					System.out.println("Inserisci cilindrata auto.");
					ar.setCilindrata(InpuT.leggiFloat());
				
					if(Algoritmi.ricerca(a,ar,l1)!=-1){
						System.out.println("Elemento trovato!");
					}
					else{
						System.out.println("Elemento non trovato!");
					}
				
				break;

				case 4:
					
					Televisore tr = new Televisore();
					System.out.println("Inserisci pollici televisore.");
					tr.setPollici(InpuT.leggiFloat());
				
					if(Algoritmi.ricerca(t,tr,l2)!=-1){
						System.out.println("Elemento trovato!");
					}
					else{
						System.out.println("Elemento non trovato!");
					}
				
				break;
				
				case 5:
					
					Algoritmi.ordinamento(a,l1);
				
				break;
				
				case 6:
					
					Algoritmi.ordinamento(t,l2);
				
				break;
				
				case 7:
					
					for(int i=0;i<l1;i++){
						System.out.println(a[i]);
					}
				
				break;
				
				case 8:
					
					for(int i=0;i<l2;i++){
						System.out.println(t[i]);
					}
				
				break;
					
				case 9:
				
					System.out.println("Inserisci base rettangolo.");
					re[l3]=new mioRettangolo();
					re[l3].setBase(InpuT.leggiFloat());
					System.out.println("Inserisci altezza rettangolo.");
					re[l3].setAltezza(InpuT.leggiFloat());
				
					l3++;
				
				break;
				
				case 10:
					
					System.out.println("Inserisci base rettangolo.");
					mioRettangolo re2=new mioRettangolo();
					re2.setBase(InpuT.leggiFloat());
					System.out.println("Inserisci altezza rettangolo.");
					re2.setAltezza(InpuT.leggiFloat());
				
					if(Algoritmi.ricerca(re,re2,l3)!=-1){
						System.out.println("Elemento trovato!");
					}
					else{
						System.out.println("Elemento non trovato!");
					}
				
				break;
					
				case 11:
					
					Algoritmi.ordinamento(re,l3);
				
				break;
				
				case 12:
					
					for(int i=0;i<l1;i++){
						System.out.println(re[i]);
					}
				
				break;
			
			}
		}while(scelta!=0);
		
	}	
}