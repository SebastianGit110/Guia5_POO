import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {

    public static void main(String args[]) {

        ArrayList<Triangulo> listado1 = new ArrayList<>();
        ArrayList<Cuadrilatero> listado2 = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (true) {

            int value = 0;
            String valueS = JOptionPane.showInputDialog(null, "1. Triangulo \n2. Cuadrialtero \n3. Salir");

            if (valueS != null && valueS.matches("[0-9]+")) {
                value = Integer.parseInt(valueS);
            } else {
                System.out.println("Entrada incorrecta, intente nuevamente");
                continue;
            }

            if (value == 3) {
                System.out.println("Adios...");
                break;
            }

            switch (value) {
                case 1:
                    listado1.add(new Triangulo());
                    System.out.println("---------------Triangulo---------------");
                    listado1.get(index1).calcularArea();
                    listado1.get(index1).calcularPerimetro();
                    System.out.println("---------------------------------------");

                    int[] xV = listado1.get(index1).XVertices();
                    int[] yV = listado1.get(index1).YVertices();

                    JFrame ventana = new JFrame("Dibujar polígono");
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ventana.setSize(1000, 1000);
                    ventana.add(new DibujarPoligono(xV, yV, 3));
                    ventana.setVisible(true);


                    System.out.println();
                    index1 = index1 + 1;
                    break;

                case 2:
                    listado2.add(new Cuadrilatero());
                    System.out.println("--------------Cuadrilatero-------------");
                    listado2.get(index2).calcularArea();
                    listado2.get(index2).calcularPerimetro();
                    System.out.println("---------------------------------------");

                    int[] xV2 = listado2.get(index2).XVertices();
                    int[] yV2 = listado2.get(index2).YVertices();

                    JFrame ventana2 = new JFrame("Dibujar polígono");
                    ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ventana2.setSize(1000, 1000);
                    ventana2.add(new DibujarPoligono(xV2, yV2, 4));
                    ventana2.setVisible(true);

                    System.out.println();
                    index2 = index2 + 1;
                    break;

                default:
                    System.out.println("Entrada incorrecta");
                    break;
            }

        }
    }
}
