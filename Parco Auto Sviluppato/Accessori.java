class Accessori{
	private String nome;
	private float costo;
	private float iva;
       public Accessori(){
	       nome=" ";
	       costo=0f;
	       iva=0f;
       }
        public Accessori(String n,float c, float iva){
	       nome=n;
	       costo=c;
		this.iva=iva;
       }
       public void setNome(String n){
		nome=n;
	}
	public String getNome(){
		return nome;
	}
	public void setCosto(float c){
		costo=c;
	}
	public float getCosto(){
		return costo;
	}
	public void setIva(float c){
		iva=c;
	}
	public float getIva(){
		return iva;
	}
        public float calcolaPrezzo(){
		return getCosto()+(getCosto()*getIva()/100);	
	} 
	
	public String toString(){
		String s;
		s=getNome()+" "+getCosto()+" "+calcolaPrezzo()+"\n";
		return s;
	}
	
}//classe