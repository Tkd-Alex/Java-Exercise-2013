class Algoritmi{
	
	static int ricerca(IConfrontabile o[],IConfrontabile o1,int dim){
	
		int i=0;
		int n=dim;
		boolean trovato= false;
		
		while( (trovato==false)&&(i<n) ){
			if( o[i].confronta(o1) == 0 )
				trovato=true;
			
			i++;
		}
		
		if (trovato)
			return i;
		else
			return -1;
		
	}
	
	static void ordinamento(IConfrontabile o[], int dim){
	
		int n=dim;	
		IConfrontabile temp;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(o[i].confronta(o[j]) == 1){
					temp=o[i];
					o[i]=o[j];
					o[j]=temp;
				}
			}
		}
		
	}
	
}