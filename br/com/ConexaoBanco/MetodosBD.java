package br.com.ConexaoBanco;

import static br.com.ConexaoBanco.ConexaoMySQL.getConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MetodosBD {

    public boolean cadastraCliente(String nomeCliente, String telefone, String endereco, String email, String dataNascimento) throws SQLException {
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
        String query = "SELECT * from `emsadv`.`clientes` where nomeCliente = '" + nomeCliente + "' AND telefone = '" + telefone + "';";
        PreparedStatement inserir = conn.prepareStatement(query);
        ResultSet rs;
        rs = inserir.executeQuery();
        if (rs.next()) {  
            JOptionPane.showMessageDialog(null, "Já existe este cliente."); 
        } else { 
            query = "INSERT INTO `emsadv`.`clientes` (`NomeCliente`, `telefone`, `enderecoClient`, `email`, `dataDeNascimento`) VALUES ('" + nomeCliente + "', '" + telefone + "', '" + endereco + "', '" + email + "', '" + dataNascimento + "');";
            inserir = conn.prepareStatement(query);
            int result = inserir.executeUpdate();
            if(result > 0){
                retorno = true;
            }
        }
        
        return retorno;
    }

    public boolean cadastrarCaso(String areaCaso, String numProcesso, String retornoDig) throws SQLException {
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
        String query = "SELECT * from `emsadv`.`casos` where areaCaso = '" + areaCaso + "' AND processo = '" + numProcesso + "';";
        PreparedStatement inserir = conn.prepareStatement(query);
        ResultSet rs;
        rs = inserir.executeQuery();
        if (rs.next()) {  
            JOptionPane.showMessageDialog(null, "Já existe este caso.");
        } else { 
            query = "INSERT INTO `emsadv`.`casos` (`areaCaso`, `processo`, `retorno`) VALUES ('" + areaCaso + "', '" + numProcesso + "', '" + retornoDig + "');";
            inserir = conn.prepareStatement(query);
            int result = inserir.executeUpdate();
            if(result > 0){
                retorno = true;
            }
        }
            
        return retorno;
    }
    
    // Metodo que insere no Banco de Dados
    public static boolean InsereBanco(String nome, int telefone) throws SQLException {
        
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
    
        String query = "INSERT INTO `emsadv`.`clientes` (`NomeCliente`, `telefone`) VALUES (\"" + nome + "\", " + telefone + ");";
        PreparedStatement inserir = conn.prepareStatement(query);
        int result = inserir.executeUpdate();

        if(result > 0){
            retorno = true;
        }

        return retorno;

    }

    // Metodo que modifica o Banco de Dados
    public static boolean modificaBanco(String mudanca, String nome, int telefone) throws SQLException {
        
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
    
        String query = "UPDATE `emsadv`.`clientes` SET nomeCliente = (\"" + nome + "\") AND telefone = (" + telefone + ") WHERE nomeCliente = (\"" + mudanca + "\");";
        PreparedStatement mudifica = conn.prepareStatement(query);
        

        return retorno;

    }

    // Metodo que deleta do Banco de Dados
    public static boolean deletaBanco(String nome, int telefone) throws SQLException {
        
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
    
        String query = "INSERT INTO `emsadv`.`clientes` (`NomeCliente`, `telefone`) VALUES (\"" + nome + "\", " + telefone + ");";
        PreparedStatement inserir = conn.prepareStatement(query);
        int result = inserir.executeUpdate();

        if(result > 0){
            retorno = true;
        }

        return retorno;

    }
}
