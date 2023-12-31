package byteBankHeredado;

public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo+= valor;		
	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
