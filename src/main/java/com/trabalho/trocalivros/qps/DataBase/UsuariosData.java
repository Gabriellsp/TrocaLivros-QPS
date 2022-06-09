package com.trabalho.trocalivros.qps.DataBase;

import com.trabalho.trocalivros.qps.Model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuariosData {
     public static List<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
     
     public static Usuario GetUsuario(String login, String senha) {
        for(int i = 0; i< usuariosCadastrados.size(); i++) {
            if(usuariosCadastrados.get(i).getLogin().equals(login) && usuariosCadastrados.get(i).getSenha().equals(senha)){
                return usuariosCadastrados.get(i);
            }
        }
        return null;
     }
     
     public static void AddUsuario(Usuario usuario) {
        usuariosCadastrados.add(usuario);
     }
}
