package com.trabalho.trocalivros.qps.Controller;

import com.trabalho.trocalivros.qps.Controller.Interface.IUsuarioController;
import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Telefone;
import com.trabalho.trocalivros.qps.Model.Usuario;

public class UsuarioController implements IUsuarioController{

    @Override
    public void CadastrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        Usuario user = new Usuario();
        user.setDataNascimento("10/12/1998");
        user.setEmail("gabriel.lsp1998@gmail.com");
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setCep("35690-000");
        endereco.setCidade("Florestal");
        endereco.setNumero(41);
        endereco.setPais("Brasil");
        endereco.setRua("Rua Nelson de Senna");
        user.setEndereco(endereco);
        user.setId(0);
        user.setLogin("gabriel");
        user.setNome("Gabriel Luis");
        user.setSenha("123");
        Telefone telefone = new Telefone();
        telefone.setDdd(031);
        telefone.setNumero("97152-3336");
        telefone.setPrefixo("+55");
        user.setTelefone(telefone);
        return user;
    }
    
}
