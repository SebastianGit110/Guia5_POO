package Presentacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {
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
                System.out.println();
                index1 = index1 + 1;
                break;
                
                case 2:
                listado2.add(new Cuadrilatero());
                    System.out.println("--------------Cuadrilatero-------------");
                    listado2.get(index2).calcularArea();
                    listado2.get(index2).calcularPerimetro();
                    System.out.println("---------------------------------------");
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
