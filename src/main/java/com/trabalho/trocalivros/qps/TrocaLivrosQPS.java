package com.trabalho.trocalivros.qps;


import com.trabalho.trocalivros.qps.Controller.UsuarioController;
import com.trabalho.trocalivros.qps.DataBase.ItensData;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Model.Telefone;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.View.Login.LoginView;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class TrocaLivrosQPS extends JFrame {
    public TrocaLivrosQPS() {
        initUI();
    }
    private void initUI() {
        initDataBase();
        UsuarioController usuarioController = new UsuarioController();
        LoginView login = new LoginView(usuarioController);
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
   
        Usuario usuarioAdm = new Usuario(0, true, "adm", "adm", "Gabriel Luis", 
            endereco, "10/12/1998", "gabriel@gmail.com", telefone);
        UsuariosData.AddUsuario(usuarioAdm);
        
        Endereco endereco2 = new Endereco("Rua User", 41, "Bairro User", "Cidade User", "123123", "Brasil");
        Telefone telefone2 = new Telefone("123123-123123",031, "+55");
        
        Usuario usuario = new Usuario(1, false, "user", "user", "Gabriel Luis", 
            endereco2, "10/12/1998", "gabriel@gmail.com", telefone2);
        UsuariosData.AddUsuario(usuario);
    }

    private void initTrocasData() {
        
    }

    private void initItensData() {
        Livro livroUsuario1 = new Livro(0, 1, "Harry Potter", "J.K.ROLLING", 2002, "Ficção",
                "Este livro conta sobre a história de um bruxo chamado Harry Potter", "Intrinsica");
        Livro livroUsuario2 = new Livro(1, 1, "Livro Usuario", "Autor Usuario", 2002, "Revista",
                "Descrição livro Usuario", "editora livro Usuario");
        Livro livroAdm = new Livro(2,0, "Livro Adm", "Autor Adm", 2002, "Acadêmico",
                "Descrição livro Adm", "editora livro Adm");
        
        ItensData.AddItem(livroUsuario1);
        ItensData.AddItem(livroUsuario2);
        ItensData.AddItem(livroAdm);
        
    }

}
