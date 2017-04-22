public class DiplomatiN extends Diplomati{

	public DiplomatiN(){
		super();
	}
	
	public DiplomatiN(String no, int vo,String ti){
		super(no,vo,ti);
	}
	
	/*public void setVoto(int vo){
		do{
			if((vo>60)&&(vo<100)){
				super.setVoto(vo);
			}
		}while(getVoto()!=0);
	}*/
	
	public boolean ControlloVoto(){
		boolean c=false;
		if((getVoto()>70)&&(getVoto()<100)){
			c=true;
		}
		return c;
	}
}