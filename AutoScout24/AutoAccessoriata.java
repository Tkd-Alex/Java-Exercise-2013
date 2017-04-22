class AutoAccessoriata extends AutoBase{

	Accessori acc[] = new Accessori[100];
	
	int dim=0;
	
	public AutoAccessoriata(){
		super();
	}
	
	public AutoAccessoriata(String ma, String mod, String carb, int an, String col, int pot, float prb){
		super(ma,mod,carb,an,col,pot,prb);
	}
	
	public void add(String nom, float pre){
	acc[dim].setNome(nom);
	acc[dim].setPrezzo(pre);
	dim++;
	}
	
	public float przacces(){
		float tot=0;
		for(int i=0;i<dim;i++){
			tot=tot+acc[dim].getPrezzo();
		}
		return tot;
	}
	
	public float przfinale(){
		float iva=getIva()+przacces();
		iva=iva+((iva*21)/100);
		return iva;
	}

}
