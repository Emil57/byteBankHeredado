package byteBankHeredado;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cc = new CuentaCorriente(1,2);
		CuentaAhorro ca = new CuentaAhorro(2,3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca); 
		System.out.println("Saldo cuenta corriente: "+ cc.getSaldo());
		System.out.println("Saldo cuenta ahorro: "+ ca.getSaldo());
	}

}
