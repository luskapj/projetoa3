package DAO.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "1234";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "medeixairemboraporfavor";
    
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd+"?serverTimezone=UTC",
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
