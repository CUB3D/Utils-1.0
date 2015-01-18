package call.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
	public static File getFile(String name)
	{
		File f = new File(name);

		try
		{
			if(f.getParentFile() != null)
				f.getParentFile().mkdirs();
			f.createNewFile();
		}catch(Exception e) {e.printStackTrace();}

		return f;
	}

	public static File getFile(File parent, String name)
	{
		File f = new File(parent, name);

		try
		{
			if(f.getParentFile() != null)
				f.getParentFile().mkdirs();
			f.createNewFile();
		}catch(Exception e) {e.printStackTrace();}

		return f;
	}

	public static File getDirectory(String name)
	{
		File f = new File(name);

		try
		{
			f.mkdir();
		}catch(Exception e) {e.printStackTrace();}

		return f;
	}

	public static File getDirectory(File parent, String name)
	{
		File f = new File(parent, name);

		try
		{
			f.mkdir();
		}catch(Exception e) {e.printStackTrace();}

		return f;
	}
	
	
	public static List<File> getFilesRecursive(File base)
	{
		List<File> files = new ArrayList<File>();
		
		for(File f : base.listFiles())
		{
			if(f.isDirectory())
				files.addAll(getFilesRecursive(f));
			else
				files.add(f);
		}
		
		return files;
	}
}
