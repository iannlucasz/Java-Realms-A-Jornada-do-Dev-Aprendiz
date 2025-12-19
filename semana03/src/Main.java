
/*
Semana 3 – Objetivo:
Praticar o uso de ArrayList para armazenar vários objetos de forma dinâmica.
Aplicar polimorfismo criando subclasses com comportamentos diferentes.

Mini-desafio da semana:
Criar uma lista de Funcionarios com subclasses Gerente e Vendedor, cada uma com seu próprio comportamento.

Dica extra:
Encare o polimorfismo como “habilidades diferentes” de personagens. Cada subclasse executa a mesma ação, mas à sua própria maneira.
*/
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String menu = String.format(
                "%n===============================%n" +
                        "   SISTEMA DE CADASTRO%n" +
                        "===============================%n" +
                        "1 - Registrar Gerente%n" +
                        "2 - Registrar Vendedor%n" +
                        "3- Consultar Funcionário%n" +
                        "0 - Sair%n" +
                        "===============================%n" +
                        "Escolha uma opção: "
        );

        int opcaoMenu;
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        do {
            opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcaoMenu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Cadastro de Gerente selecionado.");

                    Gerente gerente = new Gerente();
                    gerente.setNome(null);
                    gerente.setArea(null);
                    gerente.setIdade(0);

                    funcionarios.add(gerente);

                    JOptionPane.showMessageDialog(
                            null,
                            "Gerente cadastrado com sucesso!\nID: " +
                                    gerente.getNumIndentificacao()
                    );
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Cadastro de Vendedor selecionado.");

                    Vendedor vendedor = new Vendedor();
                    vendedor.setNome(null);
                    vendedor.setArea(null);
                    vendedor.setIdade(0);

                    funcionarios.add(vendedor);

                    JOptionPane.showMessageDialog(
                            null,
                            "Vendedor cadastrado com sucesso!\nID: " +
                                    vendedor.getNumIndentificacao()
                    );
                    break;

                case 3:
                    if (funcionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
                        break;
                    }

                    String menuBusca =
                            """
                                    Procurar funcionário por:
                                    1 - Nome
                                    2 - Área
                                    3 - Número de Identificação""";

                    int opcaoBusca = Integer.parseInt(
                            JOptionPane.showInputDialog(menuBusca)
                    );

                    boolean encontrou = false;

                    if (opcaoBusca == 1) {
                        String nomeBusca = JOptionPane.showInputDialog("Digite o nome:");

                        for (Funcionarios f : funcionarios) {
                            if (f.getNome().equalsIgnoreCase(nomeBusca)) {
                                JOptionPane.showMessageDialog(null,
                                        "Nome: " + f.getNome() +
                                                "\nÁrea: " + f.getArea() +
                                                "\nIdade: " + f.getIdade() +
                                                "\nID: " + f.getNumIndentificacao()
                                );
                                encontrou = true;
                            }
                        }

                    } else if (opcaoBusca == 2) {
                        String areaBusca = JOptionPane.showInputDialog("Digite a área:");

                        for (Funcionarios f : funcionarios) {
                            if (f.getArea().equalsIgnoreCase(areaBusca)) {
                                JOptionPane.showMessageDialog(null,
                                        "Nome: " + f.getNome() +
                                                "\nÁrea: " + f.getArea() +
                                                "\nIdade: " + f.getIdade() +
                                                "\nID: " + f.getNumIndentificacao()
                                );
                                encontrou = true;
                            }
                        }

                    } else if (opcaoBusca == 3) {
                        int idBusca = Integer.parseInt(
                                JOptionPane.showInputDialog("Digite o ID:")
                        );

                        for (Funcionarios f : funcionarios) {
                            if (f.getNumIndentificacao() == idBusca) {
                                JOptionPane.showMessageDialog(null,
                                        "Nome: " + f.getNome() +
                                                "\nÁrea: " + f.getArea() +
                                                "\nIdade: " + f.getIdade() +
                                                "\nID: " + f.getNumIndentificacao()
                                );
                                encontrou = true;
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                    }

                    if (!encontrou) {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
                    }

                    break;


                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcaoMenu != 0);
    }
}
