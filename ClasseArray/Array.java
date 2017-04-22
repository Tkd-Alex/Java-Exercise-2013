

class Array{

	//Attributi
	private int lunghezza=0;
	private char vet[];
		
	//Costruttore parametrico
	public Array(int dim){
		lunghezza=0;
		vet=new char[dim];
	}
	
	//Metodi
	public void setLunghezza(int lu){
		lunghezza=lu;
	}

	public float getLunghezza(){
		return lunghezza;
	}
	
	public void aggiungi(int x){
		vet[lunghezza]=x;
		lunghezza++;
	}
	
	public void stampa(){
		for(int i=0;i<lunghezza;i++){
			System.out.println(vet[i]);
		}
	}
	
}
