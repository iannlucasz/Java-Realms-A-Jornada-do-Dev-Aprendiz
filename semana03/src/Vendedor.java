import javax.swing.*;

public class Vendedor extends Funcionarios {

    @Override
    public void setNome(String nome) {
        this.nome = JOptionPane.showInputDialog(
                null,
                "Informe o nome do Vendedor"
        );
    }

    @Override
    public void setArea(String area) {

        String areaMenu =
                """
                        1 - Hortifrúti
                        2 - Frios e Laticínios
                        3 - Açougue
                        4 - Padaria
                        5 - Operador de Caixa
                        6 - Estoquista""";

        int opcaoArea;

        do {
            opcaoArea = Integer.parseInt(
                    JOptionPane.showInputDialog(areaMenu)
            );

            switch (opcaoArea) {
                case 1 -> this.area = "Hortifrúti";
                case 2 -> this.area = "Frios e Laticínios";
                case 3 -> this.area = "Açougue";
                case 4 -> this.area = "Padaria";
                case 5 -> this.area = "Operador de Caixa";
                case 6 -> this.area = "Estoquista";
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcaoArea < 1 || opcaoArea > 6);
    }

    @Override
    public void setIdade(int idade) {
        this.idade = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Informe a idade do vendedor " + getNome()
                )
        );
    }
}
