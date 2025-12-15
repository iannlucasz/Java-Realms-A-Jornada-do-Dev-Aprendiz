package Testes;

import javax.swing.*;

public class Filme extends Video{
    private String nome;
    private String legendaIdioma;
    private String audioIdioma;

    @Override
    public void play() {
        System.out.println("Play no Filme: " + getNome());
    }

    public void play(String legendaIdioma , String audioIdioma) {
        JOptionPane.showMessageDialog(null,toString());
        this.legendaIdioma = legendaIdioma;
        this.audioIdioma = audioIdioma;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Filme: %s | Legenda: %s | Audio: %s" , getNome() , legendaIdioma , audioIdioma);
    }
}
