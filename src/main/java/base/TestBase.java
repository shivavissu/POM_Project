package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() {
		prop= new Properties();
		String path=System.getProperty("user.dir");
		//		+ //source//test//resources//configFiles
				
				FileInputStream fin;
		try {
		fin= new FileInputStream(path);
				prop.load(fin);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	
			public static void initialize()	{
			
		}
		
		
	}

}
