class UsaArray
{
	public static void main(String s[])
	{
		//dichiarazione metodo 1
			int v[]=new int[10];
		//dichiarazione metodo 2
			int [] vv=new int[10];
		//dichiarazione metodo 3
			int vet[];
			//istanza del vettore
			vet=new int[5];	
		//dichiarazione metodo 4 con inizializzazione
			int vet1[]={9,8,7,6,5,4,3};
		//dichiarazione matrice
		int m[][]=new int[5][10];
		
		m[0][0]=4;
		System.out.println(" "+m[0][0]);
		
		//utilizzo del vettore
		for(int i=0;i<5;i++)
			 vet[i]=i;
		for(int i=0;i<5;i++)
			 System.out.println(" "+vet1[i]);
	}	
}