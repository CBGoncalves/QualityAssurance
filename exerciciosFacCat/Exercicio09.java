package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor do seu salário atual: ");
			float salario = sc.nextFloat();
			System.out.println("Digite o valor da porcentagem de reajuste: ");
			float reajuste = sc.nextFloat();
			
			float valorRealDoReajuste = reajuste * salario / 100;
			float salarioFinal = salario + valorRealDoReajuste;
			
			System.out.printf("O novo salario com reajuste é: R$ %.2f",salarioFinal);
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: "+e);
		}

	}

}
