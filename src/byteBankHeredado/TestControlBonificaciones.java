package byteBankHeredado;

public class TestControlBonificaciones {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		
		Gerente jimena = new Gerente();
		jimena.setNombre("jimena");
		
		funcionario.setSalario(2000);
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(alexis);
		controlBonificacion.registrarSalario(jimena);
		
	}

}
