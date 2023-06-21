package byteBankHeredado;

public class Administrador extends Funcionario implements Autenticable {

	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
