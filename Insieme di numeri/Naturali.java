class Naturali{
	
	public int nu;
		
	public Naturali(){
		nu=0;
	}
	
	public Naturali(int n){
		nu=n;
	}
	
	public void setNu(int n){
		nu=n;
	}
	
	public int getNu(){
		return nu;
	}
	
	public Naturali somma(Naturali n2){
		Naturali na = new Naturali();
		int ris = this.getNu()+n2.getNu();
		na.setNu(ris);
		return na;
	}
	
	
	public Naturali molt(Naturali n2){
		Naturali na = new Naturali();
		int ris = this.getNu()*n2.getNu();
		na.setNu(ris);
		return na;
	}
	
	
}