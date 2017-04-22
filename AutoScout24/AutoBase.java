/* Gerarchia di classe memorizza prezzi auto in vendita
 auto costo base non accessoriata
 auto accessoriate, prezzo base + accessori
 serie limitata */
 
 class AutoBase{
	 
	private String marca;
	private String modello;
	private String carburante;
	private int anno;
	private String colore;
	private int potenza;
	private float prezzob;
 
	public AutoBase(){
		marca=null;
		modello=null;
		carburante=null;
		anno=0;
		colore=null;
		potenza=0;
		prezzob=0;	 
	}
		
	public AutoBase(String ma, String mod, String carb, int an, String col, int pot, float prb){
		marca=ma;
		modello=mod;
		carburante=carb;
		anno=an;
		colore=col;
		potenza=pot;
		prezzob=prb;	 
	}
	 
	public void setMarca(String ma){
		marca=ma;
	}
	
	public void setModello(String mod){
		modello=mod;
	}
	
	public void setCarburante(String carb){
		carburante=carb;
	}
	
	public void setAnno(int an){
		anno=an;
	}
	
	public void setColore(String col){
		colore=col;
	}
	
	public void setPotenza(int pot){
		potenza=pot;
	}
	
	public void setPrezzob(float prb){
		prezzob=prb;	
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getModello(){
		return modello;
	}
	
	public String getCarburante(){
		return carburante;
	}
	
	public int getAnno(){
		return anno;
	}
	
	public String getColore(){
		return colore;
	}
	
	public int getPotenza(){
		return potenza;
	}
	
	public float getPrezzob(){
		return prezzob;
	}
	
	public float getIva(){
		float iva;
		iva=getPrezzob()+((getPrezzob()*21)/100);
		return iva;
	}
	
	public String toString(){
		String tostr;
		tostr = getMarca() + getModello() + getCarburante() + getAnno() + getColore() + getPotenza() + getPrezzob();
		return tostr;
	}
	
}