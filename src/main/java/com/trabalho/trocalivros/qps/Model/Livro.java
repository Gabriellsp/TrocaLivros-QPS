package com.trabalho.trocalivros.qps.Model;

import com.trabalho.trocalivros.qps.Model.Abstract.Item;

public class Livro extends Item{
    private String autor;
    private int ano;
    private String tipo;
    private String editora;
    
    public Livro(int id, int idUsuario, String nome, String autor, int ano, String tipo, String descricao, String editora){
        super( id, idUsuario, nome, descricao);
        this.autor = autor;
        this.ano = ano;
        this.tipo = tipo;
        this.editora = editora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
