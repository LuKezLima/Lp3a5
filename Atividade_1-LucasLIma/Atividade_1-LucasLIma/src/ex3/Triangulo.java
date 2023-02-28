package ex3;

public class Triangulo extends FormaGeometrica{
	private double base;
	private double altura;
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
}
