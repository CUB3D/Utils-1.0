package call.utils;

public class CommandLineUtils
{
	public static Process exec(String command)
	{
		Runtime r = Runtime.getRuntime();

		switch(OSUtils.getOS())
		{
		case WINDOWS:
			try
			{
				return r.exec("cmd.exe /c " + command);
			}catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
		case LINUX:
			try
			{
				return r.exec("/bin/bash -c \"" + command + "\"");
			}catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
		default:
			return null;
		}
	}
}
