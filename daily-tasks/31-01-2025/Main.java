package javaassignments;

import java.util.*;

public class Main {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        input = input.trim();
        if (input.endsWith(";")) {
            input = input.substring(0, input.length() - 1);
        }
        String[] numbers = input.split(" ");
        List<Integer> primes = new ArrayList<>();
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        Collections.sort(primes);
        int totalPrimes = primes.size();
        int secondLargestPrime = primes.get(totalPrimes - 2);
        int result = totalPrimes + secondLargestPrime;
        System.out.println(result);
    }
}

