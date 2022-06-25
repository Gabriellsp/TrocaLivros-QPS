package com.trabalho.trocalivros.qps.Model;

import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.Date;

public class TrocaItem {
    private int id;
    private Item itemInteresse;
    private Item itemOfertado;
    private Date dataTroca;
    private StatusItemEnum status;
    
    public TrocaItem(int id, Item itemInteresse, Item itemOfertado){
        this.id = id;
        this.itemInteresse = itemInteresse;
        this.itemOfertado = itemOfertado;
        this.dataTroca = new Date();
        this.status = StatusItemEnum.PENDENTE;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataTroca() {
        return dataTroca;
    }

    public void setDataTroca(Date dataTroca) {
        this.dataTroca = dataTroca;
    }

    public StatusItemEnum getStatus() {
        return status;
    }

    public void setStatus(StatusItemEnum status) {
        this.status = status;
    }

    public Item getItemInteresse() {
        return itemInteresse;
    }

    public void setItemInteresse(Item itemInteresse) {
        this.itemInteresse = itemInteresse;
    }

    public Item getItemOfertado() {
        return itemOfertado;
    }

    public void setItemOfertado(Item itemOfertado) {
        this.itemOfertado = itemOfertado;
    }
}
