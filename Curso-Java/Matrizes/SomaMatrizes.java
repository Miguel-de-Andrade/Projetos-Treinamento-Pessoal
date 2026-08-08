import javax.swing.*;

public class SomaMatrizes {
    public static void main(String[] args) {

        int linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de linha que as duas matrizes vão ter"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de colunas que as duas matrizes vão ter"));

        int [] [] matrizA = new int[linhas][colunas];
        int [] [] matrizB = new int[linhas][colunas];
        int [] [] matrizResultante = new int [linhas][colunas];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da " +
                        "linha " +i+ ", coluna " +j+ " da primeira matriz"));
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da " +
                        "linha " +i+ ", coluna " +j+ " da segunda matriz"));
            }
        }

        String mensagem = "A matriz resultante do soma dessas duas é: \n ";

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizResultante[i][j] = matrizA[i][j] + matrizB[i][j];
                mensagem += matrizResultante[i][j] + " ";
            }
            mensagem += "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
