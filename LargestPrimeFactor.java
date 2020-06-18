package java_masterclass;

public class LargestPrimeFactor {
    public static int getLargestPrimeFactor(int number) {
        if (number <= 1) {      // number is negative or does not have any prime numbers (0 and 1)
            return -1;
        }

//        int largestPrimeFactor = 0;
//        for (int i = 2; i <= number; i++) {
//            if (isPrime(i) && number % i == 0) {          // a prime factor should be (1): prime
//                largestPrimeFactor = i;                   //                          (2): can divide the number
//            }
//        }
//        return largestPrimeFactor;

        int largestPrimeFactor = 0;
        for (int i = 2; i <= number; i++) {

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;                      // false: current i is not prime
                }
            }
            if (isPrime && number % i == 0) {   // current i is a (1) prime
                largestPrimeFactor = i;         //                (2) can divide the number
            }

        }
        return largestPrimeFactor;


    }

//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


    public static void main(String[] args) {
//        System.out.println(isPrime(1));                 // false
//        System.out.println(isPrime(2));                 // true
//        System.out.println(isPrime(3));                 // true
//        System.out.println(isPrime(4));                 // false
//        System.out.println(isPrime(6));                 // false
//        System.out.println(isPrime(31));                // true

        System.out.println(getLargestPrimeFactor(21));        // 7
        System.out.println(getLargestPrimeFactor(217));       // 31
        System.out.println(getLargestPrimeFactor(0));         // -1
        System.out.println(getLargestPrimeFactor(45));        // 5
        System.out.println(getLargestPrimeFactor(-1));        // -1
        System.out.println(getLargestPrimeFactor(7));         // 7

    }
}
