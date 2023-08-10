package presenter;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.View;
import model.Matriz;

/**
 *
 * @author Sebastian Zarate
 */
public class Presenter {

    View view = new View();
    Matriz model = new Matriz();

    public void readData() {

        int rows = Integer.parseInt(view.readData("Ingrese el número de filas: "));

        int columns = Integer.parseInt(view.readData("Ingrese el número de columnas: "));

        // Solicitar datos para llenar la matriz
        for (int i = 0; i < rows; i++) {
            model.getMatriz().add(new ArrayList<>());
            for (int j = 0; j < columns; j++) {
                int value = Integer.parseInt(view.readData("Ingrese el valor para la posición (" + (i + 1) + "," + (j + 1) + "): "));
                model.getMatriz().get(i).add(value);
            }
        }

        // Imprimir la matriz original
        view.showMatrizTranspuesta("Matriz Original", model.getMatriz());

        int option = 0;
        do {
            try {
                option = view.menu();
                switch (option) {
                    case 1:
                        ArrayList<ArrayList<Integer>> matrizTranspuesta = model.calcularMatrizTranspuesta(model.getMatriz());

                        view.showMatrizTranspuesta("Matriz Transpuesta", matrizTranspuesta);
                        break;
                    case 2:
                        readData();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        view.showMessage("       Programa finalizado");
                }
            } catch (NumberFormatException e) {
                view.showMessage("           ¡Opción inválida!");
            }
        } while (option != 4);

    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.readData();
    }
}
