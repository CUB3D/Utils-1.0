package call.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils
{
	public static boolean contains(int[] arry, int item)
	{
		for(int i : arry)
			if(i == item)
				return true;
		
		return false;
	}
	
	public static boolean contains(String[] arry, String item)
	{
		for(String s : arry)
			if(s.equals(item))
				return true;
		
		return false;
	}
	
	
	
	public static String join(Object[] obj, String delimit)
	{
		return join(obj, delimit, obj.length);
	}
	
	public static String join(Object[] obj, String delimit, int length)
	{
		String s = "";
		
		for(int i = 0; i < length; i++)
			s += obj[i].toString() + delimit;
		
		return s;
	}
	
	
	
	public static <A> List<A> listOf(A[] objs)
	{
		List<A> list = new ArrayList<A>();
		
		for(A a : objs)
			list.add(a);
		
		return list;
	}
	
	public static List<Integer> listOf(int[] objs)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int a : objs)
			list.add(a);
		
		return list;
	}
	
	public static List<Character> listOf(char[] objs)
	{
		List<Character> list = new ArrayList<Character>();
		
		for(char a : objs)
			list.add(a);
		
		return list;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static <A> A[] arrayOf(List<A> objs)
	{
		return (A[]) objs.toArray();
	}
	
	
	
	public static int[] toPrimitiveInteger(List<Integer> objs)
	{
	    int[] ret = new int[objs.size()];
	    
	    for (int i = 0; i < objs.size(); i++)
	        ret[i] = objs.get(i);
	    
	    return ret;
	}
	
	public static char[] toPrimitiveCharacter(List<Character> objs)
	{
		char[] ret = new char[objs.size()];
	    
	    for (int i = 0; i < objs.size(); i++)
	        ret[i] = objs.get(i);
	    
	    return ret;
	}
}
