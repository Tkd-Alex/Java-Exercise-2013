import java.util.Vector;

class Passeggeri{
	private String nome;

	public Passeggeri(){
		nome="";
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome=n;	
	}
	public String toString(){
		return "Nome: "+nome;	
	}
}


class Coda{
	private Vector v;
	
	public Coda(){
		v=new Vector();	
	}
	
	public void push(Object o){
		v.add(v.size(),o);
	}
	
	public Object top(){
		if(!empty())
			return v.elementAt(0);
		else
			return null;	
	}
	
	public Object pop(){
		Object o=new Object();
		if(!empty()){
			o=v.elementAt(0);
			v.remove(0);
			return o;
		}	
		else
			return null;	
	}
	
	public boolean empty(){
		boolean b=false;
		if (v.size()==0)
			b=true;
		return b;
		
	}
}

class StruttureDinamiche{
	public static void main(String [] args){
		
		Coda c=new Coda();
		
		int s=0;
		
		do{
			System.out.println("* 1- Inserisci passeggero.");
			System.out.println("* 2- Stampa passeggeri.");
			System.out.println("* 3- Rimuovi passeggeri.");
			System.out.println("* 0- Esci.");
			s=InpuT.leggiIntero();	
			switch(s){

				case 1:
					
				Passeggeri p=new Passeggeri();
				System.out.println("Inserisci nome passeggero: ");
				p.setNome(InpuT.leggiStringa());
				c.push(p);
				
				break;
				
				case 2:
					
				Passeggeri p2;
				while(!c.empty()){
					p2=(Passeggeri)c.pop();
					System.out.println(p2);
				}
				
				break;
					
				case 3:
				
				if(!c.empty()){
					p2=(Passeggeri)c.pop();
					System.out.println(p2);
				}
				else{
					System.out.println("Vuoto");
				}
				
				break;
				
			}
		}while(s!=0);
		
		
	}	
	
}
