package byteBankHeredado;

public class SistemaInterno {
	
	private String clave = "AluraCursosOnline";
		
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login con exito");
			return true;
		}
		else {
			System.out.println("Error en login");
			return false;
		}
	}

}
