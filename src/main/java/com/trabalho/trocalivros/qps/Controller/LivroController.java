package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.ILivroController;
import com.trabalho.trocalivros.qps.DataBase.ItensData;
import com.trabalho.trocalivros.qps.Model.Livro;

public class LivroController implements ILivroController{

    @Override
    public void CadastrarLivro(Livro livro) {
        ItensData.AddItem(livro);
    }

    @Override
    public void EditarLivro(Livro livro) {
        ItensData.AtualizarItem(livro);
    }

    @Override
    public void ExcluirLivro(Livro livro) {
        ItensData.ExcluirItem(livro);
    }
    
}
