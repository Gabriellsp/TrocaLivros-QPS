package com.trabalho.trocalivros.qps.Model;

public class Administrador extends Usuario {
    public Administrador(int id, String login, String senha, String nome, 
            Endereco endereco, String dataNascimento, String email, Telefone telefone){
        super(id, login, senha, nome, 
            endereco, dataNascimento, email, telefone);
    }
}
