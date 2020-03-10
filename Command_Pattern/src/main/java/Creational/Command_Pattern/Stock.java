package Creational.Command_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Stock {
	private static final Logger LOGGER=LogManager.getLogger(Stock.class);
	private String name = "ABC";
	   private int quantity = 10;

	   public void buy(){
	      LOGGER.info("Stock [ Name: "+name+"Quantity: " + quantity +" ] bought");
	   }
	   public void sell(){
	      LOGGER.info("Stock [ Name: "+name+"Quantity: " + quantity +" ] sold");
	   }
}