import java.util.Scanner;

public class MaiorMenorEMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int linhas = sc.nextInt();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        int colunas = sc.nextInt();

        int [][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a linha " +i+ " e coluna " +j+ ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        int totalElementos = linhas * colunas;
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                soma += matriz[i][j];

                if (matriz [i][j] > maior){
                    maior = matriz [i][j];
                }
                if (matriz[i][j] < menor){
                    menor = matriz [i][j];
                }
            }
        }

        double media =  (double) soma / totalElementos;

        System.out.println("O maior elemento dessa matriz é: " +maior);
        System.out.println("O menor elemento dessa matriz é: " +menor);
        System.out.println("A média dos elementos dessa matriz é: " +media);

    }
}
