class Persona{
	private String nome;
	private int eta;	
	public Persona(){
		nome=null;
		eta=0;
	}
	public Persona(String n,int e){
		nome=n;
		eta=e;
	}
	public String stampa(){
		String s;
		s=nome+eta;
		return s;
	}	
	public String getNome(){
		return nome;	
	}
	public int getEta(){
		return eta;
	}
}