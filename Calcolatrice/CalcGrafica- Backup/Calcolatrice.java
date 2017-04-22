//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComponent.*; //Colore tasti

class Calcolatrice{
	public static void main(String s[]){
		
		GridLayout g = new GridLayout(1,6,5,0); //Griglia di base per pannelli p1/p2/p3/p4/p5
		
		JFrame f=new JFrame("Calcolatrice"); //Creo la finestra
		f.setLayout(new GridLayout(6,1,0,5)); //Layout per la finestra
		
		//Primo pannello contenente il textfield
		JPanel p=new JPanel(); 
		p.setLayout(new GridLayout(1,1));
		
		JTextField t=new JTextField("0,");
		t.setHorizontalAlignment(JTextField.RIGHT); //Allineamento del testo nel textfield
		
		p.add(t); //Aggiunta del textfield al pannello
		
		//Pannello p1 - Parte alta
		JPanel p1=new JPanel(); 
		p1.setLayout(new GridLayout(1,4,5,0));
		
		//Creazione bottoni 
		JButton b1p1=new JButton("Back");
		JButton b2p1=new JButton("CE");
		JButton b3p1=new JButton("C");
		
		//Colore testo bottone
		b1p1.setForeground(Color.RED);
		b2p1.setForeground(Color.RED);
		b3p1.setForeground(Color.RED);

		//Spazio grigio - textfield vuoto
		JTextField t1p1=new JTextField();
		t1p1.setEditable(false); //Disattivo il textfield
	
		//Aggiungo tutti i bottoni al pannello
		p1.add(t1p1);
		p1.add(b1p1);
		p1.add(b2p1);
		p1.add(b3p1);
		
		//Pannello p2 - Parte alto/centro
		
		JPanel p2=new JPanel(); 
		p2.setLayout(g);
		
		//Creazione bottoni 
		JButton b1p2=new JButton("MC");
		JButton b2p2=new JButton("7");
		JButton b3p2=new JButton("8");
		JButton b4p2=new JButton("9");
		JButton b5p2=new JButton("/");
		JButton b6p2=new JButton("sqrt");
		
		//Colore testo bottone
		b1p2.setForeground(Color.RED);
		b2p2.setForeground(Color.BLUE);
		b3p2.setForeground(Color.BLUE);
		b4p2.setForeground(Color.BLUE);
		b5p2.setForeground(Color.RED);
		b6p2.setForeground(Color.BLUE);
		
		//Aggiungo tutti i bottoni al pannello
		p2.add(b1p2);
		p2.add(b2p2);
		p2.add(b3p2);
		p2.add(b4p2);
		p2.add(b5p2);
		p2.add(b6p2);
		
		
		//Pannello p3 - Parte centro
		
		JPanel p3=new JPanel(); 
		p3.setLayout(g);
		
		//Creazione bottoni 
		JButton b1p3=new JButton("MR");
		JButton b2p3=new JButton("4");
		JButton b3p3=new JButton("5");
		JButton b4p3=new JButton("6");
		JButton b5p3=new JButton("*");
		JButton b6p3=new JButton("%");
		
		//Colore testo bottone
		b1p3.setForeground(Color.RED);
		b2p3.setForeground(Color.BLUE);
		b3p3.setForeground(Color.BLUE);
		b4p3.setForeground(Color.BLUE);
		b5p3.setForeground(Color.RED);
		b6p3.setForeground(Color.BLUE);
		
		//Aggiungo tutti i bottoni al pannello
		p3.add(b1p3);
		p3.add(b2p3);
		p3.add(b3p3);
		p3.add(b4p3);
		p3.add(b5p3);
		p3.add(b6p3);
		
		//Pannello p4 - Parte centro/bassa
		
		JPanel p4=new JPanel(); 
		p4.setLayout(g);
		
		//Creazione bottoni 
		JButton b1p4=new JButton("MS");
		JButton b2p4=new JButton("1");	
		JButton b3p4=new JButton("2");			
		JButton b4p4=new JButton("3");
		JButton b5p4=new JButton("-");
		JButton b6p4=new JButton("1/x");
		
		//Colore testo bottone
		b1p4.setForeground(Color.RED);
		b2p4.setForeground(Color.BLUE);
		b3p4.setForeground(Color.BLUE);
		b4p4.setForeground(Color.BLUE);
		b5p4.setForeground(Color.RED);
		b6p4.setForeground(Color.BLUE);
		
		//Aggiungo tutti i bottoni al pannello
		p4.add(b1p4);
		p4.add(b2p4);
		p4.add(b3p4);
		p4.add(b4p4);
		p4.add(b5p4);
		p4.add(b6p4);
		
		//Pannello p5 - Parte bassa
		
		JPanel p5=new JPanel(); 
		p5.setLayout(g);
		
		
		//Creazione bottoni 
		JButton b1p5=new JButton("M+");
		JButton b2p5=new JButton("0");
		JButton b3p5=new JButton("+/-");
		JButton b4p5=new JButton(",");
		JButton b5p5=new JButton("+");
		JButton b6p5=new JButton("=");
		
		//Colore testo bottone
		b1p5.setForeground(Color.RED);
		b2p5.setForeground(Color.BLUE);
		b3p5.setForeground(Color.BLUE);
		b4p5.setForeground(Color.BLUE);
		b5p5.setForeground(Color.RED);
		b6p5.setForeground(Color.RED);
		
		//Aggiungo tutti i bottoni al pannello
		p5.add(b1p5);
		p5.add(b2p5);
		p5.add(b3p5);
		p5.add(b4p5);
		p5.add(b5p5);
		p5.add(b6p5);
		
		//Aggiunta dei pannelli alla finestra
		f.add(p);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		
		//Preparazione menù
		
		//Primo menù (principale)
		JMenuBar menu = new JMenuBar(); //Credo il jmenubar
		f.setJMenuBar(menu); //Aggiungo jmenubar alla finestra
		
		//Credo i jmenu
		JMenu modifica = new JMenu("Modifica");
		JMenu vis = new JMenu("Visualizza");
		JMenu help = new JMenu("?");
		
		//Aggiungo i jmenu al jmenubar
		menu.add(modifica);
		menu.add(vis);
		menu.add(help);
		
		//Menù modifica (improvvisato)
		
		//Credo i jmenuitem
		JMenuItem copia = new JMenuItem("Copia    CTRL + C");
		JMenuItem incolla = new JMenuItem("Incolla    CTRL + V");
		
		//Aggiungo i jmenuitem ai jmenu appropiati
		modifica.add(copia);
		modifica.add(incolla);
		
		//Menù visualizza (improvvisato)
		
		//Credo i jmenuitem
		JMenuItem stand = new JMenuItem("Standard");
		JMenuItem scie = new JMenuItem("Scientifica");
		JMenuItem pro = new JMenuItem("Programmatore");
		JMenuItem sta = new JMenuItem("Statistica");
		
		//Aggiungo i jmenuitem ai jmenu appropiati
		vis.add(stand);
		vis.add(scie);
		vis.add(pro);
		vis.add(sta);
		
		//Menù help (improvvisato)
		
		//Credo i jmenuitem
		JMenuItem gui = new JMenuItem("Guida");
		JMenuItem inf = new JMenuItem("Informazioni su Calcolatrice");
		
		//Aggiungo i jmenuitem ai jmenu appropiati
		help.add(gui);
		help.add(inf);
		
		//Proprietà finestra
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("Calculator.png")); //Imposto l'icona
		f.setSize(390, 260); //Imposto le dimensioni
		f.setVisible(true); //Finestra visibile
		//f.setResizable(false); //Finestra modificabili
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chiudo il processo con la X
	}

}




