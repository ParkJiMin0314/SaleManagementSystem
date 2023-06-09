package sale;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	private static final Formatter SimpleFormatter = null;
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}
