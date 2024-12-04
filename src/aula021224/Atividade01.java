package aula021224;

import java.util.Scanner;

public class Atividade01 {
		
	public static void main(String[] args) { //atividade Salario
		
		//variaveis
		float salario;
		float abono;
		float nvsalario;
	
		Scanner leia = new Scanner(System.in);
		
		//Entrada - inserir salario e abono
		System.out.println("Digite o salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("Abono: ");
		abono = leia.nextFloat();
		
		//processamento - calculo
		nvsalario = salario + abono;
		
		//Saísa de Dados
				System.out.println("Novo Salário: R$" + nvsalario);		
	leia.close();	
	}	

}
