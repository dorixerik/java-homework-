import java.util.Scanner;


public class Program {

  
    public static final Line L5 = new Line(0, 6, 4);

    public static final Rectangle R5 = new Rectangle(-3, 0, 7, 8);

    public static final Circle C5 = new Circle(-2, 3, 2);

    public static SimpleColor getColor(double x, double y) {
       
        if (L5.isPointAboveLine(x, y)) {
            if (R5.isPointInside(x, y)) {
                return SimpleColor.GREEN;
            }
            return SimpleColor.WHITE;
        }

        if (R5.isPointInside(x, y)) {
            if (C5.isPointInside(x, y)) {
                return SimpleColor.BLUE;
            }
            return SimpleColor.ORANGE;
        }
        return SimpleColor.BLUE;
    }


    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
    }

    public static void main(String[] args) {
       
        printColorForPoint(-6, 5);      
        printColorForPoint(-8, -8);   
        printColorForPoint(-2, 5);      
        printColorForPoint(2, 3);       
        printColorForPoint(-0.5, 2);    
        printColorForPoint(5, -5);      
        printColorForPoint(9, 9);      
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = scanner.nextDouble();
        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}
