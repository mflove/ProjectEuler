/**
 * @author Matthew Love (mflove1991@gmail.com)
 * Largest prime factor
 * http://projecteuler.net/problem=3
 **/

package problems;

import java.util.ArrayList;

public class pe003 {

	public static final long TARGET = 600851475143L;

	public static void main(String[] args) {
		ArrayList<Integer> factors = primeFactorize(TARGET);
		System.out.println(factors.get(factors.size() - 1)); // 6857
	}
	
	// trial division for prime factorization
	public static ArrayList<Integer> primeFactorize(long n) {
		ArrayList<Integer> primes = sievePrimes((int) Math.sqrt(n) + 1);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int p : primes)
			if(p * p <= n)
				while(n % p == 0) {
					factors.add(p);
					n /= p;
				}
		if(n > 1)
			factors.add((int) n);
		return factors;
	}

	// sieve of eratosthenes
	public static ArrayList<Integer> sievePrimes(int n) {
		boolean[] used = new boolean[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i < n; i++)
			if(!used[i]) {
				list.add(i);
				for(int j = i * i; j < n && j > 0; j += i)
					used[j] = true;
			}
		return list;
	}
	
}