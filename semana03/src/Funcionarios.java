public class Funcionarios {
    private static int contadorId = 1;

    protected String nome;
    protected String area;
    protected int idade;
    protected int numIndentificacao = contadorId++;


    public Funcionarios(String nome, String area, int idade, int numIndentificacao) {
        this.nome = nome;
        this.area = area;
        this.idade = idade;
        this.numIndentificacao = numIndentificacao;
    }

    public Funcionarios() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumIndentificacao() {
        return numIndentificacao;
    }

    public void setNumIndentificacao(int numIndentificacao) {
        this.numIndentificacao = numIndentificacao;
    }
}
