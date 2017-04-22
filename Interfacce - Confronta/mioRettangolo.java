class mioRettangolo extends Rettangolo implements IConfrontabile{
	
	public int confronta (Object o){
		int r;
		mioRettangolo re = (mioRettangolo)o;
		
		if(re.area()==area())
			r=0;
		else 
			if(re.area()>area())
				r=1;
		else
			r=-1;
	
		return r;
	}
	
}