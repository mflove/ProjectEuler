/**
 * @author Matthew Love (mflove1991@gmail.com)
 * Multiples of 3 and 5
 * http://projecteuler.net/problem=1
 **/

package problems;

public class pe001 {

	public static final int TARGET = 1000;

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < TARGET; i++)
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		System.out.println(sum); // 233168
	}

}