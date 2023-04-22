package Presentacion;
import javax.swing.JOptionPane;


public class Cuadrilatero extends Figura{
    Punto2D vertices[];
    int aux, px,py;
    String titulo;
    int [][] matriz = new int[4][2];
    double determinante, determinante2;
    
    public Cuadrilatero(){
        vertices = new Punto2D[4];
        for(int conta=0;conta<4;conta++){
            aux =conta+1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada X del vertice "+aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada Y del vertice "+aux));
            vertices[conta]= new Punto2D(px,py);
        }
    }
    @Override
    public double calcularArea() {

        double area;

        // Genera una matriz para las coordenadas x,y
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = (int) vertices[i].getX();
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][1] = (int) vertices[i].getY();
            }
        }

        // Calcula el determinante

        for (int i = 0; i < 3; i++) {
            determinante += matriz[i][0] * matriz[i+1][1];
        }
        for (int i = 3; i > 0; i--) {
            determinante2 += matriz[i][0] * matriz[i-1][1];
        }

        area = (determinante-determinante2)/2;

        System.out.println("Area cuadrado = " + area*-1);
        return (double)area;
    }
    
    @Override
    public double calcularPerimetro() {
        int Perimetro, BASE, ALTURA;
        BASE = (int) vertices[1].getX() - vertices[0].getX();
        ALTURA = (int) vertices[1].getY() - vertices[0].getY();
        Perimetro = BASE*2 + ALTURA*2;
        System.out.println("Perimetro cuadrado = " + Perimetro);
        return (double)Perimetro;
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
