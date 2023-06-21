package byteBankHeredado;

public class Gerente extends Funcionario implements Autenticable {
	
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	
	//sobre-escritura del metodo
	@Override
	public double getBonificacion() {
		System.out.println("Desde Gerente");
		return super.getSalario() + this.getBonificacion()*0.05;
	}
}
