
public class fib {
public static void main(String[] args) {
	long currentminus2=0;
	long currentminus1=1;
	long current;
	
		for (int i = 0; i < 50; i++)
	{
			
			current=currentminus2+currentminus1;
			currentminus2=currentminus1;
			currentminus1=current;
			current=currentminus1+currentminus2;
		
	
System.out.println(currentminus2);
	}
}
}
