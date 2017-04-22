//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;

class ContatoriG extends JFrame implements Runnable{

	//Attributi
	private JLabel l1,l2;
	
	int rit,fineConteggio;
	String Nome;
		
	public ContatoriG(String Nome, int n, int rit,int y){
		l1=new JLabel();
		this.rit=rit;
		fineConteggio = n;
		this.Nome=Nome;	
		
		
		work(y);
	}

	
	//metodo run 
	public void run(){
		for (int i=1; i<=fineConteggio; i++){ 
			try{
				Thread.sleep(rit);
				
				l1.setText(String.valueOf((int)(Math.random()*90)+1));
			}
			catch (InterruptedException e){
				System.out.println("errore");
			}
		}
	}
	
	public void work(int y){

		setTitle("Contatori"); //Imposto il nome alla finestra
		setLayout(new GridLayout(1,2,0,5)); //Layout per la finestra
		
		l1.setHorizontalAlignment(JTextField.CENTER);
			
		add(l1);
		
		//Proprieta finestra
		setSize(150, 150); //Imposto le dimensioni
		setVisible(true); //Finestra visibile
		setLocation(50,y);
		//f.setResizable(false); //Finestra modificabili
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chiudo il processo con la X
		
	}
	
}

class Contatori2{
	public static void main(String[] args){
		
		Thread t1=new Thread(new ContatoriG("Processo1",20,800,5));
		ContatoriG Processo2 = new ContatoriG("Processo2",20,500,155);
		Thread t2=new Thread(Processo2);
		t1.start();
		t2.start(); 
		
	}	
}
