package call.utils;

import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Utils
{
	public static byte[] compress(String s)
	{
		try
		{
			byte[] input = s.getBytes("UTF-8");

			Deflater def = new Deflater();
			def.setInput(input);
			def.finish();

			byte[] out = new byte[input.length * 2];

			int len = def.deflate(out);

			byte[] output = new byte[len];

			System.arraycopy(out, 0, output, 0, len);

			return output;

		}catch(Exception e) {e.printStackTrace(); return new byte[0];}
	}

	public static String uncompress(byte[] input)
	{	
		try
		{
			Inflater inf = new Inflater();
			inf.setInput(input, 0, input.length);
			byte[] out = new byte[input.length * 2];
			int len = inf.inflate(out);
			inf.end();
			
			byte[] output = new byte[len];
			System.arraycopy(out, 0, output, 0, len);
			
			return new String(output);
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}

	public static String getArgumentValue(String name, String[] args, String def)
	{
		if(args == null)
			return def;
		
		for(String s : args)
			if(s.startsWith("-"+name+":"))
				return s.replaceFirst("-"+name+":", "");
		return def;
	}
}
