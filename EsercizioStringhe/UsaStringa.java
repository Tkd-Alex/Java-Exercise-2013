//Data un stringa di caratteri, scrivere quante volte � ripetuta una lettera che inseriamo noi
//Contare gli spazzi.

class UsaStringa{
public static void main(String[] a){
	
	System.out.println("Inserisci una stringa.");
	
	String s= null;
	s=InpuT.leggiStringa();
	System.out.println("La stringa inserita �: "+s);
	
	System.out.println("Inserisci il carattere da ricercare.");
	
	char car=InpuT.leggiCarattere();
	char car2=' ';
	
	int cont=0;
	
	int max=s.length();
	
	
	for(int i=0;i<max;i++){
		car2=s.charAt(i);
		if(car==car2)
		cont++;
	}
	
	System.out.println("");
	
	System.out.println("Il carattere " +car+" � stato trovato: "+cont);
	
	for(int i=0;i<max;i++){
		car2=' ';;
		if(car==car2)
		cont++;
	}
	
	System.out.println("Lo spazio � stato trovato: "+cont);
}}