import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Giocabilita extends Thread{
	private boolean arrivato = false;

	public void run(){
		try{
			sleep(1000);
		}catch(Exception e){
		}
		Tempo t = new Tempo();
		t.start();
		while(t.ig.p.punteggio!=1000||t.ig.p.tempo!=0){
			arrivato = false;
		    t.ig.p.X = (int)(Math.random()*700);
	        t.ig.p.xstella = (int)(Math.random()*700);
	        t.ig.p.X1 = (int)(Math.random()*700);
	        t.ig.p.xstella2 = (int)(Math.random()*700);
	        t.ig.p.xstella3 = (int)(Math.random()*700);
	        t.ig.p.xstella4 = (int)(Math.random()*700);
	        t.ig.p.xstella5 = (int)(Math.random()*700);
	        t.ig.p.xasteroide = (int)(Math.random()*700);
	        t.ig.p.xasteroide2 = (int)(Math.random()*700);
	        t.ig.p.xasteroide3 = (int)(Math.random()*700);
	        t.ig.p.xasteroide4 = (int)(Math.random()*700);
	        t.ig.p.xasteroide5 = (int)(Math.random()*700);
	        t.ig.p.xstella6 = (int)(Math.random()*700);
	        t.ig.p.xstella7 = (int)(Math.random()*700);
	        t.ig.p.xstella8 = (int)(Math.random()*700);
	        t.ig.p.xstella9 = (int)(Math.random()*700);
	        t.ig.p.xstella10 = (int)(Math.random()*700);
	        t.ig.p.Y = -60;
	        t.ig.p.yasteroide = -60;
	        t.ig.p.yasteroide2 = -60;
	        t.ig.p.ystella = -60;
	        t.ig.p.ystella2 = -60;
	        t.ig.p.ystella3 = -60;
	        t.ig.p.ystella4 = -60;
	        t.ig.p.ystella5 = -60;
	        t.ig.p.ystella6 = -60;
	        t.ig.p.ystella7 = -60;
	        t.ig.p.ystella8 = -60;
	        t.ig.p.ystella9 = -60;
	        t.ig.p.ystella10 = -60;
	        t.ig.p.yasteroide3 = -60;
	        t.ig.p.yasteroide4 = -60;
	        t.ig.p.yasteroide5 = -60;
	        t.ig.p.Y1 = -60;
	        Icon icn = new ImageIcon(t.ig.p.navicella);
			while(t.ig.p.yasteroide3<580||t.ig.p.ystella6<580){
				t.ig.p.Y = t.ig.p.Y+20;
				t.ig.repaint();
				t.ig.p.yasteroide = t.ig.p.yasteroide+10;
				t.ig.repaint();
				t.ig.p.yasteroide2 = t.ig.p.yasteroide2+20;
				t.ig.repaint();
				t.ig.p.ystella = t.ig.p.ystella+10;
				t.ig.p.repaint();
				t.ig.p.ystella2 = t.ig.p.ystella2+20;
				t.ig.p.repaint();
				t.ig.p.ystella3 = t.ig.p.ystella3+30;
				t.ig.p.repaint();
				t.ig.p.ystella4 = t.ig.p.ystella4+40;
				t.ig.p.repaint();
				t.ig.p.ystella5 = t.ig.p.ystella5+50;
				t.ig.p.repaint();
				t.ig.p.Y1 = t.ig.p.Y1+20;
				t.ig.p.repaint();
				if(arrivato){
					t.ig.p.ystella6 = t.ig.p.ystella6+10;
					t.ig.p.repaint();
					t.ig.p.ystella7 = t.ig.p.ystella7+20;
					t.ig.p.repaint();
					t.ig.p.ystella8 = t.ig.p.ystella8+30;
					t.ig.p.repaint();
					t.ig.p.ystella9 = t.ig.p.ystella9+40;
					t.ig.p.repaint();
					t.ig.p.ystella10 = t.ig.p.ystella10+50;
					t.ig.p.repaint();
					t.ig.p.yasteroide3 = t.ig.p.yasteroide3+10;
					t.ig.p.repaint();
					t.ig.p.yasteroide4 = t.ig.p.yasteroide4+20;
					t.ig.p.repaint();
					t.ig.p.yasteroide5 = t.ig.p.yasteroide5+30;
					t.ig.p.repaint();
				}
					if(t.ig.p.contatto){
						t.ig.p.Y1 = -60;
						t.ig.p.X1 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto2){
						t.ig.p.ystella = -60;
						t.ig.p.xstella = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto3){
						t.ig.p.ystella2 = -60;
						t.ig.p.xstella2 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto4){
						t.ig.p.ystella3 = -60;
						t.ig.p.xstella3 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto5){
						t.ig.p.ystella4 = -60;
						t.ig.p.xstella4 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto6){
						t.ig.p.ystella5 = -60;
						t.ig.p.xstella5 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto7){
						t.ig.p.ystella6 = -60;
						t.ig.p.xstella6 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto8){
						t.ig.p.ystella7 = -60;
						t.ig.p.xstella7 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto9){
						t.ig.p.ystella8 = -60;
						t.ig.p.xstella8 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto10){
						t.ig.p.ystella9 = -60;
						t.ig.p.xstella9 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto11){
						t.ig.p.ystella10 = -60;
						t.ig.p.xstella10 = (int)(Math.random()*700);
						t.ig.p.punteggio++;
						t.ig.p.tempo = t.ig.p.tempo+5;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto12){
						t.ig.p.yasteroide = -60;
						t.ig.p.xasteroide = (int)(Math.random()*700);
						t.ig.p.punteggio--;
						t.ig.p.tempo = t.ig.p.tempo-2;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto13){
						t.ig.p.yasteroide2 = -60;
						t.ig.p.xasteroide2 = (int)(Math.random()*700);
						t.ig.p.punteggio--;
						t.ig.p.tempo = t.ig.p.tempo-2;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto14){
						t.ig.p.yasteroide3 = -60;
						t.ig.p.xasteroide3 = (int)(Math.random()*700);
						t.ig.p.punteggio--;
						t.ig.p.tempo = t.ig.p.tempo-2;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto15){
						t.ig.p.yasteroide4 = -60;
						t.ig.p.xasteroide4 = (int)(Math.random()*700);
						t.ig.p.punteggio--;
						t.ig.p.tempo = t.ig.p.tempo-2;
						t.ig.p.repaint();
					}
					if(t.ig.p.contatto16){
						t.ig.p.yasteroide5 = -60;
						t.ig.p.xasteroide5 = (int)(Math.random()*700);
						t.ig.p.punteggio--;
						t.ig.p.tempo = t.ig.p.tempo-2;
						t.ig.p.repaint();
					}
			    try{
					sleep(200);
				}catch(InterruptedException e){
				}
				if(t.ig.p.yasteroide==200||t.ig.p.ystella==200){
					arrivato = true;
				}
			}
		}  
	}

}
