public class str {

    public static void main(String[] args) {
        System.out.println("Strong numbers from 1 to 5000:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

   
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

                while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

                return sumOfFactorials == originalNumber;
    }

        public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}