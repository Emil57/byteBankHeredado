package byteBankHeredado;

public class TestSistemaInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente);
		sistema.autentica(admin);
		
	}

}
