package Presentacion;
import javax.swing.JOptionPane;
public class Triangulo extends Figura {
    Punto2D vertices[];
    int aux,px,py;
    public Triangulo(){
        vertices = new Punto2D[3];
        for(int conta=0;conta<3;conta++){
            aux =conta+1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Triangulo - Digite coordenada X del vertice "+aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Triangulo- Digite coordenada Y del vertice "+aux));
            vertices[conta]= new Punto2D(px,py);
        }
    } 
    @Override
    public int calcularArea() {
       double area, A,B,C,Perimetro; 
       A= (float) Math.sqrt((Math.pow((vertices[1].getX()-vertices[0].getX()),2))
               +(Math.pow((vertices[1].getY()-vertices[0].getY()),2)));
       B= (float) Math.sqrt((Math.pow((vertices[2].getX()-vertices[1].getX()),2))
               +(Math.pow((vertices[2].getY()-vertices[1].getY()),2)));
       C= (float) Math.sqrt((Math.pow((vertices[0].getX()-vertices[2].getX()),2))
               +(Math.pow((vertices[0].getY()-vertices[2].getY()),2)));
       Perimetro=(A+B+C)/2;
       area=Math.sqrt(Perimetro*(Perimetro-A)*(Perimetro-B)*(Perimetro-C));
       System.out.println("Area triangulo = " + area);
       return (int)area;
    }

    @Override
    public int calcularPerimetro() {
       double A,B,C,Perimetro; 
       A= (float) Math.sqrt((Math.pow((vertices[1].getX()-vertices[0].getX()),2))
               +(Math.pow((vertices[1].getY()-vertices[0].getY()),2)));
       B= (float) Math.sqrt((Math.pow((vertices[2].getX()-vertices[1].getX()),2))
               +(Math.pow((vertices[2].getY()-vertices[1].getY()),2)));
       C= (float) Math.sqrt((Math.pow((vertices[0].getX()-vertices[2].getX()),2))
               +(Math.pow((vertices[0].getY()-vertices[2].getY()),2)));
       Perimetro=(A+B+C);
       System.out.println("Perimetro triangulo = " + Perimetro);
       return (int)Perimetro;
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
