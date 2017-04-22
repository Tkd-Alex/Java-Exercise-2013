import java.util.Vector;
//classe nodo
class Libro{
	private String titolo;
	private float prezzo;
	//costruttori
	public Libro(){
		titolo="";
		prezzo=0;	
	}
	//metodi
	public String getTitolo(){
		return titolo;
	}
	public void setTitolo(String t){
		titolo=t;	
	}
	public String toString(){
		return titolo+"-"+prezzo;	
	}
}

//classe struttura
class Pila{
	private Vector v;
	public Pila(){
		v=new Vector();	
	}		
	public void push(Object o){
		v.add(0,o);	
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
	//size()
}
//classe di utilizzo della struttura
class StruttureDinamiche{
	public static void main(String [] args){
		Pila p=new Pila();	
		//menù........
		
		//push
		Libro l=new Libro();
		l.setTitolo("I promessi Sposi");
		p.push(l);
		
		//push
		Libro l1=new Libro();
		l1.setTitolo("Biancaneve");
		p.push(l1);
		
	
		//stampa pila  metodo 1
		Libro l2;
		while(!p.empty()){
			l2=(Libro)p.pop();
			System.out.println(l2);
		}
		/*
		//stampa pila metodo 2
		Libro l2=(Libro)p.pop();
		while(l2!=null){
			System.out.println(l2);
			l2=(Libro)p.pop();
		}
		*/
		
		
		/*
		//pop
		Libro l2=(Libro)p.pop();
		System.out.println(l2);
		
		Libro l3=(Libro)p.pop();
		System.out.println(l3);
		
		//pop con controllo
		Libro l4=(Libro)p.pop();
		if (l4==null)
			System.out.println("pila Vuota");
		else
			System.out.println(l4);
		*/
				
		
		
	}	
	
}