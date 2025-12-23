package Testes;

import javax.swing.*;

public class Testar {
    public static void main (String[] args) {
        Armazenavel dado1 = new ArquivoStorage();
        Armazenavel dado2 = new BancoStorage();

        dado1.salvar(JOptionPane.showInputDialog(null,"Informe o dado que deseja salvar em ARQUIVO."));
        dado2.salvar(JOptionPane.showInputDialog(null, "Informe o dado que deseja salvar no BANCO DE DADOS."));

    }
}
