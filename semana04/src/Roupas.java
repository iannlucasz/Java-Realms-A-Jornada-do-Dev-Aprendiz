public class Roupas extends Produto implements Taxavel{

    private static final double Taxa = 0.5;

    public Roupas(String nome, int precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularTaxa() {
        return precoBase * Taxa;
    }
}
