
package framethéatre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SQLService {
    public Connection con;
    boolean state;
    // connexion aa la base 
    public SQLService(String driver, String path, String user, String password){
     String Msgs=""; 
     Statement stmt; 
     System.out.println("-> Chargement du driver..."); 
        try { 
           Class.forName(driver).newInstance(); 
           System.out.println("* Driver OK *"); 
             } 
        catch (Exception e) { 
            JOptionPane.showMessageDialog(null,"ERREUR: Chargement impossible" + e,"ERROR",JOptionPane.ERROR_MESSAGE); 
                             } 
            System.out.println("-> Connexion a la base..."); 
        try { 
            con = DriverManager.getConnection(path, user, password); 
            stmt = con.createStatement();
        
            System.out.println("* Connexion OK *"); 
            state=true; 
            stmt.close(); 
           } 
        catch(SQLException e) { 
            JOptionPane.showMessageDialog(null,"ERREUR: Connexion impossible.","Erreur",JOptionPane.ERROR_MESSAGE);
     while (e != null) { 
     Msgs=e.getMessage(); 
       System.out.println("Etat: " + e.getSQLState() + "\n"); 
       System.out.println("Code Erreur: " + e.getErrorCode()); 
        e = e.getNextException(); 
 } 
            JOptionPane.showMessageDialog(null,Msgs,"Erreur",JOptionPane.ERROR_MESSAGE); 
     }
    }
    // execution de la connextion  
    public boolean estConnecte(){
        boolean connecter = false;
        if(  state == true)
            connecter = true;
        return connecter;
    }
    public void close() {
        try{
            con.close();
        } 
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"SQLException:"+e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE );
        }
    }
    // methode ajoutEtudiant
    public void AjouterUnNouveauEtudiant(String num, String nom, String tel){
        try{
            String R="INSERT INTO CLIENT (NUM,NOM,TEL) VALUES (?,?,?) ";
            PreparedStatement requete = con.prepareStatement(R);
            requete.setString(1, num);
            requete.setString(2,nom);
            requete.setString(3, tel);
            requete.executeUpdate();
            requete.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"SQLException:"+e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE );
        }
    }
    public void SupprimerClient (String num, String nom, String tel){
        try{
            String R="DELETE FROM CLIENT WHERE NUM=NUM";
            PreparedStatement requete = con.prepareStatement(R);
            requete.executeUpdate();
            requete.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"SQLException:"+e.getMessage(),"Client non supprimer",JOptionPane.ERROR_MESSAGE );
        }
    }

    void SupprimerClient(JTextField num, JTextField nom, JTextField tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
