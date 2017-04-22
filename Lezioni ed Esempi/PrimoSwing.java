import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;

class PrimoSwing{
	public static void main(String s[]){
		JFrame f=new JFrame("Prima Finestra");
		JPanel p=new JPanel(); 
		
		GridLayout gl=new GridLayout(2,3,20,20);
		f.setLayout(gl);
		
		//GridLayout gl1=new GridLayout(1,2);
		p.setLayout(null);
		
		JLabel l=new JLabel("ciao");
		//l.setBounds(100,200,30,30);
		f.add(l);
		
		f.add(p);
			JTextField t=new JTextField("ciao");
			t.setBounds(10,10,50,50);
			p.add(t);
			
			JButton b=new JButton("Prova Cordinate");
			b.setBounds(10,60,40,40);
			p.add(b);
		
		JLabel l1=new JLabel("ciao1");
		//l.setBounds(100,200,30,30);
		f.add(l1);
		
		JTextField t1=new JTextField("ciao1");
		//t.setBounds(50,200,30,30);
		f.add(t1);
		
		JButton b1=new JButton("ciao1");
		//b.setBounds(200,200,130,30);
		f.add(b1);
		JButton b2=new JButton("ciao2");
		//b.setBounds(200,200,130,30);
		f.add(b2);
		
		
		f.setSize(700, 500); //impostazione dimensioni in pixel
		f.setVisible(true);	
		f.getContentPane().setBackground(Color.RED);//colora lo sfondo	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //impostazione operazione di chiusura
	}		
}