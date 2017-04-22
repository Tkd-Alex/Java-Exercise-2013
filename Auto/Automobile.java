class Automobile {
	
	
	//Attributi
	private String modello;
	private String colore;
	private float prezzo;
	
	//Metodi
	public Automobile (){
		modello="";
		colore="";
		prezzo=0;	
	}
	
	public Automobile (String m,String col ,Float p){
	modello=m;
	colore=col;
	prezzo=p;
	}
	
	public void setModello(String m){
		modello=m;
	}

	public String getModello(){
		return modello;
	}
	
	public void setColore(String col){
		colore=col;
	}

	public String getColore(){
		return colore;
	}
	
	public void setPrezzo(Float p){
		prezzo=p;
	}

	public float getPrezzo(){
		return prezzo;
	}
}