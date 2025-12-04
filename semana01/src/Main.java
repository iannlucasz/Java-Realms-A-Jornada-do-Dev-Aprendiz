import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    static Locale brasil = new Locale("pt", "BR");
    static NumberFormat nf = NumberFormat.getNumberInstance(brasil);

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        int continuar = 0;

        do {
            Produto prod = new Produto();

            int tipo = prod.mostrarMenuInicial();

            switch (tipo) {
                case 1, 2, 6:
                    prod.nome = JOptionPane.showInputDialog("Informe o nome do produto");

                    // Lê QUANTIDADE como double, aceitando "0,500"
                    try {
                        String qtdStr = JOptionPane.showInputDialog("Informe a quantidade de " + prod.nome + ":");
                        prod.quantidade = nf.parse(qtdStr).doubleValue(); // <-- double
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Quantidade inválida!");
                        continue;
                    }

                    try {
                        String precoStr = JOptionPane.showInputDialog("Informe o preço por KG de " + prod.nome + ":");
                        prod.preco = nf.parse(precoStr).doubleValue();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Preço inválido!");
                        continue;
                    }

                    if (tipo == 1) prod.tipo = "Legumes";
                    else if (tipo == 2) prod.tipo = "Frutas";
                    else prod.tipo = "Carne";

                    break;

                case 3, 4, 5:
                    prod.nome = JOptionPane.showInputDialog("Informe o nome do produto");


                    try {
                        String qtdStr = JOptionPane.showInputDialog("Informe a quantidade de " + prod.nome + ":");
                        prod.quantidade = nf.parse(qtdStr).doubleValue();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Quantidade inválida!");
                        continue;
                    }

                    try {
                        String precoStr = JOptionPane.showInputDialog("Informe o preço unitário de " + prod.nome);
                        prod.preco = nf.parse(precoStr).doubleValue();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Preço inválido!");
                        continue;
                    }

                    if (tipo == 3) prod.tipo = "Verduras";
                    else if (tipo == 4) prod.tipo = "Doces";
                    else prod.tipo = "Bebidas";
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    continue;
            }

            double valorTotal = prod.preco * prod.quantidade; // agora correto para double

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar desconto?");
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    String descStr = JOptionPane.showInputDialog("Informe a porcentagem de desconto:");
                    prod.valorPorcentagem = nf.parse(descStr).doubleValue();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Desconto inválido!");
                }
            }

            prod.calcularDesconto(valorTotal);
            prod.mostrarProduto();
            produtos.add(prod);

            continuar = JOptionPane.showConfirmDialog(null, "Deseja registrar outro produto?");

        } while (continuar == JOptionPane.YES_OPTION);

        double totalCarrinho = 0;
        StringBuilder sb = new StringBuilder("Produtos Registrados:\n\n");

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            sb.append(i).append(" - ").append(p).append("\n");
            totalCarrinho += p.valorFinal;
        }

        sb.append("\nValor TOTAL do carrinho: R$ ")
                .append(String.format("%.2f", totalCarrinho));

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
