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
                        "0 - Sair%n" +
                        "===============================%n" +
                        "Escolha uma opção: "
        );

        String area = String.format(
                "%n===============================%n" +
                        "   SELECIONE A ÁREA DE ATUAÇÃO%n" +
                        "===============================%n" +
                        "1 - Geral%n" +
                        "2 - Vendas%n" +
                        "3 - RH%n" +
                        "===============================%n" +
                        "Escolha uma opção: "
        );

        int opcaoMenu;
        int opcaoArea = 0;


        ArrayList<Funcionarios> funcionarios = new ArrayList<>();


        do {
            opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcaoMenu) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Cadastro de Gerente selecionado.");

                    Gerente gerente = new Gerente();

                    gerente.setNome(JOptionPane.showInputDialog(null,"Informe o nome do Gerente"));
                    gerente.setArea(JOptionPane.showInputDialog(opcaoArea));




            }

        } while (opcaoMenu != 0);







    }

}