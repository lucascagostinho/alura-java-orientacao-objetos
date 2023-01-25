
public class TestaWhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int contadorDois = 0;
		int contadorTres = 0;
		int contadorQuatro = 1;
		
		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;
			
		}
		System.out.println(contador);
		
		System.out.println("--------");
		
		while (contadorDois <=10) {
			System.out.println(contadorDois);
			contadorDois += 1;
			
		}
		System.out.println(contadorDois);
		
		System.out.println("--------");
		
		while (contadorTres <= 10) {
			System.out.println(contadorTres);
			contadorTres++;
		}
		System.out.println(contadorTres);
		
		System.out.println("--------");
		
		while (contadorQuatro <= 10) {
			System.out.println(contadorQuatro);
			contadorQuatro++;
		}
		
	}

}
