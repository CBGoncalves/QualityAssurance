package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int eleitores, votosBrancos, votosNulos, votosValidos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade total de votos: ");
		eleitores = sc.nextInt();
		
		System.out.println("Digite o número de votos brancos: ");
		votosBrancos = sc.nextInt();
		
		System.out.println("Digite o número de votos nulos: ");
		votosNulos = sc.nextInt();
		
		System.out.println("Digite o número de votos validos: ");
		votosValidos = sc.nextInt();
		
		votosBrancos = (eleitores*votosBrancos)/100;
		votosNulos = (eleitores*votosNulos)/100;
		votosValidos = (eleitores*votosValidos)/100;
		
		System.out.println("Percentual de votos brancos: "+votosBrancos+"%");
		System.out.println("Percentual de votos nulos: "+votosNulos+"%");
		System.out.println("Percentual de votos Validos: "+votosValidos+"%");
		
		sc.close();
	}

}
