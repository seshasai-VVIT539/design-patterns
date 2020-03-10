package Creational.Factory_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Rectangle implements Shape{
	private static final Logger LOGGER=LogManager.getLogger(Rectangle.class);
	@Override
	   public void draw() {
	      LOGGER.info("Inside Rectangle::draw() method.");
	   }
}