package aula031224;

import java.util.Scanner;

public class ExercicioCondicional04 {

    public static void main(String[] args) {

        // Variáveis
        String nomeColaborador;
        int codigoCargo;
        double salarioAtual;
        double novoSalario;
        String nomeCargo = "";
        double[] reajuste = {0.10, 0.07, 0.09, 0.06, 0.05, 0.08};

        Scanner leia = new Scanner(System.in);

        // Usuario coloca as infos
        System.out.print("Digite o nome do colaborador: ");
        nomeColaborador = leia.nextLine();

        System.out.print("Digite o código do cargo (1 a 6): ");
        codigoCargo = leia.nextInt();

        System.out.print("Digite o salário atual: ");
        salarioAtual = leia.nextDouble();

        //condicional switch
        switch (codigoCargo) {
            case 1:
                nomeCargo = "Gerente";
                break;
            case 2:
                nomeCargo = "Vendedor";
                break;
            case 3:
                nomeCargo = "Supervisor";
                break;
            case 4:
                nomeCargo = "Motorista";
                break;
            case 5:
                nomeCargo = "Estoquista";
                break;
            case 6:
                nomeCargo = "Técnico em TI";
                break;
            default:
                System.out.println("Código de cargo inválido.");   
        }

        // processando calculo
        novoSalario = salarioAtual + (reajuste[codigoCargo - 1] * salarioAtual);

        // resultado
        System.out.println("Nome do colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + nomeCargo);
        System.out.println("Novo salário: R$ " + novoSalario);

        leia.close();
    }
}