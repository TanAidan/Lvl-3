import java.util.ArrayList;
import java.util.Scanner;

public class FindRange {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	ArrayList<Integer> list= new ArrayList<Integer>();
	System.out.println("This program finds the highest and lowest numbers");
	while(scan.hasNext())
	{
		System.out.print("?");
		list.add(scan.nextInt());
		if(list.contains(0))
		{
			
			break;
		}
	}
	if(findLargest(list)==0)
		
	{
	System.out.println("Please enter a number other than 0.");
	}
	else{
	System.out.println("smallest: "+findSmallest(list));
	System.out.println("largest: "+findLargest(list));
	}
}

public static int findLargest(ArrayList<Integer> list)
{
	int tallest=list.get(0);
	for (int i = 1; i <list.size(); i++) {
		if(list.get(i)>tallest){
			tallest=list.get(i);
		}
	
	}
	return tallest;
}
	public static int findSmallest(ArrayList<Integer> list)
	{
		int smallest=list.get(0);
		for (int i = 1; i <list.size()-1; i++) {
			if(list.get(i)<smallest)
			{
				smallest=list.get(i);
			}
		
	}
		return smallest;
}
}

