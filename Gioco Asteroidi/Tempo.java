
public class Tempo extends Thread{
	public InterfacciaGrafica ig;
	Tempo(){
		ig = new InterfacciaGrafica();
		ig.p.tempo = 60;
		ig.p.repaint();
	}
	public void run(){
		while(ig.p.tempo!=0){
			ig.p.tempo--;
			ig.p.repaint();
			try{
				sleep(1000);
			}catch(InterruptedException e){
			}
		}
	}

}
