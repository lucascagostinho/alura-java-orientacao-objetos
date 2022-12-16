
public class TesteCondicional {

	public static void main(String[] args) {

		System.out.println("Testando COndicionais");

		int idade = 20;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Você pode entrar, pois está acompanhado, mas é menor de idade");
			} else {
				System.out.println("Você é menor de idade e não está acompanhado");
			}
		}

	}

}
