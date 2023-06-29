package byteBankHeredado;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(123,456);
		cuenta.depositar(201);
		try {
			cuenta.retirar(201);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}

}
