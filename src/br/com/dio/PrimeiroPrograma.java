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
		System.out.println("Ol�, Mundo!!! \\o/\\o/\\o/");
		System.out.println("==================== � Hora de Calcular ====================\n");
		
		System.out.println("A soma de a + b � igual a: " + (a+b));
		System.out.println("A subtra��o de b - a � igual a: " + (b-a));
		System.out.println("A multiplica��o de a * b � igual a: " + (a*b));
		System.out.println("A divis�o de b / a � igual a: " + (b/a));
		System.out.println("O resto da divis�o entre b % a � igual a: " + (b%a));
		System.out.println("A pot�ncia de a elevado a b � igual a: " + Math.pow(a, b));
				
		System.out.println("\n==================== At� a Pr�xima \\o/\\o/\\o/ ====================");
		*/
	}

}


class Livros {
	private String nome;
	private String npag;
}