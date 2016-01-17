package objectrepository;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

public class LoginPage {
	public static Map objects(){
		Map<String,By> map=new HashMap<>();
		map.put("username", By.name("userName"));
		map.put("password", By.name("password"));
		map.put("login", By.name("login"));
		return map;
		
	}

}
