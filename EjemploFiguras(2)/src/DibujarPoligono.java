import java.awt.*;
import javax.swing.*;

public class DibujarPoligono extends JPanel {

    int[] x;
    int[] y;
    int numLados;

    public DibujarPoligono(int[] x, int[] y, int numeroLados){
        this.x = x;
        this.y = y;
        this.numLados = numeroLados;
    }


   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // int[] x = {50, 100, 150, 200, 250}; // Coordenadas x de los vértices
      // int[] y = {200, 100, 150, 100, 200}; // Coordenadas y de los vértices
      Polygon poligono = new Polygon(this.x, this.y, this.numLados); // Crea el polígono con los vértices y la cantidad de lados
      g.setColor(Color.RED); // Define el color del polígono
      g.fillPolygon(poligono); // Dibuja el polígono
   }
}

