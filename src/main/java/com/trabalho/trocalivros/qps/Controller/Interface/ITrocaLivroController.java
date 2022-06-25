package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;

public interface ITrocaLivroController {
    public void CadastrarTroca(TrocaItem troca);
    public void UpdateStatusTroca(TrocaItem troca, StatusItemEnum status);
    public List<TrocaItem> GetInteressesDoUsuario(Usuario usuario);
    public List<TrocaItem> GetOfertasRecebidaDoUsuario(Usuario usuario);
    public int GetNovoId();
    public TrocaItem GetTrocaPorId(int id);
}
