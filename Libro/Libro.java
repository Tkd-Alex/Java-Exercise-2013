class Libro {
	
	
	//Attributi
	private String titolo;
	private String autore;
        private String editore;
	private float prezzo;
		
	//Metodi
	public Libro(){
		titolo=" ";
		autore=" ";
		editore=" ";
		prezzo=0;
		}
		
		public void setTitolo (String t){
			titolo=t;
			} 
			
		public String getTitolo(){
                        return titolo;
			}
			
		public void setAutore (String a){
			autore=a;
			}
			
		public String getAutore(){
                        return autore;
			}
			
		public void setEditore (String e){
			editore=e;
			}
			
		public String getEditore(){
                        return editore;
			}
			
		public void setPrezzo (float p){
			prezzo=p;
			}
			
		public float getPrezzo(){
                        return prezzo;
			}
			
		}	
		
	        		
	        		
	
	