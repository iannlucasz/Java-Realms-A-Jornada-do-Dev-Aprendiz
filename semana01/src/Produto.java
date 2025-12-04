import javax.swing.*;

public class Produto {
    public String tipo;
    public String nome;
    public double quantidade;       // <-- double, não int
    public double preco;            // preco por kg ou por unidade
    public double valorPorcentagem; // porcentagem de desconto (ex: 10 para 10%)
    public double valorFinal;       // valor após desconto

    public int mostrarMenuInicial() {
        String menu = """
                Informe o tipo do produto:
                1 - Legumes (Kg)
                2 - Frutas (Kg)
                3 - Verduras (Un)
                4 - Doces (Un)
                5 - Bebidas (Un)
                6 - Carne (Kg)
                """;
        try {
            String resp = JOptionPane.showInputDialog(menu);
            return Integer.parseInt(resp);
        } catch (Exception e) {
            return -1;
        }
    }

    public void calcularDesconto(double valorTotal) {
        if (valorPorcentagem > 0) {
            double desconto = valorTotal * (valorPorcentagem / 100.0);
            valorFinal = valorTotal - desconto;
        } else {
            valorFinal = valorTotal;
        }
    }

    public void mostrarProduto() {
        String msg = String.format("Produto: %s\nTipo: %s\nQuantidade: %s\nPreço unitário: R$ %.2f\nValor final: R$ %.2f",
                nome, tipo, quantidade, preco, valorFinal);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s | Nome: %s | Quantidade: %s | Preço: R$ %.2f | Valor final: R$ %.2f",
                tipo, nome, quantidade, preco, valorFinal);
    }
}
