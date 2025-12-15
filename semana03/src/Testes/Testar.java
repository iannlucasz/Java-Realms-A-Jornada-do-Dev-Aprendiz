package Testes;

import javax.swing.*;

public class Testar {
    public static void main(String[] args) {
        // Método do Polimorfismo ( Overriding )
        Video video = new Video();

        video.setNome(JOptionPane.showInputDialog(null, "Informe o nome do vídeo"));
        video.play();

        Filme filme = new Filme();

        filme.setNome(JOptionPane.showInputDialog(null,"Informe o nome do filme"));

        // Método do Polimorfismo ( Overloading )
        filme.play("Inglês" , "Inglês");


    }
}
