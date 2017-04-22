class UsaStringa{
public static void main(String[] a){
	// Creo una stringa assegnando una costante stringa ad una variabile di tipo String
	String s = "classe 4bi";
	System.out.println(s);
	
	/*Creo una stringa utilizzando il costruttore String(),
            quindi creo un oggetto di tipo String con valore stringa vuota*/
		String s1=new String();
		System.out.println(s1);
	
       /*Creo una stringa utilizzando il costruttore  String("costante stringa"), 
	quindi creo un oggetto di tipo String con valore indicato tra doppi apici*/
	String s2=new String("informatica");
	System.out.println("s2 = "+s2);
	// Dopo che l'oggetto String è stato creato rimane immutato
	
	/*METODI PRINCIPALI
		int length()   			restituisce il numero di caratteri della stringa
		char charAt(int pos) 		restituisce il carattere che si trova nella posizione specificata,
						con 0<= pos < dimensione-1                              */
	// METODO   int length()
	int dimensione ;
	dimensione=s2.length();
	System.out.println("dimensione stringa = "+ dimensione);
	//oppure
	System.out.println("dimensione stringa = "+ "classe 4bi".length());
	
	//METODO char charAt(int pos) 
	char car;
	car=s2.charAt(5);
	System.out.println("il carattere in posizione 5 della stringa s2 è = "+car);
	//oppure
	System.out.println("carattere in posizione 5 = "+ "classe 4bi".charAt(5));
	//nel caso in cui il valore di pos non è compreso tra 0 e la dimensione della stringa -1 
	//si avrà una eccezione
	//System.out.println("carattere in posizione 5 = "+ "classe 4bi".charAt(10));
	
	/* METODI PER DETERMINARE LA POSIZIONE DI UN CARATTERE O 
	UNA SOTTOSTRINGA NELLA STRINGA */
	int pos;
	/* METODO int indexOf(char ch)
	RESTITUISCE LA PRIMA POSIZIONE DEL CARATTERE ch ALL'INTERNO DELLA STRINGA */
	pos=s2.indexOf('i');
	System.out.println(" PRIMA POSIZIONE CARATTERE = "+pos);
	/*METODO int indexOf(char ch,int fromIndex)
	RESTITUISCE LA PRIMA POSIZIONE DEL CARATTERE 'ch 'ALL'INTERNO DELLA STRINGA 
	A PARTIRE DALLA POSIZIONE fromIndex       */
	pos=s2.indexOf('i',3);
	System.out.println(" PRIMA POSIZIONE CARATTERE A PARTIRE DA 3 = "+pos);
	
	/*   METODO int indexOf(String s)
	RESTITUISCE LA PRIMA POSIZIONE DELLA SOTTOSTRINGA " s " ALL'INTERNO DELLA STRINGA */
	pos=s2.indexOf("for");
	System.out.println("1)"+pos);
	/*  METODO int indexOf(String s ,int fromIndex)
	RESTITUISCE LA PRIMA POSIZIONE DELLA SOTTOSTRINGA " s " ALL'INTERNO DELLA STRINGA 
	A PARTIRE DALLA POSIZIONE fromIndex  */
	pos=s2.indexOf("for",6);
	System.out.println("2)"+pos);
	
	
	/* METODO int lastIndexOf(char ch)
	RESTITUISCE L'ULTIMA POSIZIONE DEL CARATTERE ch ALL'INTERNO DELLA STRINGA */
	pos=s2.lastIndexOf('i');
	System.out.println("3)"+pos);
	/*METODO int lastIndexOf(char ch,int fromIndex)
	RESTITUISCEL'ULTIMA POSIZIONE DEL CARATTERE 'ch 'ALL'INTERNO DELLA STRINGA 
	 fino ALLA POSIZIONE fromIndex       */
	pos=s2.lastIndexOf('i',3);
	System.out.println("4)"+pos);
	
	/*   METODO int lastIndexOf(String s)
	RESTITUISCE L'ULTIMA POSIZIONE DELLA SOTTOSTRINGA " s " ALL'INTERNO DELLA STRINGA */
	pos=s2.lastIndexOf("for");
	System.out.println("5)"+pos);
	/*  METODO int latIndexOf(String s ,int fromIndex)
	RESTITUISCE L'ULTIMA POSIZIONE DELLA SOTTOSTRINGA " s " ALL'INTERNO DELLA STRINGA 
	fino ALLA POSIZIONE fromIndex  */
	pos=s2.lastIndexOf("for",6);
	System.out.println("6)"+pos);
	// SE IL CARATTERE O LA SOTTOSTRINGA NON VENGONO TROVATI IL VALORE DI RITORNO E' UGUALE A -1
	pos=s2.indexOf("for",5);
	System.out.println("7)"+pos);
	
		
		String str= new String();
		str="Informatica";
		String str1= new String();
		str1="informatica";
			
		if(!s2.equals("casa"))
			System.out.println("stringhe no uguali");
		else
			System.out.println("stringhe  uguali");
		if(!s2.equals(str))
			System.out.println("stringhe non uguali");
		else
			System.out.println("stringhe  uguali");
		if(s2.equals(str1))
			System.out.println("stringhe  uguali");
		else
			System.out.println("stringhe  non uguali");
		
		if(s2.equalsIgnoreCase(str))
			System.out.println("stringhe uguali");
		else
			System.out.println("stringhe non   uguali");
		
		if(s2.compareToIgnoreCase(str)==0)
			System.out.println("stringhe uguali");
		else
			if(s2.compareToIgnoreCase(str)<0)
				System.out.println("stringa s2 precede str");
					else
					System.out.println("stringa s2 segue str");
		
					if(s2.compareTo(str)==0)
			System.out.println("stringhe uguali");
		else
			if(s2.compareTo(str)<0)
				System.out.println("stringa s2 precede str");
					else
					System.out.println("stringa s2 segue str");
		
		
		
		
	}
		
	}