package Creational.Factory_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Circle implements Shape {
	private static final Logger LOGGER=LogManager.getLogger(Circle.class);
	   @Override
	   public void draw() {
	      LOGGER.info("Inside Circle::draw() method.");
	   }
	}