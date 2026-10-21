
public class Task4Loops {

    public static double calcSum() {
        double sum = 0;
        // Шагов от 1 до 2 с шагом 0.1 получается 11 (i = 0..10).
        // x считаем как 1 + i * 0.1, а не прибавляем 0.1 каждый раз,
        // чтобы не копилась погрешность вещественных чисел.
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