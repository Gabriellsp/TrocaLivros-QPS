package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.ITrocaLivroController;
import com.trabalho.trocalivros.qps.DataBase.TrocasData;
import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;

public class TrocaLivroController implements ITrocaLivroController{

    @Override
    public void CadastrarTroca(TrocaItem troca) {
        TrocasData.AddTroca(troca);
    }

    @Override
    public void UpdateStatusTroca(TrocaItem troca, StatusItemEnum status) {
        TrocasData.UpdateStatusTroca(troca, status);
    }

    @Override
    public List<TrocaItem> GetInteressesDoUsuario(Usuario usuario) {
        return TrocasData.GetInteressesDoUsuario(usuario);
    }

    @Override
    public List<TrocaItem> GetOfertasRecebidaDoUsuario(Usuario usuario) {
        return TrocasData.GetOfertasRecebidaDoUsuario(usuario);
    }

    @Override
    public int GetNovoId() {
        return TrocasData.GetNovoId();
    }
    
    @Override
    public TrocaItem GetTrocaPorId(int id) {
        return TrocasData.GetTrocaPorId(id);
    }
}
