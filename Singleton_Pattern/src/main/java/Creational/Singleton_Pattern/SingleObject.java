package Creational.Singleton_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SingleObject {
	private static final Logger LOGGER=LogManager.getLogger(SingleObject.class);
	   private static SingleObject instance = new SingleObject();
	   private SingleObject(){}
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      LOGGER.info("Hello World!");
	   }
}