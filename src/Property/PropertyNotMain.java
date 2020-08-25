package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyNotMain {
	
	public static String doesfileexist(String path) {
			  
			 try { 
			  String path1="Data\\final.prop";
			  
			 Properties prop=new Properties();
			  
			  FileInputStream fis=new  FileInputStream(path1);
			  prop.load(fis);
			 return prop.getProperty(path);
			
		  }catch(IOException e) {
			 System.out.println("file not found");
			  return null;
		  }
		}
}
		
		
			
	


