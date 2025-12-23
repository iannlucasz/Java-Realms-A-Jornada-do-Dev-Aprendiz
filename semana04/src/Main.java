/*
Semana 4 – Objetivo:
Entender herança como forma de reutilizar código entre classes.
Aprender interfaces como contratos obrigatórios entre classes.

Mini-desafio da semana:
Criar uma interface Taxavel e aplicá-la em duas classes diferentes.

Dica extra:
A interface funciona como uma missão obrigatória que cada classe precisa cumprir — se ela “aceita a missão”, precisa implementar tudo.
*/

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Taxavel produto1 = new Eletronicos("Iphone" , 1500);
        Taxavel produto2 = new Roupas("Blusa Nike", 190);

        JOptionPane.showMessageDialog(
                null,
                "Taxa calculado: Produto1- " + produto1.calcularTaxa() + " || Produto2- " + produto2.calcularTaxa()
        );



    }

}