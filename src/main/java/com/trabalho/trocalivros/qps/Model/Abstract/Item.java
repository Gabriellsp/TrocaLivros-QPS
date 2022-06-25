package com.trabalho.trocalivros.qps.Model.Abstract;

import com.trabalho.trocalivros.qps.Util.StatusItemEnum;

public abstract class Item {
    private int id;
    private String nome;
    private String descricao;
    private StatusItemEnum status;
    private int idUsuario;
    private boolean disponivel;
    
    public Item(int id, int idUsuario, String nome, String descricao) {
        this.id = id;
        this.status = StatusItemEnum.PENDENTE;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.disponivel = true;
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

    public StatusItemEnum getStatus() {
        return status;
    }

    public void setStatus(StatusItemEnum status) {
        this.status = status;
    }
}
