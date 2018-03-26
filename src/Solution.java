import java.util.LinkedList;
import static java.lang.Math.sqrt;

public class Solution {


    // Returns all prime numbers up to int range. Redundant calculations!
    public static LinkedList<Integer> findPrimeNumbers1(int range) {

        int[] markedArray = new int[range+1];
        LinkedList<Integer> primes = new LinkedList<Integer>();

        // Fill markedArray with all numbers from 0 to int range.
        for (int i = 1; i<=range; i++) {

            markedArray[i]=i;
        }

        // Mark all numbers in int[] markedArray, which fall through the sieve as "-1".
        for (int i = 2; i <= sqrt(range); i++) {

            int k = 2;

            while (k*i <= range) {

                markedArray[k*i] = -1;

                k++;
            }
        }

        // Fill primes with prime numbers.
        for (int i = 2; i <= range; i++) {

            if (markedArray[i] != -1) {
                primes.add(markedArray[i]);
            }
        }

        System.out.println(primes);

        return primes;
    }




}