package recursiongoodluck;

public class RecursionGOODLUCK {

    public static int Sumation(int n) {
        // Base case: WE ARE AT THE END
        if (n <= 0) {
            return 0; // additive identy property
        } // Recursive Case: KEEPGOING
        else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            int sumFactorial = n + Sumation(n - 1);

            return sumFactorial;
        }
    }

    // 5! --> 5 + 4 + 3 + 1
    public static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
        } // Recursive Case:
        else {
            int factorialResult = n * Factorial(n - 1);
            return factorialResult;
        }
    }

    // 5^2 = 5 * 5
    public static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) { // mult identity
            return 1;
        } // Recursive Case:
        else {
            int expResult = n * Exponentiation(n, p - 1);
            return expResult;
        }
    }

    public static void main(String[] args) {
        // f(f(f(a))) -- a = 20
        // f(a) = 5 + a
        // f(20) = 5 + 20 = 25

        // f(f(f(20))) -- f(f(25))
        // f(25) = 5 + 25 = 30
        // f(f(f(20))) -- f(f(25)) -- f(30))
        // f(30) = 5 + 30 = 35
        // f(f(f(20))) -- f(f(25)) -- f(30)) -- 35
        // 5+4+3+2+1;
        System.out.println(Sumation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5, 3));

    }

}
