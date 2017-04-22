class UsaNumeri {
	public static void main (String a[]){
		
	
		
	System.out.println("**Numeri Interi** ");
		
	System.out.print("Inserisci numero: ");
	int nint = InpuT.leggiIntero();
		
	Naturali na = new Naturali(nint);	
		
	System.out.print("Inserisci l'altro numero: ");
	int nint2 = InpuT.leggiIntero();
		
	Naturali na2 = new Naturali(nint2);		
		
	na2=na.somma(na2);
		
	System.out.print("Somma: ");	
	System.out.println(na2.getNu());
	
	na2.setNu(nint2);
	na2=na.molt(na2);
	
	System.out.print("Moltiplicazione: ");	
	System.out.println(na2.getNu());
	
	
	
	//----------------------------------------------//
	
	System.out.println("**Relativi** ");
	
	System.out.print("Inserisci numero: ");
	nint = InpuT.leggiIntero();
		
	IntRelativi intni = new IntRelativi(nint);
		
	System.out.print("Inserisci l'altro numero: ");
	nint2 = InpuT.leggiIntero();
		
	IntRelativi intni2 = new IntRelativi(nint2);
	
	intni2=intni.sottrazione(intni2);
	
	/*System.out.print("Sottrazione: ");	
	System.out.println(intni2.getNu());*/
	
	intni2=(IntRelativi)intni.somma(intni2);
	System.out.println(intni2.getNu());
		
	}
}