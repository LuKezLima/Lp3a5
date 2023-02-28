package ex4;

public class Gerente extends Funcionario{
	private String senha;

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario, departamento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarInformacoes() {
		System.out.println("Nome:" + nome + ", Salário: " + salario + ", Departamento: " + departamento + ", Senha: " + senha);
	}
}
