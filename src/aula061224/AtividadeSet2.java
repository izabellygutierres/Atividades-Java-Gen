package aula061224;

import java.util.HashSet;
import java.util.Scanner;

public class AtividadeSet2 {

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<>();

        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        // ler a entrada do usuário
        Scanner leia = new Scanner(System.in);

        // Numero digitado pelo usuario para se encontrado
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroBuscado = leia.nextInt();

        // Verifica se o número está no conjunto
        if (numeros.contains(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
        }

        leia.close();
		
	}

}
