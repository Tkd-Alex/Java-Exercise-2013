class CalcolaRettangolo{

	public static void main (String a[]){
	
		Rettangolo ret= new Rettangolo();
		Rettangolo ret2= new Rettangolo(5,3);
		
		ret.setBase(4);
		ret.setAltezza(2);
		
		System.out.println("Perimetro: ");
		System.out.println(ret.Perimetro());
		System.out.println("Area: ");
		System.out.println(ret.Area());
		System.out.println("Diagonale: ");
		System.out.println(ret.Diagonale());
		
		System.out.println("Perimetro: ");
		System.out.println(ret2.Perimetro());
		System.out.println("Area: ");
		System.out.println(ret2.Area());
		System.out.println("Diagonale: ");
		System.out.println(ret2.Diagonale());
		}
	}	
	
