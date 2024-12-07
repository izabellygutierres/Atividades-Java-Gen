package aula061224;

import java.util.HashSet;
import java.util.Scanner;

public class AtividadeSet {

	public static void main(String[] args) {
		
		HashSet<Integer> numeros = new HashSet<>();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 números:");
        
        //usuario inseri os numeros
        for (int i = 0; i < 10; i++) {         
            int numero = leia.nextInt();
            numeros.add(numero);
        }
        
        //For each- ordem sequencial e HashSet não permite repetição de numero
        System.out.println("\nLista de dados do Set:");
        numeros.forEach(numero -> System.out.println(numero));

        leia.close();
	}

}
