import java.io.*;
class UsaDiplomati{
	public static void main(String a[]){
	
		Diplomati dip[]=new Diplomati[10];
		int l=0;
		int s=0;
		int c;
		String nome,tipo;
		int voto;
		do{
			System.out.println("* 1- Inserimento di un vecchio diplomato.");
			System.out.println("* 2- Inserimento di un nuovo diplomato.");
			System.out.println("* 3- Stampa elenco vecchi diplomati.");
			System.out.println("* 4- Stampa elenco nuovi diplomati.");	
			System.out.println("* 5- Stampa elenco dei diplomati con accesso ai concorsi.");
			System.out.println("* 0- Esci.");
			s=InpuT.leggiIntero();	
			switch(s){
				case 1:
					dip[l]=new DiplomatiV();
					System.out.println("Inserisci il nome:");
					nome=InpuT.leggiStringa();
					dip[l].setNome(nome);
					
					c=0;
				
					do{

						System.out.println("Inserisci il voto:");
						voto=InpuT.leggiIntero();
						
						if((voto>36)&&(voto<60)){
							dip[l].setVoto(voto);
							c=1;
						}
						
						else{
						System.out.println("Non è possibile diplomarsi con questo voto.");
						}
						
					}while(c==0);
					
					System.out.println("Inserisci il settore del diploma:");
					tipo=InpuT.leggiStringa();
					dip[l].setTipo(tipo);
					l++;
				break;

				case 2:
					dip[l]=new DiplomatiN();
					System.out.println("Inserisci il nome:");
					nome=InpuT.leggiStringa();
					dip[l].setNome(nome);
					
					c=0;
				
					do{

						System.out.println("Inserisci il voto:");
						voto=InpuT.leggiIntero();
						
						if((voto>60)&&(voto<100)){
							dip[l].setVoto(voto);
							c=1;
						}
						
						else{
						System.out.println("Non è possibile diplomarsi con questo voto.");
						}
						
					}while(c==0);
				
					System.out.println("Inserisci il settore del diploma:");
					tipo=InpuT.leggiStringa();
					dip[l].setTipo(tipo);
					l++;
				break;

				case 3:
					for(int i=0;i<l;i++){
						if(dip[i] instanceof DiplomatiV){
							System.out.println(dip[i]);
						}
					}
				break;

				case 4:
					for(int i=0;i<l;i++){
						if(dip[i] instanceof DiplomatiN){
							System.out.println(dip[i]);
						}
					}
				break;
				
				case 5:
					for(int i=0;i<l;i++){
						if(dip[i] instanceof DiplomatiN){
							if(dip[i].getVoto()>70){
								System.out.println(dip[i]);
								System.out.println("Nuovo diplomato.");
							}
						}
						else{
							if(dip[i].getVoto()>42){
								System.out.println(dip[i]);
								System.out.println("Vecchio diplomato.");
							}
						}
					}
				break;
			}
		}while(s>0);
	}
}