import javax.swing.*;

public class MultiplicacaoEscalar {
    public static void main(String[] args) {

        int linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de linhas que a matriz vai ter"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de colunas que a  matriz vai ter"));

        int [] [] matrizA = new int[linhas][colunas];
        int [] [] matrizResultante = new int [linhas][colunas];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da " +
                        "linha " +i+ ", coluna " +j+ " da  matriz"));
            }
        }

        int numeroMultiplicacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para multiplicar todos os valores dessa matriz"));

        String mensagem = "A matriz resultante dessa multiplicação é: \n";

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizResultante [i][j] = matrizA[i][j] * numeroMultiplicacao;

                mensagem += matrizResultante[i][j] + " ";
            }

            mensagem += "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
