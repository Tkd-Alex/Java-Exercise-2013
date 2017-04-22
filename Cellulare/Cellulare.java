class Cellulare{
	
	private String colore;
	private String marca;
	private String modello;
	private String sistema;
	private float prezzo;
	private float altezza;
	private float larghezza;
	private float peso;
	
	public Cellulare(){
		colore="";
		marca="";
		modello="";
		sistema="";
		prezzo=0;
		altezza=0;
		larghezza=0;
		peso=0;
	}
	
	public Cellulare(String col, String mar, String mod, String sis, float pr, float al, float lar, float pe){
		colore=col;
		marca=mar;
		modello=mod;
		sistema=sis;
		prezzo=pr;
		altezza=al;
		larghezza=lar;
		prezzo=pe;
	}
	
	public void SetColore(String col){
		colore=col;
	}
	
	public void SetMarca(String mar){
		marca=mar;
	}
	
	public void SetModello(String mod){
		modello=mod;
	}
	
	public void SetSistema(String sis){
		sistema=sis;
	}
	
	public void SetPrezzo(float pr){
		prezzo=pr;
	}
	
	public void SetAltezza(float al){
		altezza=al;
	}
	
	public void SetLarghezza(float lar){
		larghezza=lar;
	}
	
	public void SetPeso(float pe){
		peso=pe;
	}
	
	public String GetColore(){
		return colore;
	}
	
	public String GetMarca(){
		return marca;
	}
	
	public String GetModello(){
		return modello;
	}
	
	public String GetSistema(){
		return sistema;
	}
	
	public float GetPrezzo(){
		return prezzo;
	}
	
	public float GetLarghezza(){
		return larghezza;
	}
	
	public float GetAltezza(){
		return altezza;
	}
	
	public float GetPeso(){
		return peso;
	}

}