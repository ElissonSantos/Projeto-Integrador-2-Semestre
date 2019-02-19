package br.com.ConexaoBanco;                   
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMySQL {
 
    public static String status = "Não conectou...";

    public ConexaoMySQL() {
    }
    
//Método de Conexão//
    public static java.sql.Connection getConexaoMySQL() {
    Connection connection = null;
    //atributo do tipo Connection
    try {
    // Carregando o JDBC Driver padrão
    String driverName = "com.mysql.jdbc.Driver";                        
    Class.forName(driverName);
    // Configurando a nossa conexão com um banco de dados//
    String serverName = "localhost";    //caminho do servidor do BD
    String mydatabase = "emsadv";        //nome do seu banco de dados
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String usuario = "root";
    String senha = "123456";
    connection = DriverManager.getConnection(url, usuario, senha);
    //Testa sua conexão//  
    if (connection != null) {
    status = ("STATUS--->Conectado com sucesso!");
    } else {
    status = ("STATUS--->Não foi possivel realizar conexão");
    }
    String sql = "SELECT * FROM emsadv.clientes;";
    //Prepara a instrução SQL
    PreparedStatement ps = connection.prepareStatement(sql);
    //Executa a instrução SQL
    ps.execute();
    return connection;
    } catch (ClassNotFoundException e) {  //Driver não encontrado
    System.out.println("O driver expecificado nao foi encontrado.");
    return null;
    } catch (SQLException e) {
    //Não conseguindo se conectar ao banco
    System.out.println("Nao foi possivel conectar ao Banco de Dados.");
    return null;
    }
    
}
 
    //Método que retorna o status da sua conexão//
    public static String statusConection() {
        return status;
    }

   //Método que fecha sua conexão//
    public static boolean FecharConexao() {
        try {
            ConexaoMySQL.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

   //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return ConexaoMySQL.getConexaoMySQL();
    }
    
    // Confere Login
    public static boolean actionLogin(String digLogin, String digSenha) throws SQLException {
        boolean retorno = false;
        Connection conn = getConexaoMySQL();
    
        String query = "SELECT nome_Funcionario FROM emsadv.funcionarios WHERE login = " + digLogin + " AND senha = " + digSenha + ";";
        PreparedStatement inserir = conn.prepareStatement(query);
        int result = inserir.executeUpdate();

        if(result > 0){
            retorno = true;
        }

        return retorno;
        
    }
    
}