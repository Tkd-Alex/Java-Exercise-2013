//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.JComponent.*; //Colore tasti

class Grafica extends JFrame{

	//Attributi
	private JPanel pb;
	private JPanel[] pa;
	private JTextField t1  /*,t2*/  ;
	private JButton [] bu;
	private JMenuBar menbar;
	private JMenu [] men;
	private JMenuItem [] menit;
	
	private JButton pow, log;
	
	//Costruttore
	public Grafica(){
		//Istanza dei componenti
		pb = new JPanel();
		pa = new JPanel[5];
		t1 = new JTextField();
		//t2 = new JTextField();
		bu = new JButton[27];
		menbar = new JMenuBar();
		men = new JMenu[3];
		menit = new JMenuItem[8];
		pow = new JButton("Pot");
		log = new JButton("Log");
		
		work();
	}
	
	public void work(){
		
		//Instanza degli array pannello
		for(int i=1;i<5;i++){
			pa[i] = new JPanel();
			pa[i].setLayout(new GridLayout(1,6,5,0));
		}
		
		//Instanza degli array bottoni
		for(int i=0;i<27;i++){
			bu[i] = new JButton();
		}

		//Instanza dei JMenu
		for(int i=0;i<3;i++){
			men[i] = new JMenu();
		}
		
		//Instanza dei JMenuItem
		for(int i=0;i<8;i++){
			menit[i] = new JMenuItem();
		}
		
		//Instanza degli array bottoni
		for(int i=0;i<27;i++){
			bu[i] = new JButton();
		}
		
		setTitle("Calcolatrice"); //Imposto il nome alla finestra
		setLayout(new GridLayout(6,1,0,5)); //Layout per la finestra
		
		//Primo pannello contenente il textfield
		pb.setLayout(new GridLayout(1,1));
		
		t1.setHorizontalAlignment(JTextField.RIGHT); //Allineamento del testo nel textfield
		
		pb.add(t1); //Aggiunta del textfield al pannello
		
		add(pb); //Aggiunta del pannello alla finestra
		
		//Pannello p1 - Parte alta
		pa[0] = new JPanel(); //Istanza
		pa[0].setLayout(new GridLayout(1,4,5,0)); //Setto il layout
		
		//Testo bottoni
		bu[0].setText("Back");
		bu[1].setText("CE");
		bu[2].setText("C");
		
		//Colore testo bottoni
		for(int i=0;i<3;i++){
			bu[i].setForeground(Color.RED);
		}
		
		/*/---------------------------------------------------//
		
		//Spazio grigio - textfield vuoto
		t2.setEditable(false); //Disattivo il textfield
		t2.setHorizontalAlignment(JTextField.CENTER); //Allineamento del testo nel textfield
		pa[0].add(t2); //Aggiunta del textfield vuoto al pannello [0]
		
		//---------------------------------------------------/*/
		
		pa[0].add(pow);
		pa[0].add(log);
		
		//Aggiunta dei bottoni al pannello [0]
		for(int i=0;i<3;i++){
			pa[0].add(bu[i]);
		}
		
		add(pa[0]); //Aggiungo pannello [0] alla finestra
		
		//Pannello [1] - Parte alto/centro
		
		//Testo bottoni
		bu[3].setText("MC");
		bu[4].setText("7");
		bu[5].setText("8");
		bu[6].setText("9");
		bu[7].setText("/");
		bu[8].setText("sqrt");
		
		//Colore testo bottoni
		bu[3].setForeground(Color.RED);
		for(int i=4;i<7;i++){
			bu[i].setForeground(Color.BLUE);
		}
		bu[7].setForeground(Color.RED);
		bu[8].setForeground(Color.BLUE);
		
		//Aggiunta dei bottoni al pannello [1]
		for(int i=3;i<9;i++){
			pa[1].add(bu[i]);
		}
		
		add(pa[1]); //Aggiungo pannello [1] alla finestra
		
		//Pannello [2] - Parte centro
		
		//Testo bottoni
		bu[9].setText("MR");
		bu[10].setText("4");
		bu[11].setText("5");
		bu[12].setText("6");
		bu[13].setText("*");
		bu[14].setText("%");
		
		//Colore testo bottoni
		bu[9].setForeground(Color.RED);
		for(int i=10;i<13;i++){
			bu[i].setForeground(Color.BLUE);
		}
		bu[13].setForeground(Color.RED);
		bu[14].setForeground(Color.BLUE);		
		
		//Aggiunta dei bottoni al pannello [2]
		for(int i=9;i<15;i++){
			pa[2].add(bu[i]);
		}
		
		add(pa[2]); //Aggiungo pannello [2] alla finestra
		
		//Pannello [3] - Parte centro/bassa
		
		//Testo bottoni
		bu[15].setText("MS");
		bu[16].setText("1");
		bu[17].setText("2");
		bu[18].setText("3");
		bu[19].setText("-");
		bu[20].setText("1/x");
		
		//Colore testo bottoni
		bu[15].setForeground(Color.RED);
		for(int i=16;i<19;i++){
			bu[i].setForeground(Color.BLUE);
		}
		bu[19].setForeground(Color.RED);
		bu[20].setForeground(Color.BLUE);	
		
		//Aggiunta dei bottoni al pannello [3]
		for(int i=15;i<21;i++){
			pa[3].add(bu[i]);
		}
		
		add(pa[3]); //Aggiungo pannello [3] alla finestra
		
		//Pannello [4] - Parte bassa
		
		//Testo bottoni
		bu[21].setText("M+");
		bu[22].setText("0");
		bu[23].setText("+/-");
		bu[24].setText(",");
		bu[25].setText("+");
		bu[26].setText("=");
		
		//Colore testo bottoni
		bu[21].setForeground(Color.RED);
		for(int i=22;i<25;i++){
			bu[i].setForeground(Color.BLUE);
		}
		bu[25].setForeground(Color.RED);
		bu[26].setForeground(Color.BLUE);	
		
		//Aggiunta dei bottoni al pannello [4]
		for(int i=21;i<27;i++){
			pa[4].add(bu[i]);
		}
		
		add(pa[4]); //Aggiungo pannello [4] alla finestra 
		
		//Preparazione menu
		//Primo menu (principale)
		
		setJMenuBar(menbar); //Aggiungo jmenubar alla finestra
		
		
		//Testo JMenu
		men[0].setText("Modifica");
		men[1].setText("Visualizza");
		men[2].setText("?");
		
		//Aggiungo i jmenu al jmenubar
		for(int i=0;i<3;i++){
			menbar.add(men[i]);
		}
		
		//Testo JMenu Item
		menit[0].setText("Copia    CTRL + C");
		menit[1].setText("Incolla    CTRL + V");
		menit[2].setText("Standard");
		menit[3].setText("Scientifica");
		menit[4].setText("Programmatore");
		menit[5].setText("Statistica");
		menit[6].setText("Guida");
		menit[7].setText("Informazioni su Calcolatrice"); 
		
		//Aggiungo i JMenu Item[0]
		men[0].add(menit[0]);
		men[0].add(menit[1]);
		
		//Aggiungo i JMenu Item[1]
		for(int i=2;i<6;i++){
			men[1].add(menit[i]);
		}
		
		//Aggiungo i JMenu Item[2]
		men[2].add(menit[6]);
		men[2].add(menit[7]);
		
		for(int i=0;i<27;i++){
			bu[i].addActionListener(new AscoltoTasti(t1)); //Imposta l'ascoltatore degli eventi dei bottoni
		}
		
		pow.addActionListener(new AscoltoTasti(t1)); //Imposta l'ascoltatore degli eventi dei bottoni
		log.addActionListener(new AscoltoTasti(t1)); //Imposta l'ascoltatore degli eventi dei bottoni
		
		menit[7].addActionListener(new AscoltoTasti(t1)); //Imposta l'ascoltatore degli eventi dei bottoni
		
		//Proprieta finestra
		setIconImage(Toolkit.getDefaultToolkit().getImage("Calculator.png")); //Imposto l'icona
		setSize(390, 260); //Imposto le dimensioni
		setVisible(true); //Finestra visibile
		//f.setResizable(false); //Finestra modificabili
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chiudo il processo con la X
	}
}

class Calcolatrice{
	public static void main(String[] args){
		Grafica c=new Grafica();
	}	
}