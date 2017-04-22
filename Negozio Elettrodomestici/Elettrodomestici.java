public abstract class Elettrodomestici{
	
	private String prodotto;
	private float prezzo;	
		
	public Elettrodomestici(){
		prodotto=null;
		prezzo= 0;
		}
		
	public Elettrodomestici(String prod, float pre){
		prodotto=prod;
		prezzo= pre;
	}	
		
	public void setProdotto(String pro){
		prodotto=pro;
	}

	public void setPrezzo(float pre){
		prezzo=pre;
	}
		
	public String getProdotto(){
		return prodotto;
	}

	public float getPrezzo(){
		return prezzo;
	}

	public String toString(){
		String s;
		s="Prodotto: "+getProdotto()+" - Prezzo: "+getPrezzo();
		return s;
	}
}