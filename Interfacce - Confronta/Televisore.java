class Televisore implements IConfrontabile{

	private float pollici;
	
	public Televisore (){
		pollici=0;
	}
	
	public Televisore (float p){
		pollici=p;
	}
	
	public void setPollici(float p){
		pollici=p;
	}

	public float getPollici(){
		return pollici;
	}
	
	public String toString(){
		String s="Pollici: "+getPollici();
		return s;
	}

	public int confronta(Object o){
		int r;
		Televisore t = (Televisore)o;
		
		if(t.getPollici()==getPollici())
			r=0;
		else 
			if(t.getPollici()>getPollici())
				r=1;
		else
			r=-1;
	
		return r;
	}
}