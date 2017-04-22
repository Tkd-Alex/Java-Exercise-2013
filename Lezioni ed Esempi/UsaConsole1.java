class UsaConsole{
	public static void main(String args[]){
		//utilizzo della classe Console		
		/*Console c=new Console();
		System.out.println("Inserisci la stringa");
		String s=c.leggiStringa();
		System.out.println("Inserisci il numero");
		int i=c.leggiIntero();
		System.out.println("stringa="+s);
		System.out.println("intero="+i);
		*/
		//utilizzo della classe ConsoleStatic
		System.out.println("Inserisci la stringa");
		String s=ConsoleStatic.leggiStringa();
		System.out.println("Inserisci il numero");
		int i=ConsoleStatic.leggiIntero();
		System.out.println("stringa="+s);
		System.out.println("intero="+i);
		System.out.println("Inserisci il carattere");
		char c=ConsoleStatic.leggiCarattere();
		System.out.println("\n");
		System.out.println("carattere =  "+ c);
	}	
	
}