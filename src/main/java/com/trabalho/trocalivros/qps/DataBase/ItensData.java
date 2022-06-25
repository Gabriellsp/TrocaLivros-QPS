package com.trabalho.trocalivros.qps.DataBase;

import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.ArrayList;
import java.util.List;

public class ItensData {
    public static List<Item> itensCadastrados = new ArrayList<Item>();
    
    public static void AddItem(Item item) {
        itensCadastrados.add(item);
    }
    
    public static void AtualizarItem(Item itemEditado) {
        for (int i =0;i<itensCadastrados.size();i++) {
            if(itensCadastrados.get(i).getId() == itemEditado.getId()){
                itensCadastrados.set(i, itemEditado);
            }
        }
    }
    
    public static void ExcluirItem(Item item) {
        itensCadastrados.remove(item);
    }
    
    public static List<Item> PesquisarItemDisponiveis(String nomeItem) {
        List<Item> resultadoPesquisa = new ArrayList<Item>();
        for(Item item : itensCadastrados){
            if((item.getNome().toLowerCase().contains(nomeItem.toLowerCase())||item.getDescricao().toLowerCase().contains(nomeItem.toLowerCase())) && item.isDisponivel() && item.getStatus()==StatusItemEnum.APROVADO){
                resultadoPesquisa.add(item);
            }
        }
        return resultadoPesquisa;
    }
    
    public static Item GetItemPeloId(int id) {
        for(Item item : itensCadastrados){
            if(item.getId() == id)
                return item;
        }
        return null;
    }

    public static List<Item> GetItensDisponiveisParaTroca(int idUsuario) {
        List<Item> listaItensDisponiveis = new ArrayList<Item>();
        for(Item item : itensCadastrados){
            if(item.getIdUsuario()!= idUsuario && item.isDisponivel() && item.getStatus()==StatusItemEnum.APROVADO){
                listaItensDisponiveis.add(item);
            }
        }
        return listaItensDisponiveis;
    }

//    public static void AtualizarAprovado(int idItem, boolean aprovado) {
//        for (int i =0;i<itensCadastrados.size();i++) {
//            if(itensCadastrados.get(i).getId() == idItem){
//                itensCadastrados.get(i).setAprovado(aprovado);
//            }
//        }
//    }
    
    public static int GetNovoId() {
        return itensCadastrados.size();
    }

    public static List<Item> GetItensParaAprovar() {
        List<Item> listaItensParaAprovar = new ArrayList<Item>();
        for (Item item : itensCadastrados) {
            if(item.getStatus() == StatusItemEnum.PENDENTE){
                listaItensParaAprovar.add(item);
            }
        }
        return listaItensParaAprovar;
    }

    public static void UpdateStatusItem(int idItem, StatusItemEnum status) {
        for (Item item : itensCadastrados) {
            if(item.getId()== idItem){
                item.setStatus(status);
            }
        }
    }
    
    public static List<Item> GetItensDisponiveisDoUsuario(int idUsuario) {
        List<Item> itensDisponiveisDoUsuario = new ArrayList<Item>();

        for(Item item : itensCadastrados){
            if(item.getIdUsuario() == idUsuario && item.isDisponivel() && item.getStatus()==StatusItemEnum.APROVADO){
                itensDisponiveisDoUsuario.add(item);
            }
        }
        return itensDisponiveisDoUsuario;
    }

    public static List<Item> GetTodosItensUsuario(int idUsuario) {
        List<Item> itensDoUsuario = new ArrayList<>();

        for(Item item : itensCadastrados){
            if(item.getIdUsuario() == idUsuario){
                itensDoUsuario.add(item);
            }
        }
        return itensDoUsuario;
    }
}
