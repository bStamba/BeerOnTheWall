package BeerWallPackage;

import java.util.Random;

public class beerMain {

	public static void main(String[] args) {
		//Variables rand for our RNG, we use maxInt as our upper bound limit for our RNG, instantiate our beer class in b, 
		//and pass our random integer into beerNumber to be used in our beerCounter method from the beer class.
		Random rand = new Random();
		int maxInt = 100;
		beer b = new beer();
		int beerNumber = rand.nextInt(maxInt);
		
		//We used our RNG to create a random number between 0 and our maxInt, and now we call our method beerCounter and pass this random integer to it.
		b.beerCounter(beerNumber);		
	}
}
