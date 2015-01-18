package call.utils;

public enum EnumOS
{
	WINDOWS("Windows"),
	MAC("Macintosh"),
	LINUX("Linux"),
	UNKNOWN("Unknown");
	
	private String name;
	
	private EnumOS(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
