
package framethéatre;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FrameClient extends JFrame {
    private JLabel jcomp2;
    private JTextField num;
    private JButton BRes;
    private JLabel jcomp4;
    private JTextField nom;
    private JButton BAnn;
    private JLabel jcomp7;
    private JTextField tel;
    private JButton BRet;
    SQLService sq ; 
            String DRIVE="org.apache.derby.jdbc.ClientDriver";
            String PATH="jdbc:derby://localhost:1527/theatre"; 
            String USER="ghaith2";
            String PASSWORD="95027629";
   
            
    public FrameClient() {
        setTitle("Information sur le client ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //construct components
        jcomp2 = new JLabel ("numemro de seige :");
       num = new JTextField (10);
        BRes = new JButton ("réservation");
        jcomp4 = new JLabel ("nom du client :");
       nom = new JTextField (10);
      BAnn = new JButton ("annulation");
        jcomp7 = new JLabel (" téléphone :");
       tel = new JTextField (10);
       BRet= new JButton ("retour au theatre");

       
        //adjust size and set layout
        setPreferredSize (new Dimension (459, 212));
        setLayout (null);

        //add components
        add (jcomp2);
        add (num);
        add (BRes);
        add (jcomp4);
        add (nom);
        add (BAnn);
        add (jcomp7);
        add (tel);
        add (BRet);

        //set component bounds (only needed by Absolute Positioning)
        jcomp2.setBounds (55, 30, 115, 20);
        num.setBounds (205, 20, 40, 35);
       BRes.setBounds (325, 25, 125, 25);
        jcomp4.setBounds (55, 85, 95, 15);
        nom.setBounds (160, 80, 140, 25);
        BAnn.setBounds (325, 80, 125, 25);
        jcomp7.setBounds (50, 135, 100, 25);
        tel.setBounds (160, 135, 140, 25);
       BRet.setBounds (325, 135, 130, 25);
    
         
 
      sq = new SQLService(DRIVE,PATH,USER,PASSWORD); 
       ActionButton EA= new  ActionButton (num,nom,tel,sq);
        BRes.addActionListener(EA);
        BAnn.addActionListener(EA);
}
    
}