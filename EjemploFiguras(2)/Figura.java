package Presentacion;


public abstract class Figura {
    private String color, descripcion;
    public String getColor() {
        return color;
    }
    public void setColor(String colorX) {
        this.color = color;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     public abstract double calcularArea();
     public abstract double calcularPerimetro();
     public abstract void reDibujar();
}
