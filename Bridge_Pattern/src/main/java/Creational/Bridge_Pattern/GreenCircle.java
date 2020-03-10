package Creational.Bridge_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreenCircle implements DrawAPI {
	private static final Logger LOGGER=LogManager.getLogger(GreenCircle.class);
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	     LOGGER.info("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}