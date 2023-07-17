package BeerWallPackage;

public class beer {

	//Method that is going to take our number of bottles as an integer argument, and use that number
	//to iterate through our song while decrementing the number of bottles of beer on the wall until we reach 0.
	public void beerCounter(int numBottles) {
		int beerCounter = numBottles;
		String bots = " bottles ";
		//Loop to output our beer song until there are no bottles of beer left.
		while (beerCounter >= 0) {
					
			//If there is at least 1 bottle left, sing the song and decrement the beerCounter.
			if (beerCounter >= 1) {
				System.out.print(beerCounter + bots + "of beer on the wall, " + beerCounter + bots + "of beer... take one down, pass it around, ");
				beerCounter = beerCounter - 1;				
				
				//For this specific case we want it to be singular for correct English.
				if (beerCounter == 1) {bots = " bottle ";}				
				//For this specific case we want to change to plural for correct English.
				if (beerCounter == 0) {bots = " bottles ";}		
				
				System.out.print(beerCounter + bots + "of beer on the wall.");
				System.out.println();				
			}			
			// If there's no bottles left, let it be known and exit the while loop.
			else {
				System.out.println("No more" + bots + "of beer on the wall!!!");
				break;
			}		
		}
	}
}
