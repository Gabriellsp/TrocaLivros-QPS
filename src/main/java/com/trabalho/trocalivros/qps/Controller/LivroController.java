package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.ILivroController;
import com.trabalho.trocalivros.qps.DataBase.ItensData;
import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;

public class LivroController implements ILivroController{

    @Override
    public void UpdateStatusItem(int idItem, StatusItemEnum status){
        ItensData.UpdateStatusItem(idItem, status);
    }
    
    @Override
    public void CadastrarItem(Item item) {
        ItensData.AddItem(item);
    }

    @Override
    public void EditarItem(Item item) {
        ItensData.AtualizarItem(item);
    }

    @Override
    public void ExcluirItem(Item item) {
        ItensData.ExcluirItem(item);
    }

    @Override
    public List<Item> PesquisarItemDisponiveis(String nomeItem) {
        return ItensData.PesquisarItemDisponiveis(nomeItem);
    }

    @Override
    public Item GetItemPorId(int id) {
        return ItensData.GetItemPeloId(id);
    }

    @Override
    public List<Item> GetItensDisponiveisParaTroca(int idUsuario) {
        return ItensData.GetItensDisponiveisParaTroca(idUsuario);
    }
    
    @Override
    public List<Item> GetItensDisponiveisDoUsuario(int idUsuario) {
        return ItensData.GetItensDisponiveisDoUsuario(idUsuario);
    }
    
    @Override
    public List<Item> GetTodosItensDoUsuario(int idUsuario) {
        return ItensData.GetTodosItensUsuario(idUsuario);
    }
    
    @Override
    public int GetNovoId() {
        return ItensData.GetNovoId();
    }
    
    @Override
    public List<Item> GetItensParaAprovar() {
        return ItensData.GetItensParaAprovar();
    }
    
}
