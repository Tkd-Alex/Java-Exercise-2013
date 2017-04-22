import java.io.*;

class Poesia{
	public static void main(String[] argv){
	
		int scelta=0,c,v=0;
		char c1;
		String poesia="";
			
		FileWriter f=null;
		FileReader f1=null;
		InputStreamReader i=new InputStreamReader(System.in);
			
		do{
			System.out.println("[1] Inserisci poesia.");
			System.out.println("[2] Scrivi poesia.");
			System.out.println("[3] Leggi poesia e conta vocali.");
			System.out.println("[0] Esci.");
				
			scelta=InpuT.leggiIntero();	
				
			switch (scelta){
				
				case 1:
				
				poesia=InpuT.leggiStringa();
				
				break;
				
				case 2:
					
				try{
					f=new FileWriter("test1.txt",false);
					f.write(poesia);
				}
				
				catch (IOException e){
					System.out.println(e.getMessage());
				}
				finally{
					try{
						f.close();
					}
					catch (IOException e){
						System.out.println(e.getMessage());
					}
				}
					
				break;
				
				case 3:
					
				try{
					f1=new FileReader("test1.txt");
					while ((c=f1.read())!=-1){
						c1 = (char)c;
						if((c1=='a')||(c1=='e')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u')){
							v++;
						}
						poesia=poesia+c1;
					}
					
					System.out.println(poesia);	
					System.out.println("Le vocali sono: "+v);	
					f1.close();
				}
				catch (IOException e){
					System.out.println(e.getMessage());	
				}

					
				break;
				
			}
			
		}while(scelta!=0);
	
	}
}