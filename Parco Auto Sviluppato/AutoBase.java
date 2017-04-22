class AutoBase{
	private String modello;
	private String colore;
	private float  prezzo;
		
	public AutoBase(){
		modello=" ";
		colore=" ";
		prezzo=0f;
	}
	public AutoBase(String m,String c,float p){
		modello=m;
		colore=c;
		prezzo=0f;
	}
	
	public void setModello(String m){
		modello=m;
	}
	public String getModello(){
		return modello;
	}
	
	public void setColore(String c){
		colore=c;
	}
	public String getColore(){
		return colore;
	}
	public void setPrezzo(float p){
		prezzo=p;
	}
	public float getPrezzo(){
		return prezzo;
	}
	
	public float calcolaPrezzo(){
		float iva;
		iva=getPrezzo()+((getPrezzo()*21)/100);
		return iva;
	}
	
	public void add(Accessori a){
	}
	
	public String toString(){
		String annamaria;
		annamaria=getModello()+" "+getColore()+" "+getPrezzo()+"\n";
		return annamaria;
	}
	
}//classe