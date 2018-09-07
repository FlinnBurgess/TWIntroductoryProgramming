import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Unused imports.
public class PrimeFactors {
    public void generate(int n) {
        List<Integer> primes = sieveOfEratosthenes(n);

        for (int prime : primes) {
            if (n % prime == 0) {
                System.out.println(prime);
            }
        }
    }


    // Method for finding prime numbers less than n, taken from https://www.baeldung.com/java-generate-prime-numbers
    private List<Integer> sieveOfEratosthenes(int n) {
        // TODO
        // While this is a great solution - it's generally better to have properly named variables
        // that explain what they mean to better understand what the code is doing.
        // I'm sure you understand this, but I'd like you to have a look at improving this code by separating it better
        // and using better variables names
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
