package epams;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Task4 {

	public static void main(String[] args) {

		Properties prop=new Properties();
		try (var fileReader = new FileReader("src/main/resources/config.properties")) {
			prop.load(fileReader);
			System.out.println(prop.getProperty("datasource.database.username","default.username"));
			System.out.println(prop.getProperty("datasource.database.password","default.password"));
			System.out.println(prop.getProperty("datasource.database.url","default.url"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

