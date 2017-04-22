class IntRelativi extends Naturali{
	
	public IntRelativi(){
		super();
	}
	
	public IntRelativi(int n){
		super(n);
	}
	
	public IntRelativi sottrazione(IntRelativi n2){
		IntRelativi na = new IntRelativi();
		int ris = this.getNu()-n2.getNu();
		na.setNu(ris);
		return na;
	}
}
	