package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.Usuario;

public interface IUsuarioController {
    public Usuario GetUsuario(String login, String senha);
    public void CadastrarUsuario(Usuario usuario);
    public void EditarUsuario(Usuario usuarioEditado);
    public void ExcluirUsuario(Usuario usuario);
    public int GetNovoId();
}
