package call.utils.arrays;

public class IntArray
{
	private int[] array;
	private int pos = 0;
	
	public IntArray()
	{
		this(16);
	}
	
	public IntArray(int size)
	{
		this(new int[size]);
	}
	
	public IntArray(int[] ints)
	{
		this.array = ints;
	}
	
	public void add(int i)
	{
		array[pos] = i;
		
		pos++;
		
		if(pos >= array.length - 1)
		{
			int[] nArray = new int[array.length + 1];
			
			System.arraycopy(array, 0, nArray, 0, array.length);
			
			array = nArray;
		}
	}
	
	public int[] getArray()
	{
		return array;
	}
	
	public int get(int i)
	{
		return array[i];
	}
	
	public int size()
	{
		return pos;
	}
	
	public void clear()
	{
		this.array = new int[array.length];
		this.pos = 0;
	}
}
