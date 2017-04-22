public class Lavatrici extends Elettrodomestici{
	
	private boolean carica;
	
	public Lavatrici(){
		super();
	}
	
	public Lavatrici(String prod, float pre){
		super(prod, pre);
	}
	
	public void setCarica(boolean car){
		carica=car;
	}
		
	public boolean getCarica(){
		return carica;
	}
}
	
