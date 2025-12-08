/*
Semana 2 – Objetivo:
Aprender a usar construtores para criar objetos já preparados desde o início.
Aplicar encapsulamento com getters e setters para proteger os atributos.

Mini-desafio da semana:
Criar a classe classes.Usuario com construtor, getters e setters.
A classe deve permitir criar usuários válidos e controlar o acesso aos dados.

Dica extra:
Pense no classes.Usuario como um personagem jogável: ele sempre nasce com um estado inicial (construtor) e só pode mudar certos atributos de forma controlada (setters).
*/

import classes.Usuario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        // setters da classe Usuario.
            // Nome
            usuario.setNome(JOptionPane.showInputDialog(null, "Informe o seu nome completo."));
            // Idade
            try {
                usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade")));
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            // CPF
            usuario.setCpf(JOptionPane.showInputDialog(null,"Informe o seu CPF: "));

        // Validação
            JOptionPane.showMessageDialog(null,"Usuário Cadastrado!");

        // getters da classe Usuario.
        JOptionPane.showMessageDialog(
                null,
                String.format("Nome: %s | Idade: %s | CPF: %s%n",
                        usuario.getNome(),
                        usuario.getIdade(),
                        usuario.getCpf()
                )
        );






    }

}