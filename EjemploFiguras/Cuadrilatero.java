package Presentacion;
import javax.swing.JOptionPane;
public class Cuadrilatero extends Figura{
    Punto2D vertices[];
    int aux, px,py;
    String titulo;
    public Cuadrilatero(){
        vertices = new Punto2D[4];
        for(int conta=0;conta<2;conta++){
            aux =conta+1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada X del vertice "+aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada Y del vertice "+aux));
            vertices[conta]= new Punto2D(px,py);
        }
    }
    @Override
    public int calcularArea() {
        double area, BASE, ALTURA;
        BASE = (float) vertices[1].getX() - vertices[0].getX();
        ALTURA = (float) vertices[1].getY() - vertices[0].getY();
        area = BASE * ALTURA;
        System.out.println("Area cuadrado = " + area);
        return (int)area;
    }
    
    @Override
    public int calcularPerimetro() {
        double Perimetro, BASE, ALTURA;
        BASE = (float) vertices[1].getX() - vertices[0].getX();
        ALTURA = (float) vertices[1].getY() - vertices[0].getY();
        Perimetro = BASE*2 + ALTURA*2;
        System.out.println("Perimetro cuadrado = " + Perimetro);
        return (int)Perimetro;
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
