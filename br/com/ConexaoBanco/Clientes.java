package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Clientes extends ConexaoMySQL {
    
    Connection conn = getConexaoMySQL();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    ArrayList<Clientes> clientes = new ArrayList<>();
    
    int tamCli = clientes.size();
    int contador = 0;
}
