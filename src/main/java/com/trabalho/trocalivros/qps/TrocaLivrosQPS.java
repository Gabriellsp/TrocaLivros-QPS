package com.trabalho.trocalivros.qps;


import com.trabalho.trocalivros.qps.Controller.UsuarioController;
import com.trabalho.trocalivros.qps.DataBase.ItensData;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Administrador;
import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Model.Telefone;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.View.Login.Login;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class TrocaLivrosQPS extends JFrame {
    public TrocaLivrosQPS() {
        initUI();
    }
    private void initUI() {
        initDataBase();
        UsuarioController usuarioController = new UsuarioController();
        Login login = new Login(usuarioController);
        add(login);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new TrocaLivrosQPS();
            ex.setVisible(true);
        });
    }

    private void initDataBase() {
        initUsuariosData();
        initTrocasData();
        initItensData();
        
    }

    private void initUsuariosData() {
        Endereco endereco = new Endereco("Rua Adm", 01, "Bairro Adm", "Cidade Adm", "123123", "Brasil");
        Telefone telefone = new Telefone("123123-123123",031, "+55");
        Administrador usuarioAdm = new Administrador(0, "adm", "adm", "Gabriel Luis", 
            endereco, "10/12/1998", "gabriel@gmail.com", telefone);
        UsuariosData.AddUsuario(usuarioAdm);
        
        Endereco endereco2 = new Endereco("Rua User", 41, "Bairro User", "Cidade User", "123123", "Brasil");
        Telefone telefone2 = new Telefone("123123-123123",031, "+55");
        Usuario usuario = new Usuario(1, "user", "user", "Gabriel Luis", 
            endereco2, "10/12/1998", "gabriel@gmail.com", telefone2);
        UsuariosData.AddUsuario(usuario);
    }

    private void initTrocasData() {
        
    }

    private void initItensData() {
        Livro livro = new Livro(0, 1, "Harry Potter", "J.K.ROLLING", 2002, "Ficção",
                "Este livro conta sobre a história de um bruxo chamado Harry Potter", "Intrinsica");
        Livro livro2 = new Livro(1, 1, "Livro 2", "Autor 2", 2002, "Ficção",
                "Descrição livro 2", "editora livro 2");
        ItensData.AddItem(livro);
        ItensData.AddItem(livro2);
    }

  
}
