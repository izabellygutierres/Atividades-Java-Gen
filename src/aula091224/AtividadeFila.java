package aula091224;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int opcao;	
		String nome;
		String clienteRemovido;

		do {
			System.out.println("------------Menu-------------");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("-----------------------------");
			System.out.print("Entre com a opção desejada: ");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente adicionado à fila!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					clienteRemovido = fila.poll();
					System.out.println("Cliente " + clienteRemovido + " removido da fila.");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
		
		leia.close();
	}

}