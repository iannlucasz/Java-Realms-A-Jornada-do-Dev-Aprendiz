import javax.swing.*;

public class Gerente extends Funcionarios {

    @Override
    public void setNome(String nome) {
        this.nome = JOptionPane.showInputDialog(
                null,
                "Informe o nome do Gerente"
        );
    }

    @Override
    public void setArea(String area) {

        String areaMenu =
                """
                        1 - Geral
                        2 - Vendas
                        3 - RH""";

        int opcaoArea;

        do {
            opcaoArea = Integer.parseInt(
                    JOptionPane.showInputDialog(areaMenu)
            );

            switch (opcaoArea) {
                case 1 -> this.area = "Geral";
                case 2 -> this.area = "Vendas";
                case 3 -> this.area = "RH";
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcaoArea < 1 || opcaoArea > 3);
    }

    @Override
    public void setIdade(int idade) {
        this.idade = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Informe a idade do gerente " + getNome()
                )
        );
    }
}




