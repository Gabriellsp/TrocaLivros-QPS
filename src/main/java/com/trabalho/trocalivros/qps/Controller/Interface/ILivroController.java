package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.Livro;

public interface ILivroController {
    public void CadastrarLivro(Livro livro);
    public void EditarLivro(Livro livro);
    public void ExcluirLivro(Livro livro);
}
