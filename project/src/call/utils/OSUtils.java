package call.utils;

public class OSUtils
{
	private static final String OSName = System.getProperty("os.name").toLowerCase();

	private static EnumOS OS = null;

	public static EnumOS getOS()
	{
		if(OS == null)
		{
			if(OSName.contains("win"))
				OS = EnumOS.WINDOWS;
			else
				if(OSName.contains("mac"))
					OS = EnumOS.MAC;
				else
					if(OSName.contains("lin"))
						OS = EnumOS.LINUX;
					else
						OS = EnumOS.UNKNOWN;
		}

		return OS;
	}
	
	public static String getOSName()
	{
		return OSName;
	}
}
