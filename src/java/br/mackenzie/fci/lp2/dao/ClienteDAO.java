package br.mackenzie.fci.lp2.dao;

import br.mackenzie.fci.lp2.entidades.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

      
    
    public List<Cliente> listar() {
           List<Cliente> clientes = new ArrayList<Cliente>();
           
           try {
               Connection connection = Conexao.getInstance().getConnection();
               Statement st = connection.createStatement();
               String query = "SELECT * FROM ator";
               ResultSet result = st.executeQuery(query);
               
               while (result.next()) {
                   Cliente cliente = new Cliente();
                   cliente.setEndereco(result.getString("endereco"));
                   cliente.setCpf(result.getString("cpf"));
                   cliente.setNome(result.getString("nome"));
                   cliente.setSexo(result.getString("sexo"));
                   cliente.setEmail(result.getString("email"));
                   cliente.setTelefone(result.getString("telefone"));
                   clientes.add(cliente);
               }
        }   catch (ClassNotFoundException ex){
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return clientes;
           }

    
    public void inserir(Cliente cliente) {
        try {
        String query = "INSERT INTO cliente (nome) VALUES (?)";
        Connection connection = Conexao.getInstance().getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.execute();
        connection.close();
    } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void remover(Cliente cliente) {
        try {
            String sql = "DELETE FROM APP.Cliente WHERE NOME = ?";
            Connection connection = Conexao.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.execute();
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
}