class UsaLibro{
	public static void main (String s[]){
		Libro l=new Libro ();
		
		l.setTitolo("Informatica");
		l.setAutore("Scorzoni");
		l.setEditore("sei");
		l.setPrezzo(20f);
		
		System.out.println(l.getTitolo());
		System.out.println(l.getAutore());
		System.out.println(l.getEditore());
		System.out.println(l.getPrezzo());
	}
	
}