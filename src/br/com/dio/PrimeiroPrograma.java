package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.setNome("Mingual");
		gato.setCor("Caramelo");
		gato.setIdade(5);
		
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		
		/*int a = 2;
		int b = 3;
		System.out.println("Olá, Mundo!!! \\o/\\o/\\o/");
		System.out.println("==================== É Hora de Calcular ====================\n");
		
		System.out.println("A soma de a + b é igual a: " + (a+b));
		System.out.println("A subtração de b - a é igual a: " + (b-a));
		System.out.println("A multiplicação de a * b é igual a: " + (a*b));
		System.out.println("A divisão de b / a é igual a: " + (b/a));
		System.out.println("O resto da divisão entre b % a é igual a: " + (b%a));
		System.out.println("A potência de a elevado a b é igual a: " + Math.pow(a, b));
				
		System.out.println("\n==================== Até a Próxima \\o/\\o/\\o/ ====================");
		*/
	}

}


class Livros {
	private String nome;
	private String npag;
}