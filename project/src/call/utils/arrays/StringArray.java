package call.utils.arrays;

public class StringArray
{
	private String[] array;
	private int pos = 0;
	
	public StringArray()
	{
		this(16);
	}
	
	public StringArray(int size)
	{
		this(new String[size]);
	}
	
	public StringArray(String[] strs)
	{
		this.array = strs;
	}
	
	public void add(String s)
	{
		array[pos] = s;
		
		pos++;
		
		if(pos >= array.length - 1)
		{
			String[] nArray = new String[array.length + 1];
			
			System.arraycopy(array, 0, nArray, 0, array.length);
			
			array = nArray;
		}
	}
	
	public String[] getArray()
	{
		return array;
	}
	
	public String get(int i)
	{
		return array[i];
	}
	
	public int size()
	{
		return pos;
	}
	
	public void clear()
	{
		this.array = new String[array.length];
		this.pos = 0;
	}
}
