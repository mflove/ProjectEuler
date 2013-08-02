/**
 * @author Matthew Love (mflove1991@gmail.com)
 * Even Fibonacci numbers
 * http://projecteuler.net/problem=2
 **/

package problems;

public class pe002 {

	public static final int TARGET = 4000000;

	public static void main(String[] args) {
		int sum = 0;
		int previous = 0;
		int current = 1;
		while(current <= TARGET) {
			if(current % 2 == 0)
				sum += current;
			
			// xor swap algorithm
			previous ^= current;
			current ^= previous;
			previous ^= current;
			
			current += previous;
		}
		System.out.println(sum); // 4613732
	}

}