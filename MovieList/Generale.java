//Librerie
import java.awt.*;				
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.*;

class bottoniGrafici extends JButton{
	public bottoniGrafici (){
		super();
		setBorder(null);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setOpaque(false);
	}	
}

class labelGrafici extends JLabel{
	public labelGrafici (){
		super();
		setFont(new Font("",Font.BOLD, 20));
		setForeground(Color.white);
	}	
}

class pannelloImmagine extends JPanel{
	private Image image;
	
	public pannelloImmagine(String back){
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

class Grafica extends JFrame{

	//Attributi
	private JPanel scheda,griglia,menu;
	private JTextField[] testo;
	private labelGrafici[] label;
	private pannelloImmagine sfondo;
	private bottoniGrafici[] bottoni;
	private ImageIcon[] immagini;
	private Film[] films;
	private int lungh;
	
	private int index;
	
	//Costruttore
	public Grafica(){
		//Istanza dei componenti
		scheda = new JPanel();
		griglia = new JPanel();
		menu = new JPanel();
		testo = new JTextField[5];
		label = new labelGrafici[5];
		bottoni = new bottoniGrafici[6];
		immagini = new ImageIcon[20];
		films = new Film[100];
		lungh=0;
		sfondo = new pannelloImmagine("Bottoni/back.png");
		
		index = 0;
		
		work();
	}
	
	public void work(){
		
		//----------------------------------------------//
		//Menù
		
		menu.setLayout(new GridLayout(6,1,20,20));
		menu.setBounds(10,100,150,400);
		menu.setOpaque(false);
		
		for(int i=0;i<6;i++){
			bottoni[i] = new bottoniGrafici();
		}
		
		immagini[0] = new ImageIcon("Bottoni/aggiungi.png");
		immagini[1] = new ImageIcon("Bottoni/aggiungi2.png");
		bottoni[0].setIcon(immagini[0]);
		bottoni[0].setPressedIcon(immagini[1]);
		
		
		immagini[2] = new ImageIcon("Bottoni/rimuovi.png");
		immagini[3] = new ImageIcon("Bottoni/rimuovi2.png");
		bottoni[1].setIcon(immagini[2]);
		bottoni[1].setPressedIcon(immagini[3]);
		bottoni[1].setEnabled(false); 
		
		immagini[4] = new ImageIcon("Bottoni/modifica.png");
		immagini[5] = new ImageIcon("Bottoni/modifica.png");
		bottoni[2].setIcon(immagini[4]);
		bottoni[2].setPressedIcon(immagini[5]);
		bottoni[2].setEnabled(false); 
		
		immagini[5] = new ImageIcon("Bottoni/cerca.png");
		immagini[6] = new ImageIcon("Bottoni/cerca2.png");
		bottoni[3].setIcon(immagini[5]);
		bottoni[3].setPressedIcon(immagini[6]);
		
		immagini[7] = new ImageIcon("Bottoni/importa.png");
		immagini[8] = new ImageIcon("Bottoni/importa2.png");
		bottoni[4].setIcon(immagini[7]);
		bottoni[4].setPressedIcon(immagini[8]);
		
		immagini[9] = new ImageIcon("Bottoni/esporta.png");
		immagini[10] = new ImageIcon("Bottoni/esporta2.png");
		bottoni[5].setIcon(immagini[9]);
		bottoni[5].setPressedIcon(immagini[10]);
		
		for(int i=0;i<6;i++){
			menu.add(bottoni[i]);
		}
		
		//----------------------------------------------//
		//Lista griglia
		
		griglia.setLayout(new GridLayout(1,0));
		griglia.setBounds(180,100,600,400);
		
		Object rowData[][] = {};
						
		Object columnNames[] = { "Titolo", "Anno", "Genere", "Durata", "Produttori" };
		
		
		final DefaultTableModel model = new DefaultTableModel(rowData, columnNames){
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		final JTable table = new JTable(model);
		
		table.getTableHeader().setReorderingAllowed(false);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
		
			public void valueChanged(ListSelectionEvent e){
				index = table.getSelectedRow();
				
				if(index>-1){
					for(int i=0;i<5;i++){
						testo[i].setText(String.valueOf(table.getValueAt(index,i)));
					}
				}	
				
				bottoni[0].setEnabled(true); 
				bottoni[1].setEnabled(true); 
				bottoni[2].setEnabled(true);
			}
			
		});

		JScrollPane scrollPane = new JScrollPane(table);
		griglia.add(scrollPane, BorderLayout.CENTER);
		
		//----------------------------------------------//
		//Scheda Film
		
		scheda.setLayout(new GridLayout(5,2,0,20));
		scheda.setBounds(800,100,350,250);
		scheda.setOpaque(false);
		
		for(int i=0;i<5;i++){
			label[i] = new labelGrafici();
		}
		
		label[0].setText("Titolo: ");
		label[1].setText("Anno: ");
		label[2].setText("Genere: ");
		label[3].setText("Durata: ");
		label[4].setText("Produttori: ");
		
		for(int i=0;i<5;i++){
			testo[i] = new JTextField();
		}
		
		for(int i=0;i<5;i++){
			scheda.add(label[i]);
			scheda.add(testo[i]);
		}
		
		//----------------------------------------------//
		//Gestione Bottoni
		
		bottoni[0].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				Object[] data = {testo[0].getText(), testo[1].getText(), testo[2].getText(), testo[3].getText(), testo[4].getText()};
				model.addRow(data);	
			
				films[lungh] = new Film(testo[0].getText(), testo[1].getText(), testo[2].getText(), testo[3].getText(), testo[4].getText());
				lungh++;

				for(int i=0;i<5;i++){
					testo[i].setText("");
				}
					
				}
			}
		);
			
		bottoni[1].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				for(int i=0;i<5;i++){
					testo[i].setText("");
				}
				
				for(int i=index;i<lungh;i++){
					films[i]=films[i+1];
				}
				
				lungh--;
				
				model.removeRow(index);
				bottoni[0].setEnabled(true);
				bottoni[1].setEnabled(false);
				bottoni[2].setEnabled(false); 
				
				table.clearSelection();
					
				}
			}
		);
			
		bottoni[2].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				films[index].setAll(testo[0].getText(), testo[1].getText(), testo[2].getText(), testo[3].getText(), testo[4].getText());
					
				for(int i=0;i<5;i++){
					Object data = testo[i].getText();
					model.setValueAt(data,index,i);
					testo[i].setText("");
				}
				
				table.clearSelection();	
				
				bottoni[0].setEnabled(true);
				bottoni[1].setEnabled(false);
				bottoni[2].setEnabled(false);
					
				}
			}
		);
			
		bottoni[3].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
				Boolean trovato=false;
				int i,t;
				String ricerca = JOptionPane.showInputDialog("Inserisci il nome del film da ricercare."); 
				
				for(i=0;i<lungh;i++){
					if(trovato){
						i=lungh;
					}
					else{
						if(films[i].getNome().equals(ricerca)){
							table.getSelectionModel().setSelectionInterval(i,i);
						}
					}
				}
				
				}
			}
		);	
			
		bottoni[4].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
							
					try{

					FileInputStream f=new FileInputStream("elenco.dat");
					ObjectInputStream fin= new ObjectInputStream(f);

					int i=0;	

					while(true){
						try{ 
							films[i]=(Film)fin.readObject();
							Object[] data = {films[i].getNome(), films[i].getGenere(), films[i].getAnno(), films[i].getDurata(), films[i].getProduttori()};
							model.addRow(data);		
							i++;
						}
						
						catch (EOFException u){
							break;
						}
					}
					
					lungh=i;
						
					f.close();
					}

					catch(Exception o){
						System.out.println("Eccezione"+ o.getMessage()); 
					}

				}
			}
		);
		
		bottoni[5].addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
							
					try{

						FileOutputStream f=new FileOutputStream("elenco.dat");
						ObjectOutputStream fOut= new ObjectOutputStream(f);
						
						for(int i=0;i<lungh;i++){
							fOut.writeObject(films[i]);
						}

						fOut.flush();
						f.close();
						
						JOptionPane.showMessageDialog(null, "Database esportato con succetto.");
					}

					catch(Exception a){
						System.out.println("Eccezione"+ a.getMessage()); 
					}	

				}
			}
		);

			
			
		//----------------------------------------------//
		//Finestra
		
		setLayout(null);
		//setLayout(new GridLayout(1,3,10,0));
		add(menu);
		add(griglia);
		add(scheda);

		sfondo.setBounds(0,0,1200,550);
		add(sfondo);
		
		//Proprietà finestra
		setTitle("MovieList");
		setSize(1200, 550); //Imposto le dimensioni
		setVisible(true); //Finestra visibile
		setResizable(false); //Finestra modificabili
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Chiudo il processo con la X
	}
}

class Generale{
	public static void main(String[] args){
		Grafica g=new Grafica();
	}	
}