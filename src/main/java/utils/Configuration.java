package utils;

import java.util.Properties;

public class Configuration {
Properties properties =new Properties ();

public Configuration() {
	loadproperty();
}

public void loadproperty() {
	try {
		properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public String getProperties(String key) {
	return properties.getProperty(key);
}
}
