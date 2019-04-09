package demo;

import java.security.SecureRandom;

public class RandomDemo {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();
		
		for(int i=1; i<=20; i++) {
			int face = randomNumbers.nextInt(6) + 1;
			
			System.out.printf("%d ", face);
			
			if (i % 5 == 0)
				System.out.println();
		}
	}
}