
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Test extends JFrame implements ActionListener {
	  private JPanel mainPanel;
	    private JLabel trenuri;
	    private JTextField cod;
	    private JTextArea a;
	    private JPanel afisare;
	    private JButton button;
		private static Gara waterloo=new Gara();
	    public Test(String title){
	        // calling the constructor for JFrame to set the title
	        super(title);
	        
	        // initializing the components (method is implemented below)
	        initComponents();
	        
	        // calling pack() defined in superclass to resize the frame according to
	        // contents
	        pack();
	        
	        // displaying the frame
	        setVisible(true);
	        setSize(400,300);
	        // select the default behaviour when closing the frame by clicking
	        // the X button on the bar: the application will exit
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }
	   public static void main(String[] args) {

	Test frame = new Test("Gara");
	Tren t1=new Tren("Berlin","10:01","AC1");
	Tren t2=new Tren("Cluj-Napoca","05:01","AC2");
	Tren t3=new Tren("Munchen","20:01","AC3");
	Tren t4=new Tren("Bucuresti","15:01","AC4");
	Tren t5=new Tren("Budapesta","13:01","AC5");
	waterloo.addTren(t1);
	waterloo.addTren(t2);
	waterloo.addTren(t3);
	waterloo.addTren(t4);
	waterloo.addTren(t5);
	List<Tren> water= new ArrayList<Tren>();
	water=waterloo.getGara();
	//Collections.sort(waterloo.getGara());
	Collections.sort(water, new Comparator<Tren>() {
	    
	    public int compare(Tren o1, Tren o2) {
	        int result =o1.getDate().compareTo(o2.getDate());
	        return result;
	        
	    }
	});
	waterloo.setGara(water);
	for (int i=0;i<waterloo.size();i++)
	{

	System.out.println(waterloo.getGara().get(i).getDestination());
	   }
	   }

private void initComponents() {
    // setting the layout as FlowLayout
    setLayout(new FlowLayout());
    
    // creating the components
    
    // the panel adds the components in
    // a FlowLayout
    mainPanel = new JPanel(new FlowLayout()); 
    trenuri = new JLabel("Trenuri: ");
    
    cod = new JTextField(3); 
    afisare = new JPanel(); 
   
    button = new JButton("Afisare tren");
    a= new JTextArea();
   
    //adding components to panel
    mainPanel.add(trenuri);
    mainPanel.add(cod);
    mainPanel.add(button);
 
    afisare.add(a);
    afisare.setBackground(Color.white);
    
    mainPanel.add(afisare);
    add(mainPanel);
    
    button.addActionListener(this);
}

public void actionPerformed(ActionEvent _actionEvent) {
	String cod_text = cod.getText();
	for (int i=0;i<waterloo.size();i++)
	{
		if (cod_text.equals(waterloo.getTren(i).getCode()))
		{
			
			a.setText("Destinatia este: "+waterloo.getTren(i).getDestination()+"\n"+"Pleaca la ora: "+waterloo.getTren(i).getDate());
			break;
		}
		else a.setText("Nu s-a gasit un tren cu acest cod!");
	}
	
}
}


    