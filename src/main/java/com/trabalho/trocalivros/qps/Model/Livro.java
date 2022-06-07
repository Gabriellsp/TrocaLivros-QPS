package com.trabalho.trocalivros.qps.Model;

public class Livro {
    private int id;
    private boolean aprovado;
    private int idUsuario;
    private String nome;
    private String autor;
    private int ano;
    private String tipo;
    private String descricao;
    private String editora;
    private boolean disponivel;
    
    public Livro(int id, int idUsuario, String nome, String autor, int ano, String tipo, String descricao, String editora){
        this.id = id;
        this.aprovado = false;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.tipo = tipo;
        this.descricao = descricao;
        this.editora = editora;
        this.disponivel = true;
    }
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
