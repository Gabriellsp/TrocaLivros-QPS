package com.trabalho.trocalivros.qps.DataBase;

import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.ArrayList;
import java.util.List;

public class TrocasData {
    public static List<TrocaItem> trocasCadastradas = new ArrayList<TrocaItem>();
    
    public static void UpdateStatusTroca(TrocaItem trocaUpdated, StatusItemEnum status) {
        for(TrocaItem troca: trocasCadastradas){
            if(troca.getId() == trocaUpdated.getId()){
                troca.setStatus(status);
                troca.getItemInteresse().setDisponivel(false);
                troca.getItemOfertado().setDisponivel(false);
                break;
            }
        }
    }
    
    public static int GetNovoId() {
        return trocasCadastradas.size();
    }
    
    public static void AddTroca(TrocaItem troca) {
        trocasCadastradas.add(troca);
    }
    
    public static List<TrocaItem> GetInteressesDoUsuario(Usuario usuario) {
        List<TrocaItem> listaInteresses = new ArrayList<TrocaItem>();
        for(TrocaItem troca : trocasCadastradas) {
            if(troca.getItemOfertado().getIdUsuario() == usuario.getId()){
                listaInteresses.add(troca);
            }
        }
        return listaInteresses;
    }
    
    public static List<TrocaItem> GetOfertasRecebidaDoUsuario(Usuario usuario) {
        List<TrocaItem> listaOfertasRecebidas = new ArrayList<TrocaItem>();
        for(TrocaItem troca : trocasCadastradas) {
            if(troca.getItemInteresse().getIdUsuario() == usuario.getId() && troca.getStatus() == StatusItemEnum.PENDENTE){
                listaOfertasRecebidas.add(troca);
            }
        }
        return listaOfertasRecebidas;
    }
    
    public static TrocaItem GetTrocaPorId(int id) {
        for(TrocaItem troca: trocasCadastradas){
            if(troca.getId() == id) 
                return troca;
        }
        return null;
    }
    
    
}
