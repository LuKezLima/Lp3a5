package ex1;

public class Pessoa {
private String nome;
private int idade;

public Pessoa(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}

public void apresentar() {
	System.out.println("Ol�, eu sou " + nome + " e tenho " + idade + " anos.");
}
}
