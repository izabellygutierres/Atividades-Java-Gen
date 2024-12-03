package introducao;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) { // ativivade Salario bruto e adicional noturno
		
		//variaveis
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiq;
		
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: R$");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o descostos da folha: ");
		descontos = leia.nextFloat();
		
		//processamento  SALÁRIO BRUTO + ADICIONAL NOTURNO + (HORAS EXTRAS * 5) - DESCONTOS
		
		salarioLiq = salarioBruto + adicionalNoturno + (horasExtras*5)-descontos;
		
		//saida
		System.out.printf("Salario liquido disponivel: R$ %.1f", salarioLiq);
		
	}

}
