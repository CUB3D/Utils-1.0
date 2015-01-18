package call.utils;

import java.awt.Graphics;
import java.awt.Toolkit;

public class StringUtils
{
	@SuppressWarnings("deprecation")
	public static int getStringLengthInPixels(String s, Graphics g)
	{
		return Toolkit.getDefaultToolkit().getFontMetrics(g.getFont()).stringWidth(s);
	}
}
