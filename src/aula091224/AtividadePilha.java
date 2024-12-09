package aula091224;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

    public static void main(String[] args) {

        Stack<String> pilhaLivros = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        String livro;

        do {
            System.out.println("------------Menu------------");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da Pilha");
            System.out.println("0 - Sair");
            System.out.print("\nEntre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine();  
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    livro = leia.nextLine();  
                    pilhaLivros.push(livro);
                    System.out.println("Livro adicionado à pilha!");            
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (String livroNaPilha : pilhaLivros) {
                            System.out.println(livroNaPilha);
                      
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        livro = pilhaLivros.pop();
                        System.out.println("Um livro foi removido da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        leia.close();
    }

}

