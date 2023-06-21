package byteBankHeredado;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("12090");
		diego.setSalario(2000);
		diego.setTipo(0);
		System.out.println("Salario es: "+ +diego.getSalario());
		System.out.println("Bonificacion funcionario: " + diego.getBonificacion());

	}

}
