class VisTel {
	public static void main(String t[]){
		
		Cellulare ce=new Cellulare();
		Cellulare ce2=new Cellulare("Verde","Galaxy","S3","CyanogenMod9",125,14,3,400);
		
		ce.SetColore("Giallo");
		ce.SetMarca("HTC");
		ce.SetModello("WildFire");
		ce.SetSistema("Android 4.0");
		ce.SetPrezzo(400);
		ce.SetAltezza(23);
		ce.SetLarghezza(12);
		ce.SetPeso(600);
		
		System.out.println(ce.GetColore());
		System.out.println(ce.GetMarca());
		System.out.println(ce.GetModello());
		System.out.println(ce.GetSistema());
		System.out.println(ce.GetPrezzo());
		System.out.println(ce.GetAltezza());
		System.out.println(ce.GetLarghezza());
		System.out.println(ce.GetPeso());
		
		
		System.out.println(ce2.GetColore());
		System.out.println(ce2.GetMarca());
		System.out.println(ce2.GetModello());
		System.out.println(ce2.GetSistema());
		System.out.println(ce2.GetPrezzo());
		System.out.println(ce2.GetAltezza());
		System.out.println(ce2.GetLarghezza());
		System.out.println(ce2.GetPeso());
	}
}