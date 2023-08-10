package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Zarate
 */
public class Matriz {

    ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> getMatriz() {
        return matriz;
    }

    public static ArrayList<ArrayList<Integer>> calcularMatrizTranspuesta(ArrayList<ArrayList<Integer>> matriz) {
        int filas = matriz.size();
        int columnas = matriz.get(0).size();

        ArrayList<ArrayList<Integer>> matrizTranspuesta = new ArrayList<>();

        for (int j = 0; j < columnas; j++) {
            matrizTranspuesta.add(new ArrayList<>());
            for (int i = 0; i < filas; i++) {
                matrizTranspuesta.get(j).add(matriz.get(i).get(j));
            }
        }

        return matrizTranspuesta;
    }

   

}
