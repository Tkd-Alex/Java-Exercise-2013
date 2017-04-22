//Floramo Vittorio e Maggio Alessandro

class BigliettoDelTreno {
	
	
	//Attributi
	private String stazpart;
	private String stazarrivo;
	private float stazdistanza;
	private int stazclasse;
		
	//Metodi
	public BigliettoDelTreno (){
		stazpart=" ";
		stazarrivo=" ";
		stazdistanza=0;
		stazclasse=0;
            		
	}
	
	public BigliettoDelTreno (String sp,String sa ,float sd, int sc){
	stazpart=sp;
	stazarrivo=sa;
	stazdistanza=sd;
	stazclasse=sc;
	}
	
	public void setStazpart(String sp){
		stazpart=sp;
	}

	public String getStazpart(){
		return stazpart;
	}
	
	public void setStazarrivo(String sa){
		stazarrivo=sa;
	}

	public String getStazarrivo(){
		return stazarrivo;
	}
	
	public void setStazdistanza(float sd){
		stazdistanza=sd;
	}

	public float getStazdistanza(){
		return stazdistanza;
	}
	
	public void setStazclasse(int sc){
		stazclasse=sc;
	}

	public int getStazclasse(){
		return stazclasse;
	}

	public double prezzo (){
		double p=0;
		
		p=stazdistanza*0.75;
		
		if (stazclasse==1){
		p=p+((p*30)/100);
		}
		return p;
	}
	
}
