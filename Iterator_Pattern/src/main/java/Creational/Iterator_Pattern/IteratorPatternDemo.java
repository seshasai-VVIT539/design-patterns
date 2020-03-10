package Creational.Iterator_Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class IteratorPatternDemo {
	private static final Logger LOGGER=LogManager.getLogger(IteratorPatternDemo.class);
	public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         LOGGER.info("Name : " + name);
	      } 	
	   }
}