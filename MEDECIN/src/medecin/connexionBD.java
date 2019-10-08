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
/*je l ai cree pour la configuration de la cnx entre bd et netbeans il faut
indiquer au prgrm java qui est le pilote enfin un lien avec le pilote 
https://www.youtube.com/watch?v=w-SoX1kaAIs
*/



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class connexionBD {
    String urlPilote="com.mysql.jdbc.Driver";//jebtha mla libraries
    String urlBase="jdbc:mysql://localhost:3306/ACOO";
    Connection con;
     
    
    public connexionBD(){//constructeur
     
     
     try {
         
         Class.forName(urlPilote); //chargement de pilote
         System.out.println("Chargement pilote reussi");
          }
     catch(ClassNotFoundException ex){
         System.out.println(ex);
                                     }
     
    
     try {  
      con=DriverManager.getConnection(urlBase,"root","");//chargement de la base
         System.out.println("Chargement base reussi");
            }
     catch(SQLException ex){
         System.out.println(ex);
                                      }
     }
    
    
    Connection getconnexionBD(){//methode qui fait appel a la connection
    return con;
    
    
}
    
    

}
