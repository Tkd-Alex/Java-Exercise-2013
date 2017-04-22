//Floramo Vittorio e Maggio Alessandro

class Prodotto{
	
	
	//Attributi
	private String nome;
	private float prezzo;
		
	
	//Costruttore	
	public Prodotto (){
		nome=" ";
		prezzo=0;
            		
	}
	//Costruttore parametrico
	public Prodotto (String n,float p){
	nome=n;
	prezzo=p;
	}
	//Metodi
	public void setNome(String n){
		nome=n;
	}

	public String getNome(){
		return nome;
	}
	
	public void setPrezzo(float p){
		prezzo=p;
	}

	public float getPrezzo(){
		return prezzo;
	}
	
}
