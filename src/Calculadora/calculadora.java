package Calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String continuar;
			int opcao;
			double num1, num2, res = 0;
			
			do {
				System.out.println("Informe o primeiro n�mero: ");
				num1 = scan.nextDouble();
				System.out.println("Informe o segundo n�mero: ");
				num2 = scan.nextDouble();
				System.out.println("Digite '1' para soma.\nDigite '2' para subtra��o.\nDigite '3' para multiplica��o.\nDigite '4' para divis�o.");
				opcao = scan.nextInt();
				switch (opcao) {
				case 1:
					res = num1 + num2;
					break;
				case 2:
					res = num1 - num2;
					break;
				case 3:
					res = num1 * num2;
					break;
				case 4:
					res = num1 / num2;
					break;
				}
				System.out.println("O resultado da opera��o escolhida �: " + res);
				System.out.println("Deseja realizar outra opera��o? Digite 's' para repetir ou 'n' para encerrar a calculadora.");
				continuar = scan.next();
			} while (continuar.equals("s") || continuar.equals("S"));
		}
		
		System.out.println("O programa foi encerrado com sucesso.");
	}

}
