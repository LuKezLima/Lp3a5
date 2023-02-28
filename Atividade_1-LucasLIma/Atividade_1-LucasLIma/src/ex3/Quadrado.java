package ex3;

public class Quadrado extends FormaGeometrica{
	private double lado;
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
