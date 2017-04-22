//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class Enalotto{
	public static void main(String[] args){
	
	Thread t1=new Thread(new Grafica("Bari",5,15,50,"Grafica/complete/bari.png"));
	Thread t2=new Thread(new Grafica("Cagliari",5,318,50,"Grafica/complete/cagliari.png"));
	Thread t3=new Thread(new Grafica("Firenze",5,621,50,"Grafica/complete/firenze.png"));
	Thread t4=new Thread(new Grafica("Genova",5,924,50,"Grafica/complete/genova.png"));
	Thread t5=new Thread(new Grafica("Milano",5,15,203,"Grafica/complete/milano.png"));
	Thread t6=new Thread(new Grafica("Napoli",5,318,203,"Grafica/complete/napoli.png"));
	Thread t7=new Thread(new Grafica("Palermo",5,621,203,"Grafica/complete/palermo.png"));
	Thread t8=new Thread(new Grafica("Roma",5,924,203,"Grafica/complete/roma.png"));
	Thread t9=new Thread(new Grafica("Torino",5,15,356,"Grafica/complete/torino.png"));
	Thread t10=new Thread(new Grafica("Venezia",5,318,356,"Grafica/complete/venezia.png"));
	Thread t11=new Thread(new Grafica("Nazionale",5,621,356,"Grafica/complete/nazionale.png"));	

	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t9.start();
	t10.start();
	t11.start();
		
	}
}

class Grafica extends JFrame implements Runnable{

	//Attributi
	private Pannello pb;
	private JLabel[] estr;
	
	private JLabel lab;
	int fineConteggio,x,primom;
	String nome;
	int r,j;
	int n[]=new int[10];
	
	public Grafica(String nome,int n, int x,int y,String sfondo){
		
		pb = new Pannello(sfondo);
		estr = new JLabel[5];
		
		lab = new JLabel();
		fineConteggio = n;
		this.nome = nome;
		this.x = x;
		
		setTitle(nome);
			
		lab.setHorizontalAlignment(JTextField.CENTER);
		lab.setFont(new Font("Serif", Font.BOLD, 35));
		
		pb.setLayout(null);
		
		lab.setBounds(195,15,40,40);
		
		
		int sposta=25;
		for(int i=0; i<fineConteggio; i++){ 
			estr[i]=new JLabel();
			estr[i].setHorizontalAlignment(JTextField.CENTER);
			estr[i].setFont(new Font("Serif", Font.BOLD, 25));
			estr[i].setBounds(sposta,69,40,40); 
			sposta=sposta+50;
			pb.add(estr[i]);
		}
		
		pb.add(lab);
		
		
		add(pb);
		
		
		setSize(303,153);
		setVisible(true);
		setLocation(x,y);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void run(){
		
		for (int i=0; i<fineConteggio; i++){ 
			
			do{
				r=1;
				
				try{
					Thread.sleep((int)((Math.random()*1000)+500));
					
					n[i]=(int)((Math.random()*90)+1);
					lab.setText(String.valueOf(n[i]));
					estr[i].setText(String.valueOf(n[i]));
				}
				
				catch (InterruptedException e){
					System.out.println("errore");
				}
				
				j=i;
				
				while(j!=0){
					if(n[i]==n[j-1]){
						r=0;
					}
					j--;
				}
				
			}while(r==0);
		}
		
		
		lab.setText("");
	}
	
}

class Pannello extends JPanel{
	private Image image;
	
	public Pannello(String back){
		try {
			image = ImageIO.read(new File (back));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if (image==null)
			return;
		g.drawImage(image,0,0,null);
	}
}


		
