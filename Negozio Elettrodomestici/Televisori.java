public class Televisori extends Elettrodomestici{
	
	private float pollici;
	private boolean registratore;
	
	public Televisori(){
		super();
	}
	
	public Televisori(String prod, float pre){
		super(prod, pre);
	}
	
	public void setPollici(float pol){
		pollici=pol;
	}
		
	public float getPollici(){
		return pollici;
	}
	
	public void setRegistratore(boolean reg){
		registratore=reg;
	}
		
	public boolean getRegistratore(){
		return registratore;
	}
	
}
	
