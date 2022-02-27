package com.JabaTalks.Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.JabaTalks.BaseClass.Useable_Classes;

public class PropertiesFile {
	
static Properties prop = new Properties();
	
	//Function to Read the Prop.Properties File
	public static void readPropertiesFile() {
		
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\JabaTalks\\Config\\Prop.Properties");
			prop.load(input);
			Useable_Classes.browser = prop.getProperty("browser");
			Useable_Classes.chromeDriverLocation = prop.getProperty("chromeDriverLocation");
			Useable_Classes.firefoxDriverLocation = prop.getProperty("firefoxDriverLocation");
			Useable_Classes.EdgeDriverLocation= prop.getProperty("EdgeDriverLocation");
			Useable_Classes.url = prop.getProperty("url");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}

