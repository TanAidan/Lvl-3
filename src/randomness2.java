import java.util.Random;

public class randomness2 {
	
	
	Random numbergen= new Random();
	Random numbergenerator = new Random();
	public boolean Random(){
		
		return numbergen.nextBoolean();
		
	}
	public int numbers()
	{
		int num= numbergenerator.nextInt(10)+1;
		return num;
	}
}
