package call.utils;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class ImageUtils
{
	public static BufferedImage cloneImage(BufferedImage image)
	{
		ColorModel model = image.getColorModel();
		boolean isAlpha = model.isAlphaPremultiplied();
		WritableRaster raster = image.copyData(null);
		return new BufferedImage(model, raster, isAlpha, null);
	}
}
