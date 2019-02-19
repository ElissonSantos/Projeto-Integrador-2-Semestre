package br.com.ConexaoBanco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dadosCliente {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String nomeClientes="Ainda não", telefone="(41) 99175-1277", enderecoClient="sda", email="sdaad", dataDeNascimento="28/11/1997", areaCaso="Familia", processo="1515", retorno="1212";

    public dadosCliente() {
    }

    public dadosCliente(String telefone, String enderecoClient, String email, String dataDeNascimento, String areaCaso, String processo, String retorno) {
        this.telefone = telefone;
        this.enderecoClient = enderecoClient;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.areaCaso = areaCaso;
        this.processo = processo;
        this.retorno = retorno;
    }

    public PreparedStatement getStmt() {
        return stmt;
    }

    public void setStmt(PreparedStatement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getNomeClientes() {
        return nomeClientes;
    }

    public void setNomeClientes(String nomeClientes) {
        this.nomeClientes = nomeClientes;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderecoClient() {
        return enderecoClient;
    }

    public void setEnderecoClient(String enderecoClient) {
        this.enderecoClient = enderecoClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getAreaCaso() {
        return areaCaso;
    }

    public void setAreaCaso(String areaCaso) {
        this.areaCaso = areaCaso;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
    
    
    
}
