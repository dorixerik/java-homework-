import java.util.Scanner;

    public static void printFigure(int h) {
        
        System.out.println("*");

     
        for (int i = 1; i <= h - 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

      
        System.out.print("*");
        for (int j = 1; j <= h - 2; j++) {
            System.out.print("-");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите h (h >= 3): ");
        int h = scanner.nextInt();
       
        while (h < 3) {
            System.out.print("h должно быть не меньше 3, введите ещё раз: ");
            h = scanner.nextInt();
        }

        printFigure(h);
    }
