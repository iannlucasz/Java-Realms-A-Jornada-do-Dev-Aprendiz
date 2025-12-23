package Testes;

import javax.swing.*;

public class ArquivoStorage implements Armazenavel{
    @Override
    public void salvar(String dado) {
        JOptionPane.showMessageDialog(null,"Salvando em arquivo: " + dado );
    }
}
