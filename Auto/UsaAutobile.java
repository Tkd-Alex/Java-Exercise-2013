class UsaAutobile{
	public static void main (String a[]){
		
		System.out.println("-----------");
		
		Automobile car = new Automobile();
	
		car.setModello("AUDI");
		car.setColore("BIANCA");
		car.setPrezzo(20000f);
		
		System.out.println(car.getModello());
		System.out.println(car.getColore());
		System.out.println(car.getPrezzo());
		
		System.out.println("-----------");
	
		Automobile car2 = new Automobile();
		
		car2.setModello("BMW");
		car2.setColore("NERA");
		car2.setPrezzo(30000f);
		
		System.out.println(car2.getModello());
		System.out.println(car2.getColore());
		System.out.println(car2.getPrezzo());
		
			
		System.out.println("-----------");
	
		Automobile car3 = new Automobile();
		
		car3.setModello("FERRARI");
		car3.setColore("ROSSA");
		car3.setPrezzo(150000f);
		
		System.out.println(car3.getModello());
		System.out.println(car3.getColore());
		System.out.println(car3.getPrezzo());
		
		System.out.println("-----------");
	
	
	        Automobile car4= new Automobile("FIAT","BLU",10000f);
	
			
		System.out.println(car4.getModello());
		System.out.println(car4.getColore());
		System.out.println(car4.getPrezzo());
	
	}
     
}
