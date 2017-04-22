import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class AscoltaTasti implements KeyListener{
	   public Pannello p;
	   AscoltaTasti(Pannello p1){
		   p = p1;
	   }
	   public void keyPressed(KeyEvent e) {
			int pressione = e.getKeyCode();
			if(pressione==37){
				p.x=p.x-10;
				if(p.x<0){
					p.x=0;
				}
				else{
					p.repaint();
				}
			}
			if(pressione==39){
				p.x= p.x+10;
				if(p.x>670){
					p.x=670;	
				}
				else{
					p.repaint();
				}
			}
			if(pressione==38){
				p.y= p.y-10;
				if(p.y>500){
					p.y=500;	
				}
				else{
					p.repaint();
				}
			}
			if(pressione==40){
				p.y= p.y+10;
				if(p.y<0){
					p.y=0;	
				}
				else{
					p.repaint();
				}
			}
		}
		public void keyReleased(KeyEvent e) {	
		}
		public void keyTyped(KeyEvent e) {	
		}
}