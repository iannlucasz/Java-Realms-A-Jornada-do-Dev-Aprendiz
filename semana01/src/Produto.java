import javax.swing.*;

public class Produto {
    public String tipo;
    public String nome;
    public double quantidade;
    public double preco;
    public double valorPorcentagem;
    public double valorFinal;

    // Menu para o usuário escolher o tipo do produto.
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

    // Calculo responsável por fazer a conta do desconto do produto caso necessário.
    public void calcularDesconto(double valorTotal) {
        if (valorPorcentagem > 0) {
            double desconto = valorTotal * (valorPorcentagem / 100.0);
            valorFinal = valorTotal - desconto;
        } else {
            valorFinal = valorTotal;
        }
    }

    // Mensagem responsável ao mostrar dados do produto após registrado.
    public void mostrarProduto() {
        String msg = String.format("Produto: %s\nTipo: %s\nQuantidade: %s\nPreço unitário: R$ %.2f\nValor final: R$ %.2f",
                nome, tipo, quantidade, preco, valorFinal);
        JOptionPane.showMessageDialog(null, msg);
    }

    // Formatação do texto para a lista de produtos registrados.
    @Override
    public String toString() {
        return String.format("Tipo: %s | Nome: %s | Quantidade: %s | Preço: R$ %.2f | Valor final: R$ %.2f",
                tipo, nome, quantidade, preco, valorFinal);
    }
}
