class Stringa{
	
	//Attributi
	private String s=null;
		
	//metodi
	public Stringa() {
		s=null;
	}
		
	public void setStringa(String ss){
		s=ss;
	} 
			
        public String getStringa(){
		return s;
	} 
	
	/*public int occorenza(char c, int oc){
	
		int t=0;
		int p=0;
			
		for(int i=0;i<s.length();i++){
			if(t<oc){
				if(s.charAt(i)==c){
					t++;
					p=i;
				}
			}
		}
		
		if(t==oc)
		return p+1;
		else
		return -1;
	
	}
	*/
	
	public int occorenza(char c, int oc){
	
		int t=0;
		int p=0;
		int i=0;
			
		while((i<s.length())&&(t<oc)){
			if(s.charAt(i)==c){
					t++;
					p=i;
			}
			i++;
		}
		
		if(t==oc)
		return p+1;
		else
		return -1;
	
	}
}