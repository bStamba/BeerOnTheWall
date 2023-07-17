package BeerWallPackage;

public class beer {

	//Method that is going to take our number of bottles as an integer argument, and use that number
	//to iterate through our song while decrementing the number of bottles of beer on the wall until we reach 0.
	public void beerCounter(int numBottles) {
		int beerCounter = numBottles;
		
		//Loop to output our beer song until there are no bottles of beer left.
		while (beerCounter >= 0) {
			//If there is at least 1 bottle left, sing the song and decrement the beerCounter.
			if (beerCounter > 0) {
			System.out.println(beerCounter + " bottles of beer on the wall, " + beerCounter + " bottles of beer... take one down, pass it around, ");
			beerCounter = beerCounter - 1;
			System.out.print(beerCounter + " bottles of beer on the wall.");
			}
			// If there's no bottles left, 
			else {
				System.out.println("No more bottles of beer on the wall!!!");
				break;
			}		
		}
	}
}
