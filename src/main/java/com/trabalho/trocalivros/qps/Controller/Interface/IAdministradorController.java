package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.Livro;
import java.util.concurrent.atomic.AtomicReference;

public interface IAdministradorController {
    public void AprovarLivro(AtomicReference<Livro> troca, boolean aprovado);
}
