package aula031224;

import java.util.Scanner;

public class ExercicioCondicional03 {

    public static void main(String[] args) {

        // variaveis e preços produtos
        int codigoProduto;
        int quantidade;
        double valorTotal;
        double[] precos = {10.00, 15.00, 18.00, 12.00, 8.00, 13.00};
        String nomeProduto = "";
        
        Scanner leia = new Scanner(System.in);

        // Apresentação do cardápio
        System.out.println("          Cardápio          ");
        System.out.println("Digite 1  -  Cachorro Quente");
        System.out.println("Digite 2  -         X-Salada");
        System.out.println("Digite 3  -          X-Bacon");
        System.out.println("Digite 4  -            Bauru");
        System.out.println("Digite 5  -     Refrigerante");
        System.out.println("Digite 6  -  Suco de Laranja");
        System.out.println("                            ");

        // usuario digita 
        System.out.print("Digite a opção escolhida: ");
        codigoProduto = leia.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = leia.nextInt();

        valorTotal = quantidade * precos[codigoProduto - 1];
      

        // processamento 
        switch (codigoProduto) {
            case 1:
                nomeProduto = "Cachorro Quente";
                break;
            case 2:            
                nomeProduto = "X-Salada";
                break;
            case 3:
            	nomeProduto = "X-Bancon";
            	break;
            case 4:
            	nomeProduto = "Bauru";
            	break;
            case 5: 
            	nomeProduto = "Refrigerante";
            	break;
            case 6:
            	nomeProduto = "Suco de Laranja";
            	break;
            	
            default:
                System.out.println("Código de produto inválido.");       
        }

        // Exibição do resultado
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total: R$ " + valorTotal);

        leia.close();
    }
}