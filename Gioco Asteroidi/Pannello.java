import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTextPane;

class Pannello extends JTextPane{
	    public Image sfondo,navicella,stella2,asteroide2;
	    public int punteggio=0;
	    public Toolkit caricatore;
	    public int x=300;
	    public int y=440;
	    public int X=0,Y=0,X1=0,Y1=0,xstella=0,ystella=0,xstella2=0,ystella2=0;
	    public int xstella3=0,ystella3=0,xstella4=0,ystella4=0,xstella5=0,ystella5=0;
	    public int xasteroide=0,yasteroide=0,xasteroide2=0,yasteroide2=0;
	    public int xstella6=0,ystella6=0,xstella7=0,ystella7=0,xstella8=0,ystella8=0;
	    public int xstella9=0,ystella9=0,xstella10=0,ystella10=0;
	    public int xasteroide3=0,yasteroide3=0,xasteroide4=0,yasteroide4=0,xasteroide5=0,yasteroide5=0;
	    public boolean contatto,contatto2,contatto3,contatto4,contatto5;
	    public boolean contatto6,contatto7,contatto8,contatto9,contatto10;
	    public boolean contatto11,contatto12,contatto13,contatto14,contatto15,contatto16;
	    public int tempo;
	    Pannello(int X,int Y,int X1,int Y1){
			setLayout(null);
	        caricatore = Toolkit.getDefaultToolkit(); 
			sfondo = caricatore.getImage("immagini/sfondo.jpg");	
			navicella = caricatore.getImage("immagini/goku14.gif");
			stella2 = caricatore.getImage("immagini/ball.png");
		    
			stella2 = stella2.getScaledInstance(35, 35, 0);
		    
			asteroide2 = caricatore.getImage("immagini/orb.png");
			asteroide2 = asteroide2.getScaledInstance(35, 35, 0);
		    
			//navicella = navicella.getScaledInstance(120, 70, 0);
			this.X = X;
			this.Y = Y;
			this.X1 = X1;
			this.Y1 = Y1;
			setEditable(false);
			setVisible(true);
		}
	    public void paint(Graphics g){
			super.paint(g);
			g.drawImage(sfondo, 0, 0,this);
			g.drawImage(navicella, x, y, this);
			g.setColor(Color.black);
			g.setFont(new Font("calibri",Font.ITALIC,30));
			g.drawString("Life Points: "+punteggio, 10, 40);
			g.drawString("Tempo: "+tempo, 10, 80);
			g.drawImage(stella2, X1, Y1, this);
			g.drawImage(stella2, xstella, ystella, this);
			g.drawImage(stella2, xstella2, ystella2, this);
			g.drawImage(stella2, xstella3, ystella3, this);
			g.drawImage(stella2, xstella4, ystella4, this);
			g.drawImage(stella2, xstella5, ystella5, this);
			g.drawImage(stella2, xstella6, ystella6, this);
			g.drawImage(stella2, xstella7, ystella7, this);
			g.drawImage(stella2, xstella8, ystella8, this);
			g.drawImage(stella2, xstella9, ystella9, this);
			g.drawImage(stella2, xstella10, ystella10, this);
			g.drawImage(asteroide2, X, Y, this);
			g.drawImage(asteroide2, xasteroide, yasteroide, this);
			g.drawImage(asteroide2, xasteroide2, yasteroide2, this);
			g.drawImage(asteroide2, xasteroide3, yasteroide3, this);
			g.drawImage(asteroide2, xasteroide4, yasteroide4, this);
			g.drawImage(asteroide2, xasteroide5, yasteroide5, this);
			g.clipRect(X1, Y1, 100, 17);
			contatto = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella, ystella, 100, 17);
			contatto2 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella2, ystella2, 100, 17);
			contatto3 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella3, ystella3, 100, 17);
			contatto4 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella4, ystella4, 100, 17);
			contatto5 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella5, ystella5, 100, 17);
			contatto6 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella6, ystella6, 100, 17);
			contatto7 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella7, ystella7, 100, 17);
			contatto8 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella8, ystella8, 100, 17);
			contatto9 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella9, ystella9, 100, 17);
			contatto10 = g.hitClip(x, 500, 150, 100);
			g.setClip(xstella10, ystella10, 100, 17);
			contatto11 = g.hitClip(x, 500, 150, 100);
			g.setClip(xasteroide, yasteroide, 100, 12);
			contatto12 = g.hitClip(x, 500, 150, 100);
			g.setClip(xasteroide2, yasteroide2, 100, 12);
			contatto13 = g.hitClip(x, 500, 150, 100);
			g.setClip(xasteroide3, yasteroide3, 100, 12);
			contatto14 = g.hitClip(x, 500, 150, 100);
			g.setClip(xasteroide4, yasteroide4, 100, 12);
			contatto15 = g.hitClip(x, 500, 150, 100);
			g.setClip(xasteroide5, yasteroide5, 100, 12);
			contatto16 = g.hitClip(x, 500, 150, 100);
		}
}