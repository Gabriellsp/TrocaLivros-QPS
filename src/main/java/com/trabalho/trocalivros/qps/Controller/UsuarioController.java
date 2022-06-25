package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.IUsuarioController;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Usuario;

public class UsuarioController implements IUsuarioController{

    @Override
    public void CadastrarUsuario(Usuario usuario) {
        UsuariosData.AddUsuario(usuario);
    }

    @Override
    public void EditarUsuario(Usuario usuarioEditado) {
        UsuariosData.EditarUsuario(usuarioEditado);
    }

    @Override
    public void ExcluirUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario GetUsuario(String login, String senha) {
        return UsuariosData.GetUsuario(login, senha);
    }
    
    @Override
    public int GetNovoId() {
        return UsuariosData.GetNovoId();
    }
}
