package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Zarate
 */
public class View {

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void showInt(int number) {
        JOptionPane.showMessageDialog(null, number);
    }

    public String readData(String message) {
        String data = JOptionPane.showInputDialog(null, message);
        return data;
    }

    public int menu() {
        int option = Integer.parseInt(readData(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n                           Menu\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "1. Ver Matriz Transpuesta \n2. Crear otra matriz \n3. Salir"
                + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Introduzca el número de opción:"));
        return option;
    }

    public static void imprimirMatriz(ArrayList<ArrayList<Integer>> matriz) {
        for (ArrayList<Integer> fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void showMatrizTranspuesta(String title, ArrayList<ArrayList<Integer>> matriz) {
        StringBuilder matrizString = new StringBuilder();
        for (ArrayList<Integer> row : matriz) {
            for (int element : row) {
                matrizString.append(element).append(" ");
            }
            matrizString.append("\n");
        }
        JOptionPane.showMessageDialog(null, matrizString.toString(), title, JOptionPane.INFORMATION_MESSAGE);
    }
}
