import java.util.ArrayList;

public class MyStack {
private ArrayList<String> values= new ArrayList<String>();
public MyStack()
{
	
}
public void push (String value)
{
	values.add(0,value);
}
public String pop()
{
	return values.remove(0);
}
public String peek()
{
	return values.get(0);
}
public boolean isEmpty()
{
	return values.isEmpty();
	
}
}
