import java.util.Random;

public class randomness {
	
	Random numberGenerater = new Random();
	Random numberGen = new Random();

	public boolean truth() {

		return numberGen.nextBoolean();

	}

	public int randomNumber() {

		int number = numberGenerater.nextInt(10) + 1;
		return number;

	}
}
