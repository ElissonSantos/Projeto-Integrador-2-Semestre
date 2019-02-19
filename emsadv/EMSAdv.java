package emsadv;

import br.com.ConexaoBanco.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import view.TelaLogin;

public class EMSAdv extends br.com.ConexaoBanco.ConexaoMySQL {

    public static void main(String[] args) throws SQLException {
        
        Scanner scn = new Scanner(System.in);
        Connection conn = ConexaoMySQL.getConexaoMySQL();
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        
    }
}
