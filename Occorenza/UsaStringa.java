class UsaStringa {
	public static void main(String a[]){
		
		System.out.println("Inserisci la stringa.");
		Stringa s= new Stringa();
		s.setStringa(InpuT.leggiStringa());
		
		System.out.println("La stringa inserita e': "+s.getStringa());
		
		System.out.println("Inserisci il carattere da ricercare.");
		char c=InpuT.leggiCarattere();
		System.out.println("");
		System.out.println("Inserisci l'occorenza.");
		int oc=InpuT.leggiIntero();
		
		int tr=s.occorenza(c,oc);
		
		if(tr==-1)
		System.out.println("Occorenza non trovata");
		else		
		System.out.println("Posizione: "+tr);
	}
}