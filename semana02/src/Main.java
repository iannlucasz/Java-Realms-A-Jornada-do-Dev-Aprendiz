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

        // Nome
        String nome = JOptionPane.showInputDialog(null,"Informe o seu nome");

        // Idade
        int idade = 0;
        try {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade"));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        // CPF
        String cpf = JOptionPane.showInputDialog(null,"Informe seu CPF (inclua pontos!)");

        Usuario usuario = new Usuario(nome,idade,cpf);

        JOptionPane.showMessageDialog( null, String.format("Nome: %s | Idade: %s | CPF: %s%n"
                , usuario.getNome(), usuario.getIdade(), usuario.getCpf() ) );

    }

}