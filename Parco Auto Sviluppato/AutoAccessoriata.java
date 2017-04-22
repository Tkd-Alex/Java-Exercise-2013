class AutoAccessoriata extends AutoBase{
	private int lunghezza;
	private  Accessori arr[];
	
public AutoAccessoriata () {
lunghezza=0;
arr=new Accessori [10];
     
}
public AutoAccessoriata (int d){
	lunghezza=0;
	arr=new Accessori [d];
}
public void setLunghezza (int d){
	lunghezza=d;
}
public int getLunghezza(){
	return lunghezza;
}

public void add(Accessori a){
  	arr[lunghezza]=a;
	lunghezza++;
}
public float calcolaPrezzo(){
	float prezzo;
	prezzo=0;
	for(int i=0;i<getLunghezza();i++){
		prezzo=prezzo+arr[i].calcolaPrezzo(); //chiama calcolaPrezzo di accessori	
	}
	prezzo=prezzo+super.calcolaPrezzo();//chiama calcolaPrezzo di autoBase
	return prezzo;	
}
	
public String toString(){
		String annamaria;
		annamaria=super.toString();
	        for(int i=0;i<lunghezza;i++){
			annamaria+=arr[i].toString()+"\n";
		}
		return annamaria;
	}

}