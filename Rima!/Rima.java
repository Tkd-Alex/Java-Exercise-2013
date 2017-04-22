class Rima{
	public static void main(String[] a){
		System.out.println("Inserisci la prima stringa.");
		String s1= InpuT.leggiStringa();
		System.out.println("Inserisci la seconda stringa.");
		String s2= InpuT.leggiStringa();
		
		int cont=0;
		
		char c1=' ';
		char c2=' ';
		
		int dim1= s1.length();
		int dim2= s2.length();
		
		if((dim1>2)&&(dim2>2)){
			for(int i=0;i<3;i++){
				c1=(s1.charAt(dim1-i-1));
				c2=(s2.charAt(dim2-i-1));
				if(c1==c2){
					cont++;
				}
			}
		}

		
		if(cont==3)
		System.out.println("Ottima rima!");
		else
		System.out.println("Pessimo poeta!");
	}
}