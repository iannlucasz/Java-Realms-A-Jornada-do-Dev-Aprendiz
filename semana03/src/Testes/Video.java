package Testes;

public class Video {
    private String nome;

    public void play() {
        System.out.println("Play no vídeo: " + getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
