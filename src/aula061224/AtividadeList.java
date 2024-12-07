package aula061224;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores:");
		
		
		for (int i = 0; i < 5; i++) {
			String cor = leia.nextLine();
			cores.add(cor);
		}
		//mostra a seguencia digitada pelo usuario:
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		// For each- ordem alfabética:
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}

}
