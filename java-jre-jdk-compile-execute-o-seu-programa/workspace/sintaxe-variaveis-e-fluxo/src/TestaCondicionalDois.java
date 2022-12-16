
public class TestaCondicionalDois {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 15;
		int quantidadePessoas = 2;
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
		
		System.out.println();
		
		idade = 18;
		quantidadePessoas = 2;
		
		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
			
		} else {
			System.out.println("Você não pode entrar");
		}
		
		boolean acompanhado = true;
		
		if (idade >= 18 && acompanhado == true) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
		
		System.out.println();
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
		
		System.out.println();
		
		acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
		
		System.out.println();
		
		boolean maiorDeIdade = idade >= 18;
		
		if (maiorDeIdade || acompanhado) {
			System.out.println("Bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
	}
	
}
