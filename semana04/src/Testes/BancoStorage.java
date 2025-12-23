package Testes;

import javax.swing.*;

public class BancoStorage implements Armazenavel {
    @Override
    public void salvar(String dado) {
        JOptionPane.showMessageDialog(null,"Salvando no banco de dados: " + dado);
    }
}
