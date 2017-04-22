  //Librerie
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;

class labelCuori extends JLabel implements Runnable{ //Processo riguardante il movimento dei cuori

	private Grafica grafica; //Nuova grafica

	public labelCuori(String back, Grafica grafica2){ //Costruttore del processoMostri con paramentro una stringa e grafica
		super(new ImageIcon(back));
		
		grafica=grafica2;
	}
	
	public void run(){
		
		try{
		
			Thread.sleep(1000); //Ritardo
			
			int rit = (int)((Math.random()*9)+4); //Random per il ritardo e la velocità di movimento
			
			for(int i=0;i<1200;i++){
				int x=getX(); //Ricavo le coordinate attuale del cuore X
				int y=getY(); //Ricavo le coordinate attuale del cuore Y
				
				int x2=grafica.labelEroe.getY()-x;
				
				//Controllo punteggiVita
				if(grafica.cuore){
				
					if( (y==grafica.labelEroe.getY()) && (x2>10) ){
						grafica.pointLife++; //Incremento vite
						grafica.label[1].setText(String.valueOf(grafica.pointLife)); //Imposto le vite nel label
						grafica.cuore=false;
					} 
				
				}

				Thread.sleep(rit); //Ritardo
				setLocation(x-1,y); //Aggiorno del coordinate del cuore
			}
			
		}
		catch (InterruptedException e){
			System.out.println("Errore");
		}	
	}

}

class labelMostri extends JLabel implements Runnable{ //Processo riguardante il movimento dei mostri

	private Grafica grafica; //Nuova grafica

	public labelMostri(String back, Grafica grafica2){ //Costruttore del processoMostri con paramentro una stringa e grafica
		super(new ImageIcon(back));
		
		grafica=grafica2;
	}
	
	public void run(){
		try{
		
		int rit = (int)((Math.random()*9)+4); //Random per il ritardo e la velocità di movimento
			
			for(int i=0;i<1200;i++){
				int x=getX(); //Ricavo le coordinate attuale del mostro X
				int y=getY(); //Ricavo le coordinate attuale del mostro Y
				
				//Controllo punteggiVita
				if(!grafica.bum){
					if(x==grafica.labelEroe.getX()){
						grafica.pointLife--; //Decremento vite
						grafica.label[1].setText(String.valueOf(grafica.pointLife)); //Imposto le vite nel label
						
						grafica.bum = false;
					}
				}

				Thread.sleep(rit); //Ritardo
				setLocation(x-1,y); //Aggiorno del coordinate del mostro
			}
			
		}
		catch (InterruptedException e){
			System.out.println("Errore");
		}	
	}

}

class labelSpada extends JLabel implements Runnable{ //Processo riguardante il movimento della spada

	public labelMostri[] mostro;
	private Grafica grafica; //Nuova grafica
	
	public labelSpada(String back, labelMostri[] mostro2, Grafica grafica2){ //Costruttore del labelSpada con parametro stringa di sfondo
		super(new ImageIcon(back));
		
		mostro = mostro2;
		
		grafica = grafica2;
	}
	
	public void run(){
		try{
			for(int i=0;i<1200;i++){
				int x=getX(); //Cordinate X della Spada
				int y=getY(); //Cordinate Y della Spada
				
			
				
				for(int j=0;j<5;j++){
					if( (x==mostro[j].getX()) && (y==mostro[j].getY()) ){
						grafica.point++;
						grafica.label[3].setText(String.valueOf(grafica.point)); //Imposto le vite nel label
						
						grafica.remove(mostro[j]);
						grafica.remove(this);
						
						y=9999;
						
						grafica.bum = true;
					}
				}
				
				Thread.sleep(1); //Ritardo
				
				grafica.bum = false;
			
				setVisible(true);
				setLocation(x+1,y); //Aggiornamento delle coordinate
				
			}
		}
		catch (InterruptedException e){
			System.out.println("Errore");
		}
	}
}

class processoEroe implements Runnable{ //Processo riguardante il salto dell'eroe
	
	private JLabel eroe; //Credo un nuovo JLabel
	
	public processoEroe(JLabel eroe2){ //Costruttore del processoEroe con parametro il Label
		eroe=eroe2;
	}
	
	public void run(){
		
		int x=eroe.getX(); //Coordinate X del LabelEroe
		int y=eroe.getY(); //Coordinate Y del LabelEroe
		
		try{
			
			//Esecuzioni del salto con controllo
			
			if(y==200){ //Funziona solamente con y=200
				
				//Il personaggio sale
				for(int i=0;i<150;i++){
					Thread.sleep(5); //Ritardo
					eroe.setLocation(x,y-i); //Aggiornamento coordinate
				}
				
				int y2=eroe.getY(); //Coordinata attuale di Y
				
				//Il personaggo scende
				for(int i=0;i<150;i++){ 
					Thread.sleep(5); //Ritardo
					eroe.setLocation(x,y2+i); //Aggiornamento coordinate
				}
			}
		}
		catch (InterruptedException e){
			System.out.println("Errore");
		}
	}
}

class EventiTastiera extends KeyAdapter{

	private Grafica graf; //Dichiaro un nuovo Object di tipo Grafica
	private int x=0; //Numero di spade

	public EventiTastiera(Grafica graf2){ //Costruttore di eventi tastiera con parametro Grafica
		graf=graf2;
	}

	public void keyPressed(KeyEvent e){

		if (e.getKeyCode()==KeyEvent.VK_UP){ //Eventi relativi alla freccia su
			Thread hero=new Thread(graf.eroe); //Creo il thread eroe
			hero.start(); //Faccio partire il processo
		}

		if (e.getKeyCode()==32){ //Eventi realativi allo spazio
			
			graf.add(graf.labelSpade[x]); //Aggiungo alla finestra labelSpada (Processo)
			graf.labelSpade[x].setBounds(graf.labelEroe.getX(),graf.labelEroe.getY(),180,180); //Imposto le coordinate ricavandole dalla posizione dell'eroe
			
			graf.cuore = true;
			
			Thread spade = new Thread(graf.labelSpade[x]); //Creo nuovo thread
			
			//Verifico un probabile sovraccarico di thread
			if(x==8){
				x=0;
			}
			else{
				x++;
			}

			spade.start(); //Faccio partire il processo 
			
			graf.add(graf.labelEroe); //Aggiungo nuovamente alla finestra l'eroe
			graf.add(graf.labelSfondo); //Aggiungo nuovamente alla finestra lo sfondo
		
		}

	}
}

class Grafica extends JFrame{

	//Attributi
	
	public JLabel[] label; //Array label
	
	public labelSpada[] labelSpade; //Array di labelSpada (Processo)
	
	public processoEroe eroe; //Nuovo processoEroe
	public JLabel labelEroe; //Label eroe
	
	public JLabel labelSfondo; //Label di sfondo
	
	public labelCuori[] cuori; //Array di labelCuori
	public Thread[] threadCuori; //Array di thread
	
	public labelMostri[] mostri; //Array di labelMostri
	public Thread[] threadMostri; //Array di thread
	
	public int pointLife = 10; //Dichiarazione + Inizializzazione vite
	public int point=0; //Dichiarazione + Inizializzazione punti
	
	public boolean bum = false; //Controllo di un probabile incontro
	public boolean cuore = false; //Controllo sul salto per vita
	
	
	//Costruttore
	public Grafica(){
		
		//Istanza dei componenti
		labelSfondo = new JLabel(new ImageIcon("Grafica/sfondo.gif")); //Instanza dello sfondo
		
		labelEroe = new JLabel(new ImageIcon("Grafica/run1.gif")); //Istanza dell'eroe
		eroe = new processoEroe(labelEroe); //Istanza del processoEroe
		
		labelSpade = new labelSpada[10]; //Istanza di 10 labelSpada (Processo)
		
		cuori= new labelCuori[100]; //Istanza di 100 cuori
		threadCuori = new Thread[100]; //Istanza di 100 thread
		
		label = new JLabel[10]; //Istanza di 10 label
		
		mostri = new labelMostri[100]; //Istanza di 100 labelMostri
		threadMostri = new Thread[100]; //Istanza di 100 thread
		
		//Richiamo del metodo work
		work(); 
	}
	
	//Metodo work
	public void work(){
		
		label[0] = new JLabel("Life Point: ");
		label[0].setBounds(10,3,150,50);
		label[0].setFont(new Font("",Font.BOLD, 20));
		label[0].setForeground(Color.white);
		add(label[0]);
		
		label[1] = new JLabel(String.valueOf(pointLife));
		label[1].setBounds(120,3,100,50);
		label[1].setFont(new Font("",Font.BOLD, 20));
		label[1].setForeground(Color.white);
		add(label[1]);
		
		label[2] = new JLabel("Punteggio: ");
		label[2].setBounds(200,3,150,50);
		label[2].setFont(new Font("",Font.BOLD, 20));
		label[2].setForeground(Color.white);
		add(label[2]);
		
		label[3] = new JLabel(String.valueOf(point));
		label[3].setBounds(320,3,100,50);
		label[3].setFont(new Font("",Font.BOLD, 20));
		label[3].setForeground(Color.white);
		add(label[3]);
		
		labelSfondo.setBounds(0,0,1024,450); //Imposto dimensione e coordinate dello sfondo
		labelEroe.setBounds(29,200,180,180); //Imposto dimensione e coordinate dell'eroe
		
		for(int i=0;i<5;i++){
		
			int monst=(int)(Math.random()*5); //Random del mostro
			mostri[i] = new labelMostri("Grafica/monst"+monst+".gif",this); //Istanza di ogni singolo mostro con random del mostro
			mostri[i].setBounds(993,200,180,180); //Imposto dimensione e coordinate di ogni singolo mostro
			add(mostri[i]); //Aggiungo i mostri alla finestra
			
			threadMostri[i] = new Thread(mostri[i]); //Credo i thread
		}
		
		for(int i=0;i<10;i++){
			
			cuori[i] = new labelCuori("Grafica/ptlife.gif",this); //Istanza di ogni singolo cuore
			cuori[i].setBounds(993,70,180,180); //Imposto dimensione e coordinate di ogni singolo cuore
			add(cuori[i]); //Aggiungo i cuori alla finestra
			
			threadCuori[i] = new Thread(cuori[i]); //Credo i thread
		}
		
		for(int i=0;i<10;i++){
			labelSpade[i]=new labelSpada("Grafica/spada.png",mostri,this); //Istanza di ogny singolo labelSpada (Processo)
		}
		
		add(labelEroe); //Aggiungo l'eroe alla finestra
		add(labelSfondo); //Aggiungo lo sfondo alla finestra
		
		addKeyListener(new EventiTastiera(this)); //Aggiungo i controlli della tastiera alla finestra
		
		//Proprietà finestra
		setLayout(null); //Layout nullo
		setTitle("MonsterInvasion"); //Nome gioco
		setSize(1024, 450); //Imposto le dimensioni
		setVisible(true); //Finestra visibile
		setResizable(false); //Finestra modificabili
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chiudo il processo con la X
		
		for(int i=0;i<5;i++){
			threadMostri[i].start(); //Eseguo i thread
			threadCuori[i].start(); //Eseguo i thread
		}
	}
}

class Gioco{
	public static void main(String[] args){
		Grafica g = new Grafica();
	}	
}