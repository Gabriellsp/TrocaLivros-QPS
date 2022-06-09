package com.trabalho.trocalivros.qps.DataBase;

import com.trabalho.trocalivros.qps.Model.Abstract.ItemTroca;
import java.util.ArrayList;
import java.util.List;

public class ItensData {
    public static List<ItemTroca> itensCadastrados = new ArrayList<ItemTroca>();
    
    public static void AddItem(ItemTroca item) {
        itensCadastrados.add(item);
    }
    
    public static void AtualizarItem(ItemTroca itemEditado) {
        for (int i =0;i<itensCadastrados.size();i++) {
            if(itensCadastrados.get(i).getId() == itemEditado.getId()) 
                itensCadastrados.set(i, itemEditado);
        }
    }
    
    public static void ExcluirItem(ItemTroca item) {
        itensCadastrados.remove(item);
    }
}
