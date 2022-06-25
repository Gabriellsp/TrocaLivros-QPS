package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;

public interface ILivroController {
    public void UpdateStatusItem(int idItem, StatusItemEnum status);
    public void CadastrarItem(Item item);
    public void EditarItem(Item item);
    public void ExcluirItem(Item item);
    public List<Item> PesquisarItemDisponiveis(String nomeItem);
    public Item GetItemPorId(int id);
    public List<Item> GetItensDisponiveisParaTroca(int idUsuario);
    public List<Item> GetItensDisponiveisDoUsuario(int idUsuario);
    public List<Item> GetTodosItensDoUsuario(int idUsuario);
    public int GetNovoId();
    public List<Item> GetItensParaAprovar();
    
}
