package BesentTech.CallToAll.configuration;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public String getPropertiesfor(String key) {
		FileReader fileReader = null;
		Properties properties=new Properties();
		try {
			fileReader=new FileReader("./configProp/config.myproperties");
			properties.load(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String property = properties.getProperty(key);
		return property;
	}
}
