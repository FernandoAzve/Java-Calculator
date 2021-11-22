package Calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String continuar;
			int opcao;
			double num1, num2, res = 0;
			
			do {
				System.out.println("Informe o primeiro número: ");
				num1 = scan.nextDouble();
				System.out.println("Informe o segundo número: ");
				num2 = scan.nextDouble();
				System.out.println("Digite '1' para soma.\nDigite '2' para subtração.\nDigite '3' para multiplicação.\nDigite '4' para divisão.");
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
				System.out.println("O resultado da operação escolhida é: " + res);
				System.out.println("Deseja realizar outra operação? Digite 's' para repetir ou 'n' para encerrar a calculadora.");
				continuar = scan.next();
			} while (continuar.equals("s") || continuar.equals("S"));
		}
		
		System.out.println("O programa foi encerrado com sucesso.");
	}

}
