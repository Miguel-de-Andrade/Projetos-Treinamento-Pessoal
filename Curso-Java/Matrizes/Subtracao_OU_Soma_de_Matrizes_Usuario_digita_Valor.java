import javax.swing.*;

public class Subtracao_OU_Soma_de_Matrizes_Usuario_digita_Valor {
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

        String decisao = JOptionPane.showInputDialog(null,"Você quer somar ou subtrair essas duas matrizes? (Somar/Subtrair)");
        String mensagem = "Matriz resultante: \n";

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (decisao.equalsIgnoreCase("Somar")){
                    matrizResultante [i] [j] = matrizA[i][j] + matrizB[i][j];

                }else if (decisao.equalsIgnoreCase("Subtrair")){
                    matrizResultante [i] [j] = matrizA[i][j] - matrizB[i][j];

                } else {
                    JOptionPane.showMessageDialog(null ,"Opção inválida");
                    return;
                }

                mensagem += matrizResultante[i][j] + " ";
            }

            mensagem += "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
