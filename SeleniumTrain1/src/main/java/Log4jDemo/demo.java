package Log4jDemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class demo {
   private static Logger logger= LogManager.getLogger(demo.class);
    public static void main(String[] args)
    {
System.out.println("Hello");
logger.trace("this is trace");
logger.info("This is information");
logger.warn("this is a warning");
logger.error("error");
logger.fatal("fatal");

    }
}
