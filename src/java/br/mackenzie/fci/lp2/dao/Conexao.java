
package br.mackenzie.fci.lp2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author 41381467
 */
public class Conexao {
    
    private static Conexao conexao;
    private static ResourceBundle bundle;
    
    private Conexao(){
    }

    public static Conexao getInstance() {
        if(conexao == null){
            conexao = new Conexao();
        }
        return conexao;
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");

    return DriverManager.getConnection("jdbc:derby://localhost:1527/Perfumaria", "app", "app");
        
    }

    public static void setConexao(Conexao conexao) {
        Conexao.conexao = conexao;
    }
}
