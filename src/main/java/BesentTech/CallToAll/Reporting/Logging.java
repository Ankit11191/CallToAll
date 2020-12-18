package BesentTech.CallToAll.Reporting;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import BesentTech.CallToAll.configuration.PublicContext;

public class Logging {
	public static Logger logger=Logger.getLogger(new Object() {}.getClass().getEnclosingClass());
	static {
		System.setProperty("log.FilePath", PublicContext.logPath);
		System.setProperty("log.timestamp", new SimpleDateFormat("dd_MMM_yyyy").format(new Date()));
		PropertyConfigurator.configure("log4j.properties");
	}
}
