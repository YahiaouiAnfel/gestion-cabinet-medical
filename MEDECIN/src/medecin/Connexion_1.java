/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medecin;

/**
 *
 * @author Lenovo
 */
import java.sql.*;

/**
 *
 * @author MCS
 */
public class Connexion_1{
   String urlPilote="com.mysql.jdbc.Driver";
   String urlBD="jdbc:mysql://localhost:3306/gestioncab";
   Connection con;
    public Connexion_1 (){
      try {
            Class.forName(urlPilote);
            System.out.println ("chargement du pilote réussie");
        }
      catch(ClassNotFoundException ex){
            System.out.println (ex);
        }
      try{
            con=DriverManager.getConnection(urlBD,"root","");
            System.out.println ("connexion a la BD réussie");
        }
      catch(SQLException ex){
            System.out.println (ex);
       }
    }
    Connection Obtenirconnexion(){
       return con;
    }

    ResultSet querySelecteAll(String medicament, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

