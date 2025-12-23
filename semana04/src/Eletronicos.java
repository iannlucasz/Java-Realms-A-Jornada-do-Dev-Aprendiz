public class Eletronicos extends Produto implements Taxavel {

    private static final double Taxa = 0.1;

    public Eletronicos(String nome, int precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularTaxa() {
        return precoBase * Taxa;
    }
}
