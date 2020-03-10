package Creational.Bridge_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RedCircle implements DrawAPI {
	private static final Logger LOGGER=LogManager.getLogger(RedCircle.class);
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      LOGGER.info("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
