package Listing5;

class Factorial {
    // Этот метод вычисляет факториал при помощи цикла
    long computeI(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Этот метод вычисляет факториал при помощи рекурсии
    long computeR(int n) {
        if (n == 1) {
            return n;
        }
        return computeR(n - 1) * n;
    }
}

class RecursionDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("факториал, рассчитанный в цикле ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + f.computeI(i));
        }
        System.out.println("Факториал, рассчитанный с помощью рекурсии");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + f.computeR(r));
        }
    }
}