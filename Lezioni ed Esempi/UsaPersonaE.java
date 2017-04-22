class MiaPersona extends Persona{
	public MiaPersona(String n,int e){
		super(n,e);	
	}
	
	public String toString(){
		String d;
		//d="Nome="+getNome()+" età="+getEta();
		d="nome, età="+super.stampa(); 
		return d;	
	}	
	
}


class UsaPersonaE{
	public static void main(String args[]){
		//Persona p=new Persona("Salvo",25);
		//System.out.println(p.stampa());
		
		MiaPersona p1=new MiaPersona("Giovanni",33);
		System.out.println(p1);
	}	
}


