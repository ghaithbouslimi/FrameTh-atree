
package framethéatre;

import static com.sun.glass.ui.Window.UNTITLED;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FrameThéatre extends JPanel{ 
 private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    private JButton jcomp12;
    private JButton jcomp13;
    private JButton jcomp14;
    private JButton jcomp15;
    private JButton jcomp16;
    private JButton jcomp17;
    private JButton jcomp18;
    private JButton jcomp19;
    private JButton jcomp20;
    private JButton jcomp21;
    private JButton jcomp22;
    private JButton jcomp23;
    private JButton jcomp24;
    private JButton jcomp25;
    private JButton jcomp26;
    private JButton jcomp27;
    private JButton jcomp28;
    private JButton jcomp29;
    private JButton jcomp30;
    private JButton jcomp31;
    private JButton jcomp32;
    private JButton jcomp33;
    private JButton jcomp34;
    private JButton jcomp35;
    private JButton jcomp36;
    private JButton jcomp37;
    private JButton jcomp38;
    private JButton jcomp39;
    private JButton jcomp40;
    private JButton jcomp41;
    private JButton jcomp42;
    private JButton jcomp43;
    private JButton jcomp44;
    private JButton jcomp45;
    private JButton jcomp46;
    private JButton jcomp47;
    private JButton jcomp48;
    private JLabel jcomp49;
    private JMenuBar jcomp50;
    
private JMenuBar menu;
           
           

    public FrameThéatre() {
     //construct preComponents
   JMenu fileMenu = new JMenu ("Fichier"); 
           JMenuItem nouvItem = new JMenuItem ("Nouvelle pièce");
           JMenuItem nouvItem1= new JMenuItem ("Ouvrir");
           JMenuItem nouvItem2= new JMenuItem ("Supprimer piece");
           JMenuItem nouvItem3= new JMenuItem ("Quiter");
    
        //construct components
        jcomp1 = new JButton (" 1");
        
        jcomp2 = new JButton ("2");
        jcomp3 = new JButton ("3");
        jcomp4 = new JButton ("4");
        jcomp5 = new JButton ("5");
        jcomp6 = new JButton ("15");
        jcomp7 = new JButton ("10");
        jcomp8 = new JButton ("7");
        jcomp9 = new JButton ("9");
        jcomp10 = new JButton ("8");
        jcomp11 = new JButton ("12");
        jcomp12 = new JButton ("11");
        jcomp13 = new JButton ("6");
        jcomp14 = new JButton ("13");
        jcomp15 = new JButton ("14");
        jcomp16 = new JButton ("25");
        jcomp17 = new JButton ("19");
        jcomp18 = new JButton ("18");
        jcomp19 = new JButton ("21");
        jcomp20 = new JButton ("16");
        jcomp21 = new JButton ("17");
        jcomp22 = new JButton ("24");
        jcomp23 = new JButton ("23");
        jcomp24 = new JButton ("20");
        jcomp25 = new JButton ("22");
        jcomp26 = new JButton ("29");
        jcomp27 = new JButton ("27");
        jcomp28 = new JButton ("28");
        jcomp29 = new JButton ("30");
        jcomp30 = new JButton ("43");
        jcomp31 = new JButton ("35");
        jcomp32 = new JButton ("33");
        jcomp33 = new JButton ("32");
        jcomp34 = new JButton ("31");
        jcomp35 = new JButton ("36");
        jcomp36 = new JButton ("37");
        jcomp37 = new JButton ("40");
        jcomp38 = new JButton ("34");
        jcomp39 = new JButton ("42");
        jcomp40 = new JButton ("41");
        jcomp41 = new JButton ("39");
        jcomp42 = new JButton ("26");
        jcomp43 = new JButton ("44");
        jcomp44 = new JButton ("45");
        jcomp45 = new JButton ("46");
        jcomp46 = new JButton ("47");
        jcomp47 = new JButton ("48");
        jcomp48 = new JButton ("38");
        jcomp49 = new JLabel ("Théatre ");
        jcomp50 = new JMenuBar();
        

        //adjust size and set layout
        setPreferredSize (new Dimension (936, 600));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        add (jcomp18);
        add (jcomp19);
        add (jcomp20);
        add (jcomp21);
        add (jcomp22);
        add (jcomp23);
        add (jcomp24);
        add (jcomp25);
        add (jcomp26);
        add (jcomp27);
        add (jcomp28);
        add (jcomp29);
        add (jcomp30);
        add (jcomp31);
        add (jcomp32);
        add (jcomp33);
        add (jcomp34);
        add (jcomp35);
        add (jcomp36);
        add (jcomp37);
        add (jcomp38);
        add (jcomp39);
        add (jcomp40);
        add (jcomp41);
        add (jcomp42);
        add (jcomp43);
        add (jcomp44);
        add (jcomp45);
        add (jcomp46);
        add (jcomp47);
        add (jcomp48);
        add (jcomp49);
        add (jcomp50);
        
        fileMenu.add (nouvItem);
        

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (100, 405, 60, 20);
        jcomp2.setBounds (160, 400, 60, 20);
        jcomp3.setBounds (220, 395, 60, 20);
        jcomp4.setBounds (280, 390, 60, 20);
        jcomp5.setBounds (340, 385, 60, 20);
        jcomp6.setBounds (225, 325, 60, 20);
        jcomp7.setBounds (635, 395, 60, 20);
        jcomp8.setBounds (455, 385, 60, 20);
        jcomp9.setBounds (575, 390, 60, 20);
        jcomp10.setBounds (515, 385, 60, 20);
        jcomp11.setBounds (755, 405, 60, 20);
        jcomp12.setBounds (695, 400, 60, 20);
        jcomp13.setBounds (400, 385, 60, 20);
        jcomp14.setBounds (105, 335, 60, 20);
        jcomp15.setBounds (165, 330, 60, 20);
        jcomp16.setBounds (105, 280, 60, 20);
        jcomp17.setBounds (465, 315, 60, 20);
        jcomp18.setBounds (405, 315, 60, 20);
        jcomp19.setBounds (585, 320, 60, 20);
        jcomp20.setBounds (285, 320, 60, 20);
        jcomp21.setBounds (345, 315, 60, 20);
        jcomp22.setBounds (765, 335, 60, 20);
        jcomp23.setBounds (705, 330, 60, 20);
        jcomp24.setBounds (525, 315, 60, 20);
        jcomp25.setBounds (645, 325, 60, 20);
        jcomp26.setBounds (345, 255, 60, 20);
        jcomp27.setBounds (225, 265, 60, 20);
        jcomp28.setBounds (285, 260, 60, 20);
        jcomp29.setBounds (405, 255, 60, 20);
        jcomp30.setBounds (465, 195, 60, 20);
        jcomp31.setBounds (705, 270, 60, 20);
        jcomp32.setBounds (585, 260, 60, 20);
        jcomp33.setBounds (525, 255, 60, 20);
        jcomp34.setBounds (465, 255, 60, 20);
        jcomp35.setBounds (765, 275, 60, 20);
        jcomp36.setBounds (105, 215, 60, 20);
        jcomp37.setBounds (285, 200, 60, 20);
        jcomp38.setBounds (645, 265, 60, 20);
        jcomp39.setBounds (405, 195, 60, 20);
        jcomp40.setBounds (345, 195, 60, 20);
        jcomp41.setBounds (225, 205, 60, 20);
        jcomp42.setBounds (165, 270, 60, 20);
        jcomp43.setBounds (525, 195, 60, 20);
        jcomp44.setBounds (585, 200, 60, 20);
        jcomp45.setBounds (645, 205, 60, 20);
        jcomp46.setBounds (705, 210, 60, 20);
        jcomp47.setBounds (765, 215, 60, 20);
        jcomp48.setBounds (165, 210, 60, 20);
        jcomp49.setBounds (425, 515, 100, 25);
        jcomp50.setBounds (0, 0, 135, 25);
         
        setVisible(true); 
          
        jcomp1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
            {
                FrameClient fc = new FrameClient(); 
                fc.setVisible(true);
            }
        }
                
     
                            }
    


 public static void main(String[] args) {
         JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new FrameThéatre());
        frame.pack();
        frame.setVisible (true);
        SQLService Sql; 
           try {
               // connexion ala base 
           String DRIVE="org.apache.derby.jdbc.ClientDriver";
            String PATH="jdbc:derby://localhost:1527/theatre"; 
            String USER="ghaith2";
            String PASSWORD="95027629";
            Sql= new SQLService (DRIVE, PATH ,USER ,PASSWORD); 
            Sql.close(); 
            JOptionPane.showMessageDialog(null,"Connection avec succeé","test de connexion",JOptionPane.INFORMATION_MESSAGE);}
            catch (Exception e )
                    { return ; }
            if (Sql.estConnecte())
                    { FrameClient test = new FrameClient();
            
        }
    }

   

    
   


    
    

