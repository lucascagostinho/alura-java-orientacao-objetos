
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 || salario <=2800.0) {
			salario = salario - 142;
		} else {
			if (salario >= 2800.1 || salario <= 3751.0) {
				salario = salario - 350;
			} else {
				if (salario >= 3751.01 || salario <= 4664.00) {
					salario = salario - 636;
				}
			}
		}
		
	}

}
