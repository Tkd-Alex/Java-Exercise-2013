public class Frigoriferi extends Elettrodomestici{
	
	private int stelle;
	private boolean congelatori;
	
	public Frigoriferi(){
		super();
	}
	
	public Frigoriferi(String prod, float pre){
		super(prod, pre);
	}
	
	public void setStelle(int stel){
		stelle=stel;
	}
		
	public int getStelle(){
		return stelle;
	}
	
	public void setCongelatori(boolean cong){
		congelatori=cong;
	}
		
	public boolean getCongelatori(){
		return congelatori;
	}
	
}
	
