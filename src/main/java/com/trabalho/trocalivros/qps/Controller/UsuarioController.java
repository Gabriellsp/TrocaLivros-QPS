package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.IUsuarioController;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Telefone;
import com.trabalho.trocalivros.qps.Model.Usuario;

public class UsuarioController implements IUsuarioController{

    @Override
    public void CadastrarUsuario(Usuario usuario) {
        UsuariosData.AddUsuario(usuario);
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void EditarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ExcluirUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario GetUsuario(String login, String senha) {
        
//        Endereco endereco = new Endereco("Rua Nelson", 41, "Bairro", "BH", "123123", "Brasil");
//        Telefone telefone = new Telefone("123123-123123",031, "+55");
//        Usuario user = new Usuario(0, "gabriel", "123", "Gabriel Luis", 
//            endereco, "10/12/1998", "gabriel@gmail.com", telefone);
        return UsuariosData.GetUsuario(login, senha);
    }
    
}
