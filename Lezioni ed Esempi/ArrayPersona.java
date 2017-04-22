class Persona{
	//attributi
	public String nome;
	public  int eta;	
	//costruttori	
	public Persona(){
		nome="io";
		eta=120;
	}
	public Persona(String n){
		nome=n;
	}
	public Persona(int e){
		eta=e;
	}
	public Persona(String n,int e){
		nome=n;
		eta=e;
	}
	//metodi
	public void stampa(){
		System.out.println(nome+","+eta);
	}
	public void stampa(String titolo){
		System.out.println(titolo+" "+nome+","+eta);
	}
}

class ArrayPersona{
	public static void main(String args[]){
		//dichiarazione dell'array di persona
		Persona p[]=new Persona[10];
		
		//caricamento dell'array di Persona
		for (int i=0;i<5;i++){
			//istanza di persona	
			p[i]=new Persona();
			p[i].eta=i*2;
		}
		
		//stampa dell'array di persona	
		for (int i=0;i<5;i++){
			p[i].stampa();
		}
			
	}
}


