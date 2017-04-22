class Squadra{
	
	//Attributi
	private String nome;
	private int vinte;
	private int perse;
	private int pareggio;
	private int punti;
		
	
	//Costruttore	
	public Squadra (){
		nome=" ";
		vinte=0;
		perse=0;
		pareggio=0;
		punti=0;
	}
	
	//Costruttore parametrico
	public Squadra (String n,int vi,int pe,int pa,int pu){
	nome=n;
	vinte=vi;
	perse=pe;
	pareggio=pa;
	punti=pu;
	}
	
	//Metodi
	
	public int Punti(){
	return (vinte*3)+pareggio;
	}
	
	public void Stampa(){
	System.out.print("Nome: " + nome);
	System.out.print(" - Punti: " + Punti());
	System.out.print(" - Vinte: " + vinte);
	System.out.print(" - Pareggiate: " + pareggio);
	System.out.println(" - Perse: " + perse);
	}
	
	public void setNome(String n){
		nome=n;
	}

	public String getNome(){
		return nome;
	}
	
	public void setVinte(int vi){
		vinte=vi;
	}

	public int getVinte(){
		return vinte;
	}
	
	public void setPerse(int pe){
		perse=pe;
	}

	public int getPerse(){
		return perse;
	}
	
	public void setPareggio(int pa){
		pareggio=pa;
	}

	public int getPareggio(){
		return pareggio;
	}
	
	public void setPunti(int pu){
		punti=pu;
	}

	public int getPunti(){
		return punti;
	}
	
}
