public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(ClimbingStairs.solutionStairs(1));
    }
    public static int solutionStairs(int n) {
        int i = 0;
        int a = 1;
        int b = 0;

        while (i < n) {
            int aux = a + b;
            b = a;
            a = aux;
            i++;
        }
        return a;
    }
}
