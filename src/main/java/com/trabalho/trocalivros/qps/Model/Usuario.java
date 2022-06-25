package com.trabalho.trocalivros.qps.Model;

import com.trabalho.trocalivros.qps.Model.Abstract.Pessoa;

public class Usuario extends Pessoa{
    private int id;
    private String login;
    private String senha;
    private boolean isAdm;
    
    public Usuario(int id,boolean isAdm, String login, String senha, String nome, 
            Endereco endereco, String dataNascimento, String email, Telefone telefone){
        super(nome, endereco, dataNascimento, email, telefone);
        this.id = id;
        this.isAdm = isAdm;
        this.login= login;
        this.senha = senha;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isIsAdm() {
        return isAdm;
    }

    public void setIsAdm(boolean isAdm) {
        this.isAdm = isAdm;
    }
}
