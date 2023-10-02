public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(FibonacciNumber.fibonacciSolution(4));
    }

    public static int fibonacciSolution(int n) {
        int i = 0;
        int a = 1;
        int b = 0;

        if (n == 0) return 0;

        while (i < (n - 1)) {
            int aux = a + b;
            b = a;
            a = aux;
            i++;
        }
        return a;
    }
}