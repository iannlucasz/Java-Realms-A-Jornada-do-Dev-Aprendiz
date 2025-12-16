import javax.swing.*;

public class Gerente extends Funcionarios {

    import javax.swing.*;

    public class Gerente extends Funcionarios {
        private String nome;
        private String area;
        private int idade;
        private int numIdentificacao;


        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public void setNome(String nome) {
            nome = JOptionPane.showInputDialog(null,"Informe o nome do Gerente");
            this.nome = nome;

        }

        @Override
        public String getArea() {
            return area;
        }

        @Override
        public void setArea(String area) {
            area = JOptionPane.showInputDialog(null,"Informe a área de atuação do gerente " + getNome());
            this.area = area;
        }

        @Override
        public int getIdade() {
            return idade;

        }

        @Override
        public void setIdade(int idade) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do gerente " + getIdade()));
            this.idade = idade;
        }

        @Override
        public int getNumIndentificacao() {
            return numIdentificacao;
        }

        @Override
        public void setNumIndentificacao(int numIndentificacao) {
            numIndentificacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de identificação do gerente " + getNome()));
            this.numIdentificacao = numIndentificacao;
        }
    }

}

