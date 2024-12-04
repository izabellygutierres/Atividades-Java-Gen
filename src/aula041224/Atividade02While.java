package aula041224;

import java.util.Scanner;

public class Atividade02While {

	public static void main(String[] args) {
		
		int idade = 0;
		int menor21= 0;
		int maior50 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as idades.Leitura de dados é finalizada, após digitar uma idade abaixo de 0:");
		//texto informativo
		
		while (idade >= 0) {
			System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
            
            if( idade < 21) {
            	menor21++;
            }else if( idade > 50) {
            	maior50++;
            }
		}
		//contagem de cada tópico
		System.out.println("Total de pessoas menores de 21 anos: "+ menor21);
		System.out.println("Total de pessoas maiores de 50 anos: "+ maior50);
		
		leia.close();
	}

}
