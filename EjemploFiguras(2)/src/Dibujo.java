import java.awt.Graphics;

public class Dibujo {
    public static void HacerLinea(Graphics g, int x1, int x2, int x3, int y1, int y2, int y3)
    {
        int xPoints[] = new int[3];
        xPoints[0] = x1;
        xPoints[1] = x2;
        xPoints[2] = x3;

        int yPoints[] = new int[3];
        yPoints[0] = y1;
        yPoints[1] = y2;
        yPoints[2] = y3;

        g.drawPolygon(xPoints, yPoints, 3);
    }
}
