import java.io.*;

class Film implements Serializable{
	
	String nome;
	String genere;
	String anno;
	String durata;
	String produttori;
	
	public Film(){
		nome="";
		genere="";
		anno="";
		durata="";
		produttori="";
	}
	
	public Film(String n, String g,String a, String d, String p){
		nome=n;
		genere=g;
		anno=a;
		durata=d;
		produttori=p;
	}
	
	public String toString(){
		String s="Titolo: " + getNome() + " - Genere: " + getGenere() + " - Anno: " + getAnno() + " - Durata: "+ getDurata() + " - Produttori: "+ getProduttori();
		return s;
	}
	
	public void setAll(String n, String g,String a, String d, String p){
		nome=n;
		genere=g;
		anno=a;
		durata=d;
		produttori=p;
	}
	
	public void setNome(String n){
		nome=n;
	}
	
	public void setGenere(String g){
		genere=g;
	}
	
	public void setAnno(String a){
		anno=a;
	}
	
	public void setDurata(String d){
		durata=d;
	}
	
	public void setProduttori(String p){
		produttori=p;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getGenere(){
		return genere;
	}
	
	public String getAnno(){
		return anno;
	}
	
	public String getDurata(){
		return durata;
	}
	
	public String getProduttori(){
		return produttori;
	}
}