package com.trabalho.trocalivros.qps;


import com.trabalho.trocalivros.qps.View.Login.Login;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class TrocaLivrosQPS extends JFrame {
    public TrocaLivrosQPS() {
        initUI();
    }
    private void initUI() {
        Login login = new Login();
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

  
}
