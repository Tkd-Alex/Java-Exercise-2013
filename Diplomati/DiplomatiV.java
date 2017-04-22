public class DiplomatiV extends Diplomati{

	public DiplomatiV(){
		super();
	}
	
	public DiplomatiV(String no, int vo,String ti){
		super(no,vo,ti);
	}
	
	/*public void setVoto(int vo){
		do{
			if((vo>36)&&(vo<60)){
				super.setVoto(vo);
			}
		}while(getVoto()!=0);
	}*/
	
	public boolean ControlloVoto(){
		boolean c=false;
		if((getVoto()>42)&&(getVoto()<60)){
			c=true;
		}
		return c;
	}
}