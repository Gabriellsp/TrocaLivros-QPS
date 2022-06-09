package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.ILoginController;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Usuario;

public class LoginController implements ILoginController{

    @Override
    public Usuario login(String login, String senha) {
        return UsuariosData.GetUsuario(login, senha);
    }
    
}
