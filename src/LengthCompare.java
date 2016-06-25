import java.util.Comparator;

public class LengthCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(((String) o1).length()>((String) o2).length())
		{
			return 1;
		}
		else if(((String) o1).length()<((String) o2).length())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
