package aula031224;

import java.util.Scanner;

public class ExercicioCondicional02 {

	public static void main(String[] args) {
		//variaveis
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a idade do doador: ");
        idade = leia.nextInt();		
        
        System.out.print("Primeira doação de sangue? (true or false): ");
        primeiraDoacao = leia.nextBoolean();
		
        //if e else 
        if ((idade >= 18 && idade <= 69) || (idade >= 60 && !primeiraDoacao)) {
            System.out.println(nome + " está apto para doar sangue!");
        } else {
            System.out.println(nome + " não está apto para doar sangue.");
        }

        leia.close();

	}

}
