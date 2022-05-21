
package framethéatre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


class ActionButton implements ActionListener {
      JTextField num,nom,tel;
    SQLService sq = null; 
    public ActionButton(JTextField TCN,JTextField TN,JTextField TP,SQLService sq)
    {
        num=TCN;
        nom=TN;
       tel=TP;
        this.sq=sq; 
    }
    
    public void actionPerformed(ActionEvent ev){
 AbstractButton B = (JButton)(ev.getSource());
 
    if(B.getText().equals("réservation"))
 {
     
 
   sq.AjouterUnNouveauEtudiant(num.getText(), nom.getText(), tel.getText());
     JOptionPane.showMessageDialog(null,"Ajout avec succeé "," Ajout Client",
             JOptionPane.INFORMATION_MESSAGE); 
    }
    else if(B.getText().equals("annulation")) {
    sq.SupprimerClient(num.getText(), nom.getText(), tel.getText());
     JOptionPane.showMessageDialog(null,"Suppresion avec succé "," Ajout Client",
             JOptionPane.INFORMATION_MESSAGE);
 }
    }
 }

