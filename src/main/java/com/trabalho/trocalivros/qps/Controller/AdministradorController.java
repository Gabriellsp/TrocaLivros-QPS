package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.IAdministradorController;
import com.trabalho.trocalivros.qps.Model.Livro;
import java.util.concurrent.atomic.AtomicReference;

public class AdministradorController implements IAdministradorController{

    @Override
    public void AprovarLivro(AtomicReference<Livro> livro, boolean aprovado) {
//        livro.get().setAprovado(aprovado);
    }
    
}
