class Rettangolo {
	float base;
	float altezza;
	
	
	public Rettangolo (){
		base=0;
		altezza=0;
	}
	
	public Rettangolo (float b,float a){
		base=b;
		altezza=a;
	}
	
	public void setBase(float b){
		base=b;
	}
	
	public void setAltezza(float a){
		altezza=a;
	}
	
	public float getBase(){
		return base;
	}
	
	public float getAltezza(){
		return altezza;
	}
	
	public float Perimetro(){
		return 2*(altezza*base);
	}
	
	public float Area(){
		return altezza*base;
	}
	public double Diagonale(){
		return Math.sqrt((base*base)+(altezza*altezza));
	}
	
}