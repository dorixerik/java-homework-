import java.util.Scanner;


public class Task4Series {

    /**
     * 1) Сумма n слагаемых
     */
    public static double sumOfN(double x, int n) {
        double a = 1;     // a(0)
        double sum = 1;
        for (int i = 1; i < n; i++) {
            a = a * (-(i + 1.0) / i) * x;   // a(i) через a(i-1)
            sum = sum + a;
        }
        return sum;
    }

\
    public static double sumWithEps(double x, double eps) {
        double a = 1;     // a(0)
        double sum = 0;
        int i = 0;
        while (Math.abs(a) > eps) {
            sum = sum + a;
            i++;
            a = a * (-(i + 1.0) / i) * x;   // a(i) через a(i-1)
        }
        return sum;
    }

    public static double exact(double x) {
        return 1 / Math.pow(1 + x, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x (-1 < x < 1): ");
        double x = scanner.nextDouble();
        while (x <= -1 || x >= 1) {
            System.out.print("x должен быть в интервале (-1; 1), введите ещё раз: ");
            x = scanner.nextDouble();
        }

        System.out.print("Введите n (n >= 1): ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.print("n должно быть не меньше 1, введите ещё раз: ");
            n = scanner.nextInt();
        }

        System.out.print("Введите e (0 < e < 1): ");
        double e = scanner.nextDouble();
        while (e <= 0 || e >= 1) {
            System.out.print("e должно быть в интервале (0; 1), введите ещё раз: ");
            e = scanner.nextDouble();
        }

        System.out.println("1) Сумма n слагаемых:         " + sumOfN(x, n));
        System.out.println("2) Сумма слагаемых > e:       " + sumWithEps(x, e));
        System.out.println("3) Сумма слагаемых > e/10:    " + sumWithEps(x, e / 10));
        System.out.println("4) Значение через Math:       " + exact(x));
    }
}