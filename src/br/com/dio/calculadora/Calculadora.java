package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("============================== Vamos l� Calcular ==============================");
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		System.out.println("\n================================= Os Resutados ===============================");
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A Soma � igual a: " + soma);
		System.out.println("A Subtra��o � igual a: " + subtracao);
		System.out.println("A Multiplica��o � igual a: " + multiplicacao);
		System.out.println("A Divis�o � igual a: " + divisao);
		
		System.out.println("============================== At� a Pr�xima \\o/ ==============================");
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	

}
