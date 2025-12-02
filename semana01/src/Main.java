import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static Locale brasil = new Locale("pt", "BR");
    static NumberFormat nf = NumberFormat.getNumberInstance(brasil);

    public static void main(String[] args) {
        // === Produto 01 ===

        Produto prod1 = new Produto();
        int tipo = prod1.mostrarMenuInicial(); // recebe a resposta + mostra o menu

        // Dados do Produto 01
        switch(tipo) {
            case 1, 2 , 6:
                // Informar nome do produto
                prod1.nome = JOptionPane.showInputDialog("Informe o nome do produto");
                // Informar quantidade do produto
                prod1.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto [ " + prod1.nome + " ] em KG:"));
                // Informar preço do kilo do produto + Formatações para aceitar ponto ou vírgula
                try {
                    String precoStr = JOptionPane.showInputDialog("Informe o preço do kilo do produto [ " + prod1.nome + " ]");
                    prod1.preco = nf.parse(precoStr).doubleValue();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Preço inválido!");
                    return;
                }
                // Tipo do produto
                if (tipo == 1) {
                    prod1.tipo = "Legumes";

                } else if (tipo == 2) {
                    prod1.tipo = "Frutas";

                } else {
                    prod1.tipo = "Carne";
                }
                break;

            case 3, 4, 5:
                // Informar nome do produto
                prod1.nome = JOptionPane.showInputDialog("Informe o nome do produto");
                // Informar quantidade do produto
                prod1.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto [ " + prod1.nome + " ] em Unidade:"));
                // Informar preço unitário do produto + Formatações para aceitar ponto ou vírgula
                try {
                    String precoStr = JOptionPane.showInputDialog("Informe o preço unitário do produto [ " + prod1.nome + " ]");
                    prod1.preco = nf.parse(precoStr).doubleValue();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Preço inválido!");
                    return;
                }
                // Tipo do produto
                if (tipo == 3) {
                    prod1.tipo = "Verduras";

                } else if (tipo == 4) {
                    prod1.tipo = "Doces";

                } else {
                    prod1.tipo = "Bebidas";
                }
                break;

            default:
                JOptionPane.showMessageDialog(null,"Opção Inválida!");

        }


        double valorTotal = prod1.preco * prod1.quantidade;

        // Aplicação de Desconto
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar desconto?");

        if (resposta == JOptionPane.YES_OPTION) {
            try {
                String descStr = JOptionPane.showInputDialog("Informe a porcentagem de desconto");
                prod1.valorPorcentagem = nf.parse(descStr).doubleValue();
                JOptionPane.showMessageDialog(null, "Desconto aplicado!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor de desconto inválido!");
                return;
            }
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Nenhum desconto aplicado!");
        }

        // Calcular Desconto
        prod1.calcularDesconto(valorTotal);

        // Saída
        prod1.mostrarProduto();
    }
}
