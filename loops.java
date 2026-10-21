
public class Task4Loops {

    public static double calcSum() {
        double sum = 0;
        
        for (int i = 0; i <= 10; i++) {
            double x = 1 + i * 0.1;
            sum = sum + Math.sin(x);
        }
        return sum;
    }

    public static void main(String[] args) {
        double y = calcSum();
        System.out.println("y = " + y);
    }
}
