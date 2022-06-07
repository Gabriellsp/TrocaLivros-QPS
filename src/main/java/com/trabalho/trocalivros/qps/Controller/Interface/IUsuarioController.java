package com.trabalho.trocalivros.qps.Controller.Interface;

import com.trabalho.trocalivros.qps.Model.Usuario;

public interface IUsuarioController {
    public Usuario GetUsuario(String login, String senha);
    public void CadastrarUsuario(Usuario usuario);
    public void EditarUsuario(Usuario usuario);
    public void ExcluirUsuario(Usuario usuario);
}
