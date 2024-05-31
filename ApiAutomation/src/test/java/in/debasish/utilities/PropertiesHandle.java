package in.debasish.utilities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesHandle {

	public static Properties loadProperties(String filePath) throws Exception {

		File f=new File(filePath);
		FileReader fr=new FileReader(f);
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
	}
}
