 class Accessori {
	 
	private String nome;
	private float prezzo;
		
	public Accessori(){
		nome = null;
		prezzo = 0;
	}
	
	public Accessori(String no, float pr){
		nome = no;
		prezzo = pr;
	}
	
	public void setNome(String no){
		nome=no;
	}
	
	public void setPrezzo(float pr){
		prezzo=pr;
	}
	
	public String getNome(){
		return nome;
	}
	
	public float getPrezzo(){
		return prezzo;
	}

}
	