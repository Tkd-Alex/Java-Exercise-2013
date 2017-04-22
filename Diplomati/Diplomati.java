public abstract class Diplomati{
	
	private String nome;
	private int voto;
	private String tipo;

	public Diplomati(){
		nome=null;
		voto=0;
		tipo=null;
	}
	
	public Diplomati(String no, int vo,String ti){
		nome=no;
		voto=vo;
		tipo=ti;
	}
	
	public void setNome(String no){
		nome=no;
	}
	
	public void setVoto(int vo){
		voto=vo;
	}
	
	public void setTipo(String ti){
		tipo=ti;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getVoto(){
		return voto;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public String toString(){
		String s;
		s="Nome: "+getNome()+"\nVoto: "+getVoto()+"\nSettore del diploma: "+getTipo();
		return s;
	}
	
	public abstract boolean ControlloVoto();
	
}