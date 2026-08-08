import javax.swing.*;

public class EntradaUsuario {
    public static void main(String[] args) {

        int [] [] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da " +
                        "linha " +i+ ", coluna " +j));
            }
        }

        String matrizFeita = "A matriz ficou: \n";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizFeita += matriz[i] [j] + " ";
            }
            matrizFeita += "\n";
        }

        JOptionPane.showMessageDialog(null,matrizFeita);

    }
}
