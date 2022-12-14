
public class TesteVariaveis {

	public static void main(String[] args) {

		System.out.println("Olá novo teste");

		int idade = 25;

		int idadeDois;
		idadeDois = 26;

		System.out.println(idade);
		System.out.println(idadeDois);

		int soma = idade + idadeDois;
		int subtracao = idade - idadeDois;
		int divisao = idade / idadeDois;
		int multiplicacao = idade * idadeDois;

		System.out.println("Mostrando valores das variáveis: " + "Soma: " + soma + "\n" + "Subtração: " + subtracao
				+ "\n" + "Divisão: " + divisao + "\n" + "Multiplicação: " + multiplicacao);

	}

}
