package com.trabalho.trocalivros.qps.Model;

public class Livro {
    private int id;
    private String autor;
    private String tipo;
    private String descricao;
    private Editora editora;
    private Endereco enderecoOrigem;
    private boolean disponivel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Endereco getEnderecoOrigem() {
        return enderecoOrigem;
    }

    public void setEnderecoOrigem(Endereco enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
