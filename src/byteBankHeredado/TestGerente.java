package byteBankHeredado;

public class TestGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		//gerente.setSalario(4000);
		//Funcionario gerente = new Funcionario();
		gerente.setTipo(1);
		gerente.setSalario(6000);
		
		System.out.println("Salario gerente: "+ gerente.getSalario());
		System.out.println("Bonificacion de gerente: "+ gerente.getBonificacion());
	}

}
