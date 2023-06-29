package byteBankHeredado;

public abstract class Cuenta {
	//atributos de la instancia
	protected double saldo; 
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	//variable de (objeto particular) 
	private static int total=0;

	//metodos de la instancia
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + this.numero);
		Cuenta.total++;
	}
	
	public abstract void depositar(double valor);
	
	public void retirar(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
		throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo-=valor;
	}
	
	public boolean transferir(double valor, Cuenta destino){
		if(this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			destino.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setAgencia(int agencia) {
		if(agencia > 0 ) {
			this.agencia = agencia;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	//metodos de la clase
	public static int getTotal() {
		return Cuenta.total;
	}
}
