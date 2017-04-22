class CalcolaTrapezio{

	public static void main (String a[]){
	
		Trapezio tra= new Trapezio();
		Trapezio tra2= new Trapezio(5,3,6,2,4);
		
		tra.setBasema(4);
		tra.setBasem(3);
		tra.setAltezza(2);
		tra.setLato1(3);
		tra.setLato2(5);
		
		
		System.out.println("Base Maggiore: ");
		System.out.println(tra.getBasema());
		System.out.println("Base Minore: ");
		System.out.println(tra.getBasem());
	        System.out.println("Altezza: ");
		System.out.println(tra.getAltezza());
		System.out.println("Lato 1: ");
		System.out.println(tra.getLato1());
		System.out.println("Lato 2: ");
		System.out.println(tra.getLato2());
		System.out.println("Perimetro: ");
		System.out.println(tra.Perimetro());
		System.out.println("Area: ");
		System.out.println(tra.Area());
		
		
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		System.out.println("Base Maggiore: ");
		System.out.println(tra2.getBasema());
		System.out.println("Base Minore: ");
		System.out.println(tra2.getBasem());
	        System.out.println("Altezza: ");
		System.out.println(tra2.getAltezza());
		System.out.println("Lato 1: ");
		System.out.println(tra2.getLato1());
		System.out.println("Lato 2: ");
		System.out.println(tra2.getLato2());
		System.out.println("Perimetro: ");
		System.out.println(tra2.Perimetro());
		System.out.println("Area: ");
		System.out.println(tra2.Area());
		}
	
	
}