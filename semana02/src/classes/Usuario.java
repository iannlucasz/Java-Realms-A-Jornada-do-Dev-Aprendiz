package classes;

public class Usuario {
    private String nome;
    private int idade;
    private String cpf;

    public Usuario(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
    }



    // Getters e setters.
        // Nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // Idade
        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            if (idade < 13) {
                throw new IllegalArgumentException("Você deve possuir 13+ anos de idade");
            }
            this.idade = idade;
        }

        // CPF
        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }


}

