package ex2;

public class Aluno extends Pessoa {
	
	private String matricula;

	public Aluno(String nome, int idade, String matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	 
	@Override
    public void apresentar(){
        System.out.println("Ol�, eu sou o aluno " + nome+ " com matr�cula " + matricula + " e tenho " + idade +" anos.");
    }
}
