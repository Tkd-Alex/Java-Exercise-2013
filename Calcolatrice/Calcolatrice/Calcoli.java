class Calcoli{
	
	static public float a;
	static public char op;
	
	static public void setA(float a1){
		a=a1;
	}
	
	static public float getA(){
		return a;
	}
	
	static public void setOp(char op1){
		op=op1;
	}
	
	static public char getOp(){
		return op;
	}
	
	static public double potenza(float b){
		return Math.pow(a,b);
	}
	
	static public double log(float b){
		return Math.log(b)/Math.log(10.0);
	}
	
	static public float addizione(float b){
		return a+b;
	}
	
	static public float perc(float b){
		return b/100;
	}
	
	static public double radquad(float b){
		return Math.sqrt(b);
	}
	
	static public float unox(float b){
		return (1/b);
	}
	
	static public float sottrazione(float b){
		return a-b;
	}
	
	static public float moltiplicazione(float b){
		return a*b;
	}
	
	static public float divisione(float b){
		return a/b;
	}
	
}