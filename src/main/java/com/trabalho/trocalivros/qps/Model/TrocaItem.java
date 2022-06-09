package com.trabalho.trocalivros.qps.Model;

import com.trabalho.trocalivros.qps.Model.Abstract.ItemTroca;
import java.util.Date;

public class TrocaItem {
    private ItemTroca item1;
    private ItemTroca item2;
    private Date dataTroca;
    private String status;

    public Date getDataTroca() {
        return dataTroca;
    }

    public void setDataTroca(Date dataTroca) {
        this.dataTroca = dataTroca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ItemTroca getItem1() {
        return item1;
    }

    public void setItem1(ItemTroca item1) {
        this.item1 = item1;
    }

    public ItemTroca getItem2() {
        return item2;
    }

    public void setItem2(ItemTroca item2) {
        this.item2 = item2;
    }
}
