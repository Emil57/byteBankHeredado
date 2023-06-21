package byteBankHeredado;

public class CalculadoraDeImpuestos {

    private double totalImpuesto;

    public void registra(Tributacion t) {
        double valor = t.getValorImpuesto();
        this.totalImpuesto += valor;
    }

    public double getTotalImpuesto() {
        return totalImpuesto;
    }

}
