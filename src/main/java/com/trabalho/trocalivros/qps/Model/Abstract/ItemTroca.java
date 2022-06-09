package com.trabalho.trocalivros.qps.Model.Abstract;

public abstract class ItemTroca {
    private int id;
    private String nome;
    private String descricao;
    private boolean aprovado;
    private int idUsuario;
    private boolean disponivel;
    
    public ItemTroca(int id, int idUsuario, String nome, String descricao) {
        this.id = id;
        this.aprovado = false;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.disponivel = false;
        this.descricao = descricao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
