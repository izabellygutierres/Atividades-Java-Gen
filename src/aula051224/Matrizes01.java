package aula051224;

import java.util.Scanner;

public class Matrizes01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
        int somaDPrincipal = 0;
        int somaDSecundaria = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = leia.nextInt();

                // somas em diagonal
                if (i == j) {
                    somaDPrincipal += matriz[i][j];
                }
                if (i + j == 2) {
                    somaDSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDSecundaria);

        leia.close();
	}

}
