package byteBankHeredado;

public class ControlBonificacion {

	private int suma = 0;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma+=funcionario.getBonificacion();
		System.out.println("Calculo actual es: " + this.suma);
		return this.suma;
		
	
	}
}
