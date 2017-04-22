import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class InterfacciaGrafica extends JFrame{
	public Pannello p;
	public AscoltaTasti at;
	public static Giocabilita g;
	public int x=0,y=0,x1=0,y1=0;
	InterfacciaGrafica(){
		super("Dragonball!");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		p = new Pannello(x,y,x1,y1);
		at = new AscoltaTasti(p);
		p.addKeyListener(at);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		g = new Giocabilita();
		g.start();

	}

}
