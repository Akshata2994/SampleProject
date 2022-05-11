package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import Test.SampleCode;


public class PropertiesFile{
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		
		
		writePropertiesFile();
		readPropertiesFile();
	}	
		
	public static void readPropertiesFile()
	{
		
		
		try
		{
		FileInputStream input = new FileInputStream("C:\\Users\\aksha\\eclipse-workspace\\SeleniumSampleProject\\src\\test\\java\\Config\\Config.properties");
		
		prop.load(input);
		
		System.out.println(prop.getProperty("browser"));
		
		SampleCode.browser = prop.getProperty("browser");
		
		System.out.println(SampleCode.browser);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
     }
	
	public static void writePropertiesFile()
	{
		
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\aksha\\eclipse-workspace\\SeleniumSampleProject\\src\\test\\java\\Config\\Config.properties");
			prop.setProperty("browser","Chrome");
			prop.store(output, null);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


