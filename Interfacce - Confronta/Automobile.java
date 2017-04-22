class Automobile implements IConfrontabile{

	private float cilindrata;
	
	public Automobile (){
		cilindrata=0;
	}
	
	public Automobile (float c){
		cilindrata=c;
	}
	
	public void setCilindrata(float c){
		cilindrata=c;
	}

	public float getCilindrata(){
		return cilindrata;
	}
	
	public String toString(){
		String s="Cilindrata: "+getCilindrata();
		return s;
	}

	public int confronta (Object o){
		int r;
		Automobile a = (Automobile)o;
		
		if(a.getCilindrata()==getCilindrata())
			r=0;
		else 
			if(a.getCilindrata()>getCilindrata())
				r=1;
		else
			r=-1;
	
		return r;
	}
}