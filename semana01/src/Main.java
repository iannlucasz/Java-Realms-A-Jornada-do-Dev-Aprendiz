import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static Locale brasil = new Locale("pt", "BR");
    static NumberFormat nf = NumberFormat.getNumberInstance(brasil);

    public static void main(String[] args) {
        // === Produto 01 ===

        Produto prod1 = new Produto();

        // Dados do Produto 01
        prod1.nome = JOptionPane.showInputDialog("Informe o nome do produto");
        prod1.tipo = JOptionPane.showInputDialog("Informe o tipo do produto [ " + prod1.nome + " ]");
        prod1.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto [ " + prod1.nome + " ]"));

        // Informações sobre preço
        // Formatações para aceitar ponto ou vígula
        try {
            String precoStr = JOptionPane.showInputDialog("Informe o preço unitário do produto [ " + prod1.nome + " ]");
            prod1.preco = nf.parse(precoStr).doubleValue();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preço inválido!");
            return;
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
