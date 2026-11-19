public class Primes {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");

        // Outer loop checks each candidate number from 2 to 500 (1 is not prime)
        for (int num = 2; num <= 500; num++) {
            boolean isPrime = true;

            // Only need to check divisors up to the square root of num
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break; // No need to check further divisors once one is found
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}