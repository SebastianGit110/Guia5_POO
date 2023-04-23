import javax.swing.JOptionPane;

public class Cuadrilatero extends Figura {
    Punto2D vertices[];
    int aux, px, py;
    int[] xVertices, yVertices;
    String titulo;
    int[][] matriz = new int[4][2];
    double determinante, determinante2;


    public Cuadrilatero(){
        vertices = new Punto2D[4];
        xVertices = new int[4];
        yVertices = new int[4];

        for (int conta = 0; conta < 4; conta++) {
            aux = conta + 1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada X del vertice " + aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada Y del vertice " + aux));
            vertices[conta] = new Punto2D(px, py);


            this.xVertices[conta] = px*100;
            this.yVertices[conta] = py*100;


        }
    }



    public int[] XVertices(){
        return this.xVertices;
    }
    public int[] YVertices(){
        return this.yVertices;
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
            determinante += matriz[i][0] * matriz[i + 1][1];
        }
        for (int i = 3; i > 0; i--) {
            determinante2 += matriz[i][0] * matriz[i - 1][1];
        }

        area = (determinante - determinante2) / 2;

        System.out.println("Area cuadrado = " + area * -1);
        return (double) area;
    }

    @Override
    public double calcularPerimetro() {
        double Perimetro, a, b, c, d;
        a = (float) Math.sqrt((Math.pow((vertices[1].getX() - vertices[0].getX()), 2))
                + (Math.pow((vertices[1].getY() - vertices[0].getY()), 2)));
        b = (float) Math.sqrt((Math.pow((vertices[2].getX() - vertices[1].getX()), 2))
                + (Math.pow((vertices[2].getY() - vertices[1].getY()), 2)));
        c = (float) Math.sqrt((Math.pow((vertices[3].getX() - vertices[2].getX()), 2))
                + (Math.pow((vertices[3].getY() - vertices[2].getY()), 2)));
        d = (float) Math.sqrt((Math.pow((vertices[0].getX() - vertices[3].getX()), 2))
                + (Math.pow((vertices[0].getY() - vertices[3].getY()), 2)));
        Perimetro = a + b + c + d;
        System.out.println("Perimetro cuadrado = " + Perimetro);
        return (double) Perimetro;
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }
}
