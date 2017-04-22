import java.io.*;
class UsaAutoBase{
public static void main(String a[]){

AutoBase parco[]=new AutoBase[10];
int lunghezza=0;	
int scelta;	
String l,r;	
float e;
//menù
do{
	System.out.println("1 - Auto Base");
	System.out.println("2 - Auto Accessoriata");
	System.out.println("3 - Visualizza parco auto");
	System.out.println("0 - Fine Programma");
	System.out.println("Inserire la scelta");
	scelta=ConsoleStatic1.leggiIntero();	
	switch(scelta){
		case 1:
			parco[lunghezza]=new AutoBase();
			System.out.println("Inserire il modello= ");
			l=ConsoleStatic1.leggiStringa();
			parco[lunghezza].setModello(l);
			System.out.println("Inserire il colore= ");
			r=ConsoleStatic1.leggiStringa();
			parco[lunghezza].setColore(r);
			 //caricamento
			System.out.println("Inserire il prezzo= ");
			e=ConsoleStatic1.leggiFloat();
			parco[lunghezza].setPrezzo(e);
			lunghezza++;
		break;
		case 2:
			parco[lunghezza]=new AutoAccessoriata();
			
			System.out.println("Inserire il modello= ");
			l=ConsoleStatic1.leggiStringa();
			parco[lunghezza].setModello(l);
			System.out.println("Inserire il colore= ");
			r=ConsoleStatic1.leggiStringa();
			parco[lunghezza].setColore(r);
			 //caricamento
			System.out.println("Inserire il prezzo= ");
			e=ConsoleStatic1.leggiFloat();
			parco[lunghezza].setPrezzo(e);
			//System.out.println("Listino");
			
			//inserimento accessori
			for(int i=0;i<2;i++){
				Accessori acc=new Accessori();
				System.out.println("Inserire il nome= ");
				r=ConsoleStatic1.leggiStringa();
				acc.setNome(r);
				 //caricamento
				System.out.println("Inserire il costo= ");
				e=ConsoleStatic1.leggiFloat();
				acc.setCosto(e);
				 //caricamento
				System.out.println("Inserire l'iva= ");
				e=ConsoleStatic1.leggiFloat();
				acc.setIva(e);
				parco[lunghezza].add(acc);
				
			}
			lunghezza++;
		break;	
		case 3:
			for(int i=0;i<lunghezza;i++){
				System.out.println(parco[i]+"\nprezzo"+parco[i].calcolaPrezzo());	
				
			}
			//System.out.println("PREZZO+IVA= "+x.calcolaPrezzo());
		
		break;
	}
}
while(scelta>0);
	
	
	
	
	
}
}//clas