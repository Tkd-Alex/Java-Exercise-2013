//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;

class AscoltoTasti implements ActionListener{
	
	private JTextField t1;
	private String ris;
	
	public AscoltoTasti(JTextField t11){
		t1=t11;
	}
	
	//Metodo di gestione del clic sui bottoni
	public void actionPerformed(ActionEvent e){	
		switch(e.getActionCommand().charAt(0)){
			
			case 'P':
				Calcoli.setOp('P');
				Calcoli.setA(Float.parseFloat(t1.getText()));
				t1.setText("");	
			break;
			
			case ',':
				t1.setText(t1.getText()+".");
			break;
			
			case '9':
				t1.setText(t1.getText()+"9");
			break;
			
			case '8':
				t1.setText(t1.getText()+"8");
			break;
			
			case '7':
				t1.setText(t1.getText()+"7");
			break;
			
			case '6':
				t1.setText(t1.getText()+"6");
			break;
			
			case '5':
				t1.setText(t1.getText()+"5");
			break;
			
			case '4':
				t1.setText(t1.getText()+"4");
			break;
			
			case '3':
				t1.setText(t1.getText()+"3");
			break;
			
			case '2':
				t1.setText(t1.getText()+"2");
			break;
			
			case '1':
				t1.setText(t1.getText()+"1");
			break;
			
			case '0':
				t1.setText(t1.getText()+"0");
			break;
			
			case '/':
				if(Calcoli.getOp()=='/'){
					Calcoli.setOp('/');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
				}
				
				else{
				
				//Prova
				
					switch(Calcoli.getOp()){
						case '/':
							ris = String.valueOf(Calcoli.divisione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '*':
							ris = String.valueOf(Calcoli.moltiplicazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '-':
							ris = String.valueOf(Calcoli.sottrazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '+':
							ris = String.valueOf(Calcoli.addizione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case 'P':
							ris = String.valueOf(Calcoli.potenza(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
					
					}	

					Calcoli.setOp('/');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
					
				//Prova
				}
			break;
			
			case '*':
				if(Calcoli.getOp()=='*'){
					Calcoli.setOp('*');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
				}
					
				else{
				
				//Prova
				
					switch(Calcoli.getOp()){
						case '/':
							ris = String.valueOf(Calcoli.divisione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '*':
							ris = String.valueOf(Calcoli.moltiplicazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '-':
							ris = String.valueOf(Calcoli.sottrazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '+':
							ris = String.valueOf(Calcoli.addizione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case 'P':
							ris = String.valueOf(Calcoli.potenza(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
					
					}	

					Calcoli.setOp('*');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
					
				//Prova
				}
			break;
			
			case '-':
				if(Calcoli.getOp()==' '){
					Calcoli.setOp('-');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
				}
				else{
				
				//Prova
				
					switch(Calcoli.getOp()){
						case '/':
							ris = String.valueOf(Calcoli.divisione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '*':
							ris = String.valueOf(Calcoli.moltiplicazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '-':
							ris = String.valueOf(Calcoli.sottrazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '+':
							ris = String.valueOf(Calcoli.addizione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case 'P':
							ris = String.valueOf(Calcoli.potenza(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
					
					}	

					Calcoli.setOp('-');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
					
				//Prova
				}
			break;
		
			case '+':
				if(Calcoli.getOp()==' '){
					Calcoli.setOp('+');
					Calcoli.setA(Float.parseFloat(t1.getText()));
					t1.setText("");
				}
				else{
				
				//Prova
				
					switch(Calcoli.getOp()){
						case '/':
							ris = String.valueOf(Calcoli.divisione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '*':
							ris = String.valueOf(Calcoli.moltiplicazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '-':
							ris = String.valueOf(Calcoli.sottrazione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case '+':
							ris = String.valueOf(Calcoli.addizione(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
						
						case 'P':
							ris = String.valueOf(Calcoli.potenza(Float.parseFloat(t1.getText())));
							t1.setText(ris);	
						break;
					
					}
					
						Calcoli.setOp('+');
						Calcoli.setA(Float.parseFloat(t1.getText()));
						t1.setText("");

					//Prova
					
				}
			break;
			
			case '%':
				t1.setText(String.valueOf(Calcoli.perc(Float.parseFloat(t1.getText()))));
			break;
			
			case 's':
				t1.setText(String.valueOf(Calcoli.radquad(Float.parseFloat(t1.getText()))));
			break;	

			case 'L':
				t1.setText(String.valueOf(Calcoli.log(Float.parseFloat(t1.getText()))));
			break;				
			
			
			case 'C':
				t1.setText("");
				Calcoli.setOp(' ');
			break;
			
			case '=':
				switch(Calcoli.getOp()){
					case '/':
						ris = String.valueOf(Calcoli.divisione(Float.parseFloat(t1.getText())));
						t1.setText(ris);	
					break;
					
					case '*':
						ris = String.valueOf(Calcoli.moltiplicazione(Float.parseFloat(t1.getText())));
						t1.setText(ris);	
					break;
					
					case '-':
						ris = String.valueOf(Calcoli.sottrazione(Float.parseFloat(t1.getText())));
						t1.setText(ris);	
					break;
					
					case '+':
						ris = String.valueOf(Calcoli.addizione(Float.parseFloat(t1.getText())));
						t1.setText(ris);	
					break;
					
					case 'P':
						ris = String.valueOf(Calcoli.potenza(Float.parseFloat(t1.getText())));
						t1.setText(ris);	
					break;
				
				}
				
				Calcoli.setOp(' ');
				
			break;
		}
		
		if(e.getActionCommand()=="1/x"){
			t1.setText(String.valueOf(Calcoli.unox(Float.parseFloat(t1.getText()))));
		}
		
		if(e.getActionCommand()=="Informazioni su Calcolatrice"){
			JOptionPane.showMessageDialog(null, "Calcolatrice creata da Maggio Alessandro.");
		}
	}
}