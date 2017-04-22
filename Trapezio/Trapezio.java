class Trapezio {
	float basem;
	float basema;
	float lato1;
	float lato2;
	float altezza;
	
	public Trapezio (){
		basem=0;
		basema=0;
		lato1=0;
		lato2=0;
		altezza=0;
	}
	
	public Trapezio (float b,float c,float l1,float l2,float a){
		basem=b;
		basema=c;
		lato1=l1;
		lato2=l2;
		altezza=a;
	}
	
	public void setBasem(float b){
		basem=b;
	}
	
	public void setBasema(float c){
		basema=c;
	}
	
	public void setLato1 (float l1){
		lato1=l1;
	}
	
	public void setLato2 (float l2){
		lato2=l2;
	}
	
	public void setAltezza(float a){
		altezza=a;
	}
	
	
	public float getBasem(){
		return basem;
	}
	
	
	public float getBasema(){
		return basema;
	}
	
	public float getAltezza(){
		return altezza;
	}
	
	public float getLato1(){
		return lato1;
	}
	
	public float getLato2(){
		return lato2;
	}
	
	public float Perimetro(){
		return basema+basem+lato1+lato2;
	}
	
	public float Area(){
		return ((basema+basem)*altezza)/2;
	}
	
}