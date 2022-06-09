package com.trabalho.trocalivros.qps.Model.Abstract;

import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Telefone;

public abstract class Pessoa {
    private String nome;
    private Endereco endereco;
    private String dataNascimento;
    private String email;
    private Telefone telefone;
    
    public Pessoa(String nome, 
            Endereco endereco, String dataNascimento, String email, Telefone telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
}
