package com.test.DevOpsTest.propertiesEdit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

public class PropertyManager {
	String result = "";
	InputStream inputStream;
	FileOutputStream fos;
	Path path;
	String propFileName;
	Properties props;
	public String getPropValues() throws IOException {
 
		try {
			path = Paths.get(".//resources//config//");
			props = new Properties();
			propFileName = "config.properties";
			System.out.println(getClass().getClassLoader());
			inputStream = new FileInputStream(path.resolve(propFileName).toFile()); //getClass().getClassLoader().getResourceAsStream();
			//PropertiesConfiguration properties = new PropertiesConfiguration("C://demo//config.properties");
			if (inputStream != null) {
				props.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String user = props.getProperty("user");
			String company1 = props.getProperty("company1");
			String company2 = props.getProperty("company2");
			String company3 = props.getProperty("company3");
 
			result = "Company List = " + company1 + ", " + company2 + ", " + company3;
			System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	public void setPropertieValues(String key, String Value) throws IOException {
		//props = new Properties();
        fos = new FileOutputStream(path.resolve(propFileName).toFile());    
        props.setProperty(key, Value);
        
	}
	public void closeStream() throws IOException {
		props.store(fos, "Properties file update");
		fos.close();
	}
}
