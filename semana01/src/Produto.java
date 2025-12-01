import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Produto {

    public String nome;
    public String tipo;
    public int quantidade;
    public double preco;
    public double valorPorcentagem;
    public double resultado;

    // Formatação brasileira
    static Locale brasil = new Locale("pt", "BR");
    static NumberFormat nf = NumberFormat.getNumberInstance(brasil);

    // Método que calcula o preço final com desconto
    public double calcularDesconto(double valorTotal) {
        double fator = valorPorcentagem / 100.0;
        resultado = valorTotal * (1 - fator);
        return resultado;
    }

    // Saída final
    public void mostrarProduto() {
        String mensagem =
                "Produto: " + nome + "\n" +
                        "Tipo: " + tipo + "\n" +
                        "Quantidade: " + quantidade + "\n" +
                        "Preço unitário: " + nf.format(preco) + "\n" +
                        "Desconto: " + nf.format(valorPorcentagem) + "%\n" +
                        "Valor final: " + nf.format(resultado);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
