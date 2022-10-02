package utility;

import org.apache.log4j.Logger;

public class LogExample {
	
	 static Logger log = Logger.getLogger(LogExample.class.getName()); 
	
		public static void main(String[] args) {
			
			log.debug("Hello debug");
			log.info("hii info mesg");
			
		}
		
	

}
